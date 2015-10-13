
package mx.shiftf6.controlcyber.modelo;

/**
 *
 * @author BarBro
 */
public class ClienteDAO implements ObjetoDAO{
    //Atributos de Clase
    private ClienteModelo clienteModelo;
    
    public ClienteDAO(){
        //Default Constructor
    }
    //Get and Set Methods for ClienteDAO Class
    //clienteModelo
    public void getClienteModelo(){
        clienteModelo.getClass();
    }
    public void setClienteModelo(ClienteModelo clienteModelo){
        this.clienteModelo.equals(clienteModelo);
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
