
package mx.shiftf6.controlcyber.modelo;

/**
 *
 * @author BarBro
 */
public class EquipoDAO implements ObjetoDAO{
    // Atributos de Clase
    private EquipoModelo equipoModelo;
    
    public EquipoDAO(){
        // Default Constructor
    }
    // Get and Set Methods for EquipoDAO Class
    // EquipoModelo
    public EquipoModelo getEquipoModelo(){
        return this.equipoModelo;
    }
    public void setEquipoModelo(EquipoModelo equipoModelo){
        this.equipoModelo = equipoModelo;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
