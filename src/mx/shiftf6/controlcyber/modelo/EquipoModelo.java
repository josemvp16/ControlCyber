
package mx.shiftf6.controlcyber.modelo;

import java.util.ArrayList;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author BarBro
 */
public class EquipoModelo {
    // Atributos de Clase
    private IntegerProperty cveEquipo;
    private StringProperty nombreEquipo;
    
    public EquipoModelo(){
        // Default Constructor
    }
    // Get and Set Methods for EquipoModelo Class
    // CveEquipo
    public int getsCveEquipo(){
        return cveEquipo.get();
    }
    public void setCveEquipo(int cveEquipo){
        this.cveEquipo.set(cveEquipo);
    }
    public IntegerProperty cveEquipoProperty(){
        return cveEquipo;
    }
    // NombreEquipo
    public String getNombreEquipo(){
        return nombreEquipo.get();
    }
    public void setNombreEquipo(String nombreEquipo){
        this.nombreEquipo.set(nombreEquipo);
    }
    public StringProperty nombreEquipoProperty(){
        return nombreEquipo;
    }
    
    // Other Methods
    // ToString
    @Override
    public String toString(){
        String text = "Clave Equipo: " + this.getsCveEquipo() + "\n" +
                      "Nombre Equipo: " + this.getNombreEquipo() + "\n";
        
        return text;
    }
    // ToArray
    public ArrayList toArray(){
        ArrayList<Object> arreglo = new ArrayList();
        arreglo.add(this.getsCveEquipo());
        arreglo.add(this.getNombreEquipo());
        
        return arreglo;
    }
    
}
