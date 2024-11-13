package Cadastro_de_Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


//busca os detalhes do cliente
public class buscarClientes {
	    public static void main(String[] args) {
	    	 String url = "jdbc:mysql://localhost:3308/cadastro_cliente";
		        String user = "root";
		        String password = "root";


		        try (Connection connection = DriverManager.getConnection(url, user, password);
		        		PreparedStatement statement = connection.prepareStatement("select telefone, email, endereço from cadastro_cliente where nome_completo = ?")) {
		        	
		        	statement.setString(1, "teste");	            

		        		            
		        	ResultSet resultSet = statement.executeQuery();
		               while (resultSet.next()) {
		                   String telefone = resultSet.getString("telefone");
		                   String email = resultSet.getString("email");
		                   String endereco = resultSet.getString("endereço");
		                   
		                   System.out.println("  telefone: " + telefone + ", email: " + email + ", endereço: " + endereco);
		               }
		           } 
		        
		        catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	    
	}}

