
package mx.shiftf6.controlcyber.modelo;

/**
 *
 * @author BarBro
 */
public class DetalleDAO implements ObjetoDAO{
    // Atributos de Clase
    private DetalleModelo detalleModelo;
    
    public DetalleDAO(){
        // Default Constructor
    }
    // Get and Set Methods for DetalleDAO Class
    // BitacoraModelo
    public DetalleModelo getDetalleModelo(){
        return this.detalleModelo;
    }
    public void setDetalleModelo(DetalleModelo detalleModelo){
        this.detalleModelo = detalleModelo;
    }

    @Override
    public void crear(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object leerUno(String campo, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] leerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int cerrarConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
