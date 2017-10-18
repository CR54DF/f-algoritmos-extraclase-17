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
public class Asignatura {

    private String nombre;
    private int credito;

    public void agregar_nombre(String n) {
        n = nombre;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void agregar_credito(int c) {
        c = credito;
    }

    public int obtener_credito() {
        return credito;
    }
}
