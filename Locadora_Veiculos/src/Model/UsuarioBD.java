package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class UsuarioBD {

	// Cria componentes
	private Connection conn = null;
	private Statement query;
	private String sql;
	private Statement query2;
	private String sql2;


	public UsuarioBD() {

		try {

			this.conn = ConnectionFactory.getConexao(1, "postgres", "postgres");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public Usuario buscaLogin(String login, String senha) {

		// Cria novo objeto
		Usuario usuario = new Usuario();

		// Define SQL
		sql = "SELECT * FROM LOGINS WHERE LOGIN = '" + login + "' AND PASSWORD = '" + senha + "'"
				+ "AND TIPO = '" + "Usu·rio" + "'";

		try {

			// Associa conex√£o e executa SQL
			query = conn.createStatement();
			ResultSet rs = query.executeQuery(sql);

			// Recupera dados do set
			while (rs.next()) {
				usuario.setLogin(rs.getString("LOGIN"));
				usuario.setSenha(rs.getString("PASSWORD"));
				usuario.setTipo(rs.getString("TIPO"));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		// Retorna objeto
		return usuario;
	}
	
	
	public boolean inserirUsuario(Pessoa pessoa) {
		// Define SQL
		sql = "INSERT INTO PESSOA VALUES (DEFAULT,?, NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		sql2 = "INSERT INTO LOGINS VALUES (?, ?, ?, ?)";

		try {

			// Prepara SQL e alimenta parametros
			PreparedStatement query = conn.prepareStatement(sql);
			query.setString(1, pessoa.getNome());
			query.setString(2, pessoa.getEmail());
			query.setInt(3, pessoa.getCpf());
			query.setString(4, pessoa.getSexo());
			query.setInt(5, pessoa.getTelefone());
			query.setString(6, pessoa.getRua());
			query.setString(7, pessoa.getBairro());
			query.setInt(8, pessoa.getNumero());
			query.setInt(9, pessoa.getCep());
			query.setString(10, pessoa.getEstado());
			query.setDate(11, pessoa.getDatanasc());
			query.setString(12, pessoa.getCategoriacnh());
			query.setInt(13, pessoa.getNumerocnh());
			query.setString(14, pessoa.getTipo());
			
			PreparedStatement query2 = conn.prepareStatement(sql2);
			query2.setString(1, pessoa.getLogin());
			query2.setString(2, pessoa.getSenha());
			query2.setString(3, pessoa.getTipo());
			query2.setString(4, pessoa.getNome());
			

			// Executa SQL
			query.execute();
			query.close();
			
			query2.execute();
			query2.close();
			return true;

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
		
	}

}