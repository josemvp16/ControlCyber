
package mx.shiftf6.controlcyber.modelo;
import java.sql.*;

public class conexion {
    Connection co;
    Statement stm;
    public conexion() throws SQLException{
        try {
        class.forName("com.mysql.jdbc.Driver");
        Connection co=DriverManager.getConnection("jdbc:mysql://192.168.1.76/Hola?user=adminciber&password=simons83");
        Statement stm=co.createStatement();
        }
        catch (ClassNotFoundException exc){
                exc.printStackTrace();
                }
    }
}
