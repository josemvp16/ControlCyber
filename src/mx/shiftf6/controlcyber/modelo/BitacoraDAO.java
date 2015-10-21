
package mx.shiftf6.controlcyber.modelo;

/**
 *
 * @author BarBro
 */
public class BitacoraDAO implements ObjetoDAO{
    // Atributos de Clase
    private BitacoraModelo bitacoraModelo;
    
    public BitacoraDAO(){
        // Default Constructor
    }
    // Get and Set Methods for BitacoraDAO Class
    // DitacoraModelo
    public BitacoraModelo getBitacoraModelo(){
        return this.bitacoraModelo;
    }
    public void setBitacoraModelo(BitacoraModelo bitacoraModelo){
        this.bitacoraModelo = bitacoraModelo;
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
