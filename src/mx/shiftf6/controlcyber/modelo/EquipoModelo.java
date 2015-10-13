
package mx.shiftf6.controlcyber.modelo;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author BarBro
 */
class EquipoModelo {
    //Atributos de Clase
    private IntegerProperty cveEquipo;
    private StringProperty nombreEquipo;
    
    public EquipoModelo(){
        //Default Constructor
    }
    //Get and Set Methods for EquipoModelo Class
    //cveEquipo
    public int getsCveEquipo(){
        return cveEquipo.get();
    }
    public void setCveEquipo(int cveEquipo){
        this.cveEquipo.set(cveEquipo);
    }
    public IntegerProperty cveEquipoProperty(){
        return cveEquipo;
    }
    //nombreEquipo
    public String getNombreEquipo(){
        return nombreEquipo.get();
    }
    public void setNombreEquipo(String nombreEquipo){
        this.nombreEquipo.set(nombreEquipo);
    }
    public StringProperty nombreEquipoProperty(){
        return nombreEquipo;
    }
    
    //Other methods
    //toString
    public String toString(String text){
        return text;
    }
    //toArray
    public String[] toArray(String[] textArray){
        return textArray;
    }
    
}
