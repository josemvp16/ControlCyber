
package mx.shiftf6.controlcyber.modelo;

import java.util.ArrayList;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author BarBro
 */
public class ClienteModelo {
    // Atributos de Clase
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
        // Default Constructor
    }
    
    // Get and Set Methods for ClienteModelo Class
    // CveCliente
    public int getCveCliente(){
        return cveCliente.get();
    }
    public void setCveCliente(int cveCliente){
        this.cveCliente.set(cveCliente);
    }
    public IntegerProperty cveClienteProperty(){
        return cveCliente;
    }
    // PrimerNombre
    public String getPrimerNombre(){
        return primerNombre.get();
    }
    public void setPrimerNombre(String primerNombre){
        this.primerNombre.set(primerNombre);
    }
    public StringProperty primerNombreProperty(){
        return primerNombre;
    }
    // SegundoNombre
    public String getSegundoNombre(){
        return segundoNombre.get();
    }
    public void setSegundoNombre(String segundoNombre){
        this.segundoNombre.set(segundoNombre);
    }
    public StringProperty segundoNombreProperty(){
        return segundoNombre;
    }
    // PrimerApellido
    public String getPrimerApellido(){
        return primerApellido.get();
    }
    public void setPrimerApellido(String primerApellido){
        this.primerApellido.set(primerApellido);
    }
    public StringProperty primerApellidoProperty(){
        return primerApellido;
    }
    // SegundoApellido
    public String getSegundoApellido(){
        return segundoApellido.get();
    }
    public void setSegundoApellido(String segundoApellido){
        this.segundoApellido.set(segundoApellido);
    }
    public StringProperty segundoApellidoProperty(){
        return segundoApellido;
    }
    // Sexo
    public String getSexo(){
        return sexo.get();
    }
    public void setSexo(String sexo){
        this.sexo.set(sexo);
    }
    public StringProperty sexoProperty(){
        return sexo;
    }
    // Colonia
    public String getColonia(){
        return colonia.get();
    }
    public void setColonia(String colonia){
        this.colonia.set(colonia);
    }
    public StringProperty coloniaProperty(){
        return colonia;
    }
    // Municipio
    public String getMunicipio(){
        return municipio.get();
    }
    public void setMunicipio(String municipio){
        this.municipio.set(municipio);
    }
    public StringProperty municipioProperty(){
        return municipio;
    }
    // Estado 
    public String getEstado(){
        return estado.get();
    }
    public void setEstado(String estado){
        this.estado.set(estado);
    }
    public StringProperty estadoProperty(){
        return estado;
    }
    // Telefono
    public int getTelefono(){
        return telefono.get();
    }
    public void setTelefono(int telefono){
        this.telefono.set(telefono);
    }
    public IntegerProperty telefonoProperty(){
        return telefono;
    }
    // CorreoElectronico 
    public String getCorreoElectronico(){
        return correoElectronico.get();
    }
    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico.set(correoElectronico);
    }
    public StringProperty correoElectronicoProperty(){
        return correoElectronico;
    }
    
    // Other methods
    // ToString
    @Override
    public String toString(){
        String text = "Clave Cliente: " + this.getCveCliente() + "\n" +
                      "Primer Nombre: " + this.getPrimerNombre() + "\n" +
                      "Segundo Nombre: " + this.getSegundoNombre() + "\n" +
                      "Primer Apellido: " + this.getPrimerApellido() + "\n" +
                      "Segundo Apellido: " + this.getSegundoApellido() + "\n" +
                      "Sexo: " + this.getSexo() + "\n" +
                      "Colonia: " + this.getColonia() + "\n" +
                      "Municipio: " + this.getMunicipio() + "\n" +
                      "Estado: " + this.getEstado() + "\n" +
                      "Telefono: " + this.getTelefono() + "\n" +
                      "Correo Electronico: " + this.getCorreoElectronico() + "\n";
        return text;
    }
    // ToArray
    public ArrayList toArray(){
        ArrayList<Object> arreglo = new ArrayList();
        arreglo.add(this.getCveCliente());
        arreglo.add(this.getPrimerNombre());
        arreglo.add(this.getSegundoNombre());
        arreglo.add(this.getPrimerApellido());
        arreglo.add(this.getSegundoApellido());
        arreglo.add(this.getSexo());
        arreglo.add(this.getColonia());
        arreglo.add(this.getMunicipio());
        arreglo.add(this.getEstado());
        arreglo.add(this.getTelefono());
        arreglo.add(this.getCorreoElectronico());
             
        return arreglo;
    }
}
