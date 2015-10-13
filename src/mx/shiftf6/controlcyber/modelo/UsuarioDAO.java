
package mx.shiftf6.controlcyber.modelo;

/**
 *
 * @author BarBro
 */
public class UsuarioDAO implements ObjetoDAO{
    //Atributos de Clase
    private UsuarioModelo usuarioModelo;
    
    public UsuarioDAO(){
        //Default Constructor
    }
    //Get and Set Methods for UsuarioDAO Class
    //usuarioModelo
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

}
