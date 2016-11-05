import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by pankajmisra on 11/5/16.
 */
public class DBUtil {

    public Connection getDBConnection() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres","postgres", "postgres");
        return conn;
    }


}
