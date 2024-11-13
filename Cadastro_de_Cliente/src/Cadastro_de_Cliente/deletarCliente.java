package Cadastro_de_Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//deleta clientes
public class deletarCliente {
	 public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3308/cadastro_cliente";
	        String user = "root";
	        String password = "root";

	        try (Connection connection = DriverManager.getConnection(url, user, password);
	        		PreparedStatement statement = connection.prepareStatement("delete cadastro_cliente where nome_completo = ?")) {

	            
	            statement.setString(1, "teste2");

	            statement.executeUpdate();
	            
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	    
	}
}
