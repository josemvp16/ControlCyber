
package mx.shiftf6.controlcyber.modelo;

/**
 *
 * @author BarBro
 */
public class EquipoDAO implements ObjetoDAO{
    //Atributos de Clase
    private EquipoModelo equipoModelo;
    
    public EquipoDAO(){
        //Default Constructor
    }
    //Get and Set Methods for EquipoDAO Class
    //equipoModelo
    public void getEquipoModelo(){
        equipoModelo.getClass();
    }
    public void setEquipoModelo(EquipoModelo equipoModelo){
        this.equipoModelo.equals(equipoModelo);
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
