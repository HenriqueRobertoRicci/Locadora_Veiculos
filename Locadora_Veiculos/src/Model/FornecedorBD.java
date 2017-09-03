package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FornecedorBD {
	// Cria componentes
	private Connection conn = null;
	private Statement query;
	private String sql;
	private Statement query2;
	private String sql2;

	public FornecedorBD() {

		try {

			this.conn = ConnectionFactory.getConexao(1, "postgres", "postgres");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public Fornecedor buscaLogin(String login, String senha) {

		// Cria novo objeto
		Fornecedor fornecedor = new Fornecedor();

		// Define SQL
		sql = "SELECT * FROM LOGINS WHERE LOGIN = '" + login + "' AND PASSWORD = '" + senha + "'"
				+ "AND TIPO = '" + "Fornecedor" + "'";

		try {

			// Associa conexão e executa SQL
			query = conn.createStatement();
			ResultSet rs = query.executeQuery(sql);

			// Recupera dados do set
			while (rs.next()) {
				fornecedor.setLogin(rs.getString("LOGIN"));
				fornecedor.setSenha(rs.getString("PASSWORD"));
				fornecedor.setTipo(rs.getString("TIPO"));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		// Retorna objeto
		return fornecedor;
	}
	
	public boolean inserirFornecedor(Pessoa pessoa) {
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
	
	public boolean inserirVan(Van novaVan) {
		// Define SQL
		sql = "INSERT INTO VAN VALUES (DEFAULT,?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {

			// Prepara SQL e alimenta parametros
			PreparedStatement query = conn.prepareStatement(sql);
			query.setString(1, novaVan.getModelo());
			query.setString(2, novaVan.getMarca());
			query.setInt(3, novaVan.getAno());
			query.setString(4, novaVan.getPlaca());
			query.setString(5, novaVan.getCor());
			query.setString(6, novaVan.getTipodirecao());
			query.setInt(7, novaVan.getQtdlugares());
			query.setString(8, novaVan.getTipocambio());
			query.setInt(9, novaVan.getRenavam());
			query.setDouble(10, novaVan.getPreco());

			// Executa SQL
			query.execute();
			query.close();
			return true;

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
		
	}
	
	public boolean inserirMoto(Moto novaMoto) {
		// Define SQL
		sql = "INSERT INTO MOTO VALUES (DEFAULT,?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {

			// Prepara SQL e alimenta parametros
			PreparedStatement query = conn.prepareStatement(sql);
			query.setString(1, novaMoto.getMarca());
			query.setString(2, novaMoto.getModelo());
			query.setInt(3, novaMoto.getAno());
			query.setString(4, novaMoto.getPlaca());
			query.setString(5, novaMoto.getCor());
			query.setString(6, novaMoto.getCategoria());
			query.setString(7, novaMoto.getTipofreio());
			query.setInt(8, novaMoto.getRenavam());
			query.setDouble(9, novaMoto.getPreco());

			// Executa SQL
			query.execute();
			query.close();
			return true;

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
		
	}
	
	public boolean inserirCarro(Carro novoCarro) {
		// Define SQL
		sql = "INSERT INTO CARRO VALUES (DEFAULT,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {

			// Prepara SQL e alimenta parametros
			PreparedStatement query = conn.prepareStatement(sql);
			query.setString(1, novoCarro.getModelo());
			query.setString(2, novoCarro.getMarca());
			query.setInt(3, novoCarro.getAno());
			query.setString(4, novoCarro.getPlaca());
			query.setString(5, novoCarro.getCor());
			query.setString(6, novoCarro.getCategoria());
			query.setInt(7, novoCarro.getQtdportas());
			query.setString(8, novoCarro.getTipodirecao());
			query.setInt(9, novoCarro.getQtdlugares());
			query.setString(10, novoCarro.getTipocambio());
			query.setInt(11, novoCarro.getRenavam());
			query.setDouble(12, novoCarro.getPreco());

			// Executa SQL
			query.execute();
			query.close();
			return true;

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
		
	}
	
	public boolean inserirBicicleta(Bicicleta novaBicicleta) {
		// Define SQL
		sql = "INSERT INTO BICICLETA VALUES (DEFAULT,?, ?, ?, ?, ?, ?, ?)";

		try {

			// Prepara SQL e alimenta parametros
			PreparedStatement query = conn.prepareStatement(sql);
			query.setString(1, novaBicicleta.getMarca());
			query.setString(2, novaBicicleta.getCor());
			query.setInt(3, novaBicicleta.getQtdmarchas());
			query.setInt(4, novaBicicleta.getTamanhoaro());
			query.setString(5, novaBicicleta.getTipodeuso());
			query.setString(6, novaBicicleta.getTipofreio());
			query.setDouble(7, novaBicicleta.getPreco());


			// Executa SQL
			query.execute();
			query.close();
			return true;

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
		
	}


}
