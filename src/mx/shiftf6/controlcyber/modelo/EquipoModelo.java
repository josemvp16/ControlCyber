
package mx.shiftf6.controlcyber.modelo;

import java.util.ArrayList;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author BarBro
 */
public class EquipoModelo {
    // Atributos de Clase
    private final StringProperty cveEquipo;
    private final StringProperty nombreEquipo;
    
    public EquipoModelo(String cveEquipo, String nombreEquipo){
        this.cveEquipo = new SimpleStringProperty(cveEquipo);
        this.nombreEquipo = new SimpleStringProperty(nombreEquipo);        
    }
    // Get and Set Methods for EquipoModelo Class
    // CveEquipo
    public String getCveEquipo(){
        return cveEquipo.get();
    }
    public void setCveEquipo(String cveEquipo){
        this.cveEquipo.set(cveEquipo);
    }
    public StringProperty cveEquipoProperty(){
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
        String text = "Clave Equipo: " + this.getCveEquipo() + "\n" +
                      "Nombre Equipo: " + this.getNombreEquipo() + "\n";
        
        return text;
    }
    // ToArray
    public ArrayList toArray(){
        ArrayList<Object> arreglo = new ArrayList<>();
        arreglo.add(this.getCveEquipo());
        arreglo.add(this.getNombreEquipo());
        
        return arreglo;
    }
    
}
