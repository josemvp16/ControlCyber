
package mx.shiftf6.controlcyber.modelo;

/**
 *
 * @author BarBro
 */
public interface ObjetoDAO {
    // Interface Methods
    /**
     * Este método obtiene todos los objetos con el campo y valor
     * @param campo
     * @param valor
     * @return 
     */
    // Leer
    public Object[] leerUno(String campo, String valor);
    // Leer todos
    public Object[] leerTodos();
    // Agregar
    public void agregar(Object obj);
    // Eliminar
    public void eliminar(Object obj);
    // Actualizar
    public void actualizar(Object obj);
    
}
