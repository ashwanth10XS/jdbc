import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class mysql{

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "your_username";
        String password = "your_password";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connected to MySQL database!");

            

            connection.close(); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}