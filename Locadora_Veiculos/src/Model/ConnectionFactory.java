package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class ConnectionFactory {
 
    // Cria string de conexão de banco de dados
    private static String conexao;
 
    // cria conexões
    // você pode alimentar o nome do servidor, porta e banco de dados
    // de alguma configuração global ou como achar melhor.
 
    public static Connection getConexao(int fabrica, String usuario,
            String senha) throws ClassNotFoundException, SQLException {
 
        //	usuario = "postgres";
    	//  senha = "postgres";
        if (fabrica == 1) {
            conexao = "jdbc:postgresql://127.0.0.1:5432/CompartilharTransporte";
            Class.forName("org.postgresql.Driver");
        }
 
      
        // Retorna driver pronto para login
        return DriverManager.getConnection(conexao, usuario, senha);
 
    }
 
}
