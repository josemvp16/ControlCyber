
package mx.shiftf6.controlcyber.modelo;

/**
 *
 * @author BarBro
 */
public interface ObjetoDAO {
    // Interface Methods
    //leer
    /**
     * Este método obtiene todos los objetos con el campo y valor
     * @param campo
     * @param valor
     * @return 
     */
    public Object[] leerUno(String campo, String valor);
    // Leer todos
    public Object[] leerTodos();
    //agregar
    public void agregar(Object obj);
    //eliminar
    public void eliminar(Object obj);
    //actualizar
    public void actualizar(Object obj);
    
}
