package Cadastro_de_Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//atualiza o cadastro
public class atualizarCadastro {
	  public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3308/cadastro_cliente";
	        String user = "root";
	        String password = "root";

	        try (Connection connection = DriverManager.getConnection(url, user, password);
	             PreparedStatement statement = connection.prepareStatement("update cadastro_cliente set telefone= ? , email = ? , endereço = ? where nome_completo = ?")) {

	            statement.setString(1, "243423");
	            statement.setString(2, "teste2@email");
	            statement.setString(3, "av. teste2");
	            statement.setString(4, "teste2");

	            statement.executeUpdate();
	            
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	    
	}
}
