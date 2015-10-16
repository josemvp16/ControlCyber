/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.shiftf6.controlcyber.utilerias;

/**
 *
 * @author pedro
 */
public class TestLeer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LeerArchivo leer = new LeerArchivo("/mx/shiftf6/controlcyber/archivos/ConnectionData");
        System.out.println(leer.toString());
    }
    
}
