
package mx.shiftf6.controlcyber.modelo;

import java.sql.Connection;

/**
 *
 * @author Champe
 */
public interface ObjetoDAO {
    
    /**
     * Crea un nuevo registro en la base de datos
     * @param obj 
     */
    public void crear(Object obj);
    
    /**
     * Lee un registro en la base de datos de acuerdo a los parametros de entrada
     * y regresa el registro encontrado
     * @param campo
     * @param valor
     * @return 
     */
    public Object leerUno(String campo, String valor);
    
    /**
     * Lee todos los registros de la base de datos y los retorna en un arreglo
     * @return 
     */
    public Object[] leerTodos();
    
    /**
     * Actualiza un registro de la base de datos
     * @param obj 
     */
    public void actualizar(Object obj);
    
    /**
     * Elimina un registro de la base de datos
     * @param obj 
     */
    public void eliminar(Object obj);
    
    /**
     * Cierra la conexion abierta a la base de datos
     * @param conexion 
     */
    public int cerrarConexion();
    
}// Fin interface
