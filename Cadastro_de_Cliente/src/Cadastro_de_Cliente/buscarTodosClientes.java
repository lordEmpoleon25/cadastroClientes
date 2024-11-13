package Cadastro_de_Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


//lista todos os clientes
public class buscarTodosClientes {
	public static void main(String[] args) {
   	 String url = "jdbc:mysql://localhost:3308/cadastro_cliente";
	        String user = "root";
	        String password = "root";

	        try (Connection connection = DriverManager.getConnection(url, user, password);
	        		PreparedStatement statement = connection.prepareStatement("select nome_completo from cadastro_cliente")) {

	        		            
	        	ResultSet resultSet = statement.executeQuery();
	               while (resultSet.next()) {
	                   String nome = resultSet.getString("nome_completo");
	                   
	                   
	                   System.out.println(" nome_completo: " + nome );
	               }
	           } 

           
       catch (SQLException e) {
           throw new RuntimeException(e);
       }
   
	}}
