package Cadastro_de_Cliente;
import java.sql.*;

//cadastra novos clientes
	public class cadastrar{
	    public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3308/cadastro_cliente";
	        String user = "root";
	        String password = "root";

	        try (Connection connection = DriverManager.getConnection(url, user, password);
	             PreparedStatement statement = connection.prepareStatement("INSERT INTO cadastro_cliente ( nome_completo, telefone, email, endereço) VALUES ( ?, ?, ?, ?)")) {

	            statement.setString(1, "teste2");
	            statement.setString(2, "teste2");
	            statement.setString(3, "teste2");
	            statement.setString(4, "teste2");

	            statement.executeUpdate();
	            
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	    
	}
}
