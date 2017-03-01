

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMySQL {

    private static final String USERNAME = "dbuser";
    private static final String PASSWORD = "dbpassword";
    private static final String CONN_STRING
            = "jdbc:mysql://localhost/explorecalifornia";

    public static void main(String[] args) throws SQLException {

        try (Connection conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD)) {
            System.out.println("Connected!");
        } catch (SQLException e) {
            System.err.println(e);
        }

    }

}
