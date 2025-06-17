import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3305/lahari";  // ✅ Use port 3306
        String user = "root";
        String password = "1234"; // ✅ Replace with your actual password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // ✅ Load driver manually
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Successful!");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }
    }
}


