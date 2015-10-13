
package mx.shiftf6.controlcyber.modelo;
import java.sql.*;

public class conexion {
    Connection co;
    Statement stm;
    public conexion() throws SQLException{
        try {
        class.forName("com.mysql.jdbc.Driver");
        Connection co=DriverManager.getConnection("jdbc:mysql://localhost/Hola?user=root&password=");
        Statement stm=co.createStatement();
        }
        catch (ClassNotFoundException exc){
                exc.printStackTrace();
                }
    
    }
}
