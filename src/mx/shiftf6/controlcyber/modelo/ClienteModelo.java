
package mx.shiftf6.controlcyber.modelo;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author BarBro
 */
public class ClienteModelo {
    //Atributos de Clase
    private IntegerProperty cveCliente;
    private StringProperty primerNombre;
    private StringProperty segundoNombre;
    private StringProperty primerApellido;
    private StringProperty segundoApellido;
    private StringProperty sexo;
    private StringProperty colonia;
    private StringProperty municipio;
    private StringProperty estado;
    private IntegerProperty telefono;
    private StringProperty correoElectronico;
    
    public ClienteModelo(){
        //Default Constructor
    }
    
    //Get and Set Methods for ClienteModelo Class
    //cveCliente
    public int getCveCliente(){
        return cveCliente.get();
    }
    public void setCveCliente(int cveCliente){
        this.cveCliente.set(cveCliente);
    }
    public IntegerProperty cveClienteProperty(){
        return cveCliente;
    }
    //primerNombre
    public String getPrimerNombre(){
        return primerNombre.get();
    }
    public void setPrimerNombre(String primerNombre){
        this.primerNombre.set(primerNombre);
    }
    public StringProperty primerNombreProperty(){
        return primerNombre;
    }
    //segundoNombre
    public String getSegundoNombre(){
        return segundoNombre.get();
    }
    public void setSegundoNombre(String segundoNombre){
        this.segundoNombre.set(segundoNombre);
    }
    public StringProperty segundoNombreProperty(){
        return segundoNombre;
    }
    //primerApellido
    public String getPrimerApellido(){
        return primerApellido.get();
    }
    public void setPrimerApellido(String primerApellido){
        this.primerApellido.set(primerApellido);
    }
    public StringProperty primerApellidoProperty(){
        return primerApellido;
    }
    //segundoApellido
    public String getSegundoApellido(){
        return segundoApellido.get();
    }
    public void setSegundoApellido(String segundoApellido){
        this.segundoApellido.set(segundoApellido);
    }
    public StringProperty segundoApellidoProperty(){
        return segundoApellido;
    }
    //sexo
    public String getSexo(){
        return sexo.get();
    }
    public void setSexo(String sexo){
        this.sexo.set(sexo);
    }
    public StringProperty sexoProperty(){
        return sexo;
    }
    //colonia
    public String getColonia(){
        return colonia.get();
    }
    public void setColonia(String colonia){
        this.colonia.set(colonia);
    }
    public StringProperty coloniaProperty(){
        return colonia;
    }
    //municipio
    public String getMunicipio(){
        return municipio.get();
    }
    public void setMunicipio(String municipio){
        this.municipio.set(municipio);
    }
    public StringProperty municipioProperty(){
        return municipio;
    }
    //estado 
    public String getEstado(){
        return estado.get();
    }
    public void setEstado(String estado){
        this.estado.set(estado);
    }
    public StringProperty estadoProperty(){
        return estado;
    }
    //telefono
    public int getTelefono(){
        return telefono.get();
    }
    public void setTelefono(int telefono){
        this.telefono.set(telefono);
    }
    public IntegerProperty telefonoProperty(){
        return telefono;
    }
    //correoElectronico 
    public String getCorreoElectronico(){
        return correoElectronico.get();
    }
    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico.set(correoElectronico);
    }
    public StringProperty correoElectronicoProperty(){
        return correoElectronico;
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
