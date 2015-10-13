
package mx.shiftf6.controlcyber.modelo;

/**
 *
 * @author BarBro
 */
public class ClienteDAO implements ObjetoDAO{
    // Atributos de Clase
    private ClienteModelo clienteModelo;
    
    public ClienteDAO(){
        // Default Constructor
    }
    // Get and Set Methods for ClienteDAO Class
    // ClienteModelo
    public ClienteModelo getClienteModelo(){
        return this.clienteModelo;
    }
    public void setClienteModelo(ClienteModelo clienteModelo){
        this.clienteModelo = clienteModelo;
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
