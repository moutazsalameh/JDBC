// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author slmns
 */
public class postgresql {

    private static final String Username = "dbuser";
    private static final String Password = "dbpassword";
    private static final String Conn_String = //"jdbc:mysql://localhost/explorecaliforina";
            "jdbc:hsqldb:data/explorecaliforina";
    Connection conn = null;
    Statement stat = null;
    ResultSet rs = null;

    public void connect() throws SQLException {
        try {
            conn = DriverManager.getConnection(Conn_String, Username, Password);
            stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stat.executeQuery("SELECT * FROM STATES");
            
            rs.last();
            System.out.println("Number of rows: " + rs.getRow());
//       System.out.println("Connected");
        } catch (SQLException ex) {
            Logger.getLogger(postgresql.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null){
                rs.close();
            }
            if (stat != null){
                stat.close();
            }
            if (conn != null){
                conn.close();
            }
        }

    }
}