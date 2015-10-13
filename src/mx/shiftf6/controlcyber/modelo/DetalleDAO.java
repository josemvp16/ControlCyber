
package mx.shiftf6.controlcyber.modelo;

/**
 *
 * @author BarBro
 */
public class DetalleDAO implements ObjetoDAO{
    //Atributos de Clase
    private DetalleModelo detalleModelo;
    
    public DetalleDAO(){
        //Default Constructor
    }
    //Get and Set Methods for DetalleDAO Class
    //bitacoraModelo
    public void getDetalleModelo(){
        detalleModelo.getClass();
    }
    public void setDetalleModelo(DetalleModelo detalleModelo){
        this.detalleModelo.equals(detalleModelo);
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
