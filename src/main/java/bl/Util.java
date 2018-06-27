package bl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String DB_DRIVER = "org.postgresql.Driver";
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/myCompany";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "root";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            try {
                connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                System.out.print("Connection OK!");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.print("Connection Error!");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.print("Connection Error!");
        }
        return connection;
    }
}
