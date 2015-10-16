
package mx.shiftf6.controlcyber.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BarBro
 */
public class UsuarioDAO implements ObjetoDAO{
    // Atributos de Clase
    private UsuarioModelo usuarioModelo;
    private Connection con;
    
    
    public UsuarioDAO(){
        // Default Constructor
        
        
    }
    // Get and Set Methods for UsuarioDAO Class
    // UsuarioModelo
    public UsuarioModelo getUsuarioModelo(){
        return this.usuarioModelo;
    }
    
    public void setUsuarioModelo(UsuarioModelo usuarioModelo){
        this.usuarioModelo = usuarioModelo;
    }

    @Override
    public Object[] leerUno(String campo, String valor) {   
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] leerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String buscar(Object obj) {
        
        // Querys to find user and verify password returns specific error if needed  
        String queryUsuario = "Select from Usuarios where nombreUsuario = ? ";
        String queryContrasena = "Select from Usuarios where contrasena = ? ";
        String queryStatus = "Select from Usuarios where status = ? ";
        // Object from UsuarioModel 
        UsuarioModelo temp = new UsuarioModelo();
        
        try {
            // Getting nombreUsuario 
            PreparedStatement prepUsuario = con.prepareStatement(queryUsuario);
            prepUsuario.setString(1, temp.getNombreUsuario());
            
            ResultSet res = prepUsuario.executeQuery();
            
            if(res == null){
                return "No Existe el Usuario"; 
            }else{
                // Getting contrasena 
                PreparedStatement prepContrasena = con.prepareStatement(queryContrasena);
                prepContrasena.setString(1, temp.getContrasena());
                
                ResultSet res2 = prepContrasena.executeQuery();
                
                if(res2 == null){
                    return "Contraseña Incorrecta";
                }else{
                    // Getting status
                    PreparedStatement prepStatus = con.prepareStatement(queryStatus);
                    prepStatus.setInt(1, temp.getStatus());
                    
                    ResultSet res3 = prepStatus.executeQuery();
                    
                    if(res3 == null){
                        return "Usuario ya Inicio Sesion";
                    }else{
                        // Close PreparedStatements
                        prepUsuario.close();
                        prepContrasena.close();
                        prepStatus.close();
                        // Close ResultSets
                        res.close();
                        res2.close();
                        res3.close();
                        
                        return "Bienvenido";
                    }
                }
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
