
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
    public void getUsuarioModelo(){
        usuarioModelo.getClass();
    }
    public void setUsuarioModelo(UsuarioModelo usuarioModelo){
        this.usuarioModelo.equals(usuarioModelo);
    }

    @Override
    public void leer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
