
package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
   

    private static String usuario = "root";
    private static String senha = "0164";
    private  static String host = "localhost";
    private  static String porta = "3306";
    private static String bd = "db_healthLife";

    public static Connection obtemConexao() {
        try {
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + bd + "?useTimezone=true&serverTimezone=UTC",
                    
                    usuario,
                    senha
                    
            );
            return c;
        } catch (SQLException e) {
            
            return null;
        }
    }
}


