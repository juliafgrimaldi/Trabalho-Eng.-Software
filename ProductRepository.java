import java.sql.*;
import java.util.*;

public class ProductRepository {
    private static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/lojinha_mvc";

    public void saveProduct(Product product) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            try {
                Class.forName(JDBC_DRIVER);
                connection = DriverManager.getConnection(DB_URL, "joao", "123");
            } catch (ClassNotFoundException exc) {
                System.out.println("conexao nao estabelecida por causa do driver");
            }
            String sql = "INSERT INTO produtos (nome, preco) VALUES (?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, product.getName());
            statement.setDouble(2, product.getPrice());
            statement.executeUpdate();
        } catch(Exception e) {
            System.out.println("unknown error");
        } finally {
            if(statement != null) {
                statement.close();
            }
            if(connection != null) {
                connection.close();
            }
        } 
    }
    public List<Product> getAllProducts() throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Product> products = new ArrayList<>();
        
        try {
            try {
                Class.forName(JDBC_DRIVER);
                connection = DriverManager.getConnection(DB_URL, "joao", "123");
            } catch(ClassNotFoundException exc) {}
            
            String sql = "SELECT id, nome, preco FROM produtos";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("nome"));
                product.setPrice(resultSet.getDouble("preco"));
                products.add(product);
            }
        } finally {
            if(resultSet != null) {
                resultSet.close();
            }
            if(statement != null) {
                statement.close();
            }
            if(connection != null) {
                connection.close();
            }
        }
        return products;
    }
}
