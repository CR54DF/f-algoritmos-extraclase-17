/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoextra;

/**
 *
 * @author crsyhian
 */
public class Titulo {

    private String nombre;
    private String nombre_universidad;

    public void agregar_nombre(String n) {
        nombre = n;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void agregar_nombre_universidad(String n) {
        nombre = n;
    }

    public String obtener_nombre_universidad() {
        return nombre;
    }

}
