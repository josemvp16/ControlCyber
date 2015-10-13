
package mx.shiftf6.controlcyber.modelo;

/**
 *
 * @author BarBro
 */
public class BitacoraDAO implements ObjetoDAO{
    //Atributos de Clase
    private BitacoraModelo bitacoraModelo;
    
    public BitacoraDAO(){
        //Default Constructor
    }
    //Get and Set Methods for BitacoraDAO Class
    //bitacoraModelo
    public void getBitacoraModelo(){
        bitacoraModelo.getClass();
    }
    public void setBitacoraModelo(BitacoraModelo bitacoraModelo){
        this.bitacoraModelo.equals(bitacoraModelo);
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
