/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;

/**
 *
 * @author crsyhian
 */
public class Carrera {

    private String nombre;
    private String modalidad;

    public void establecer_nombre(String n) {
        nombre = n;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_modalidad(String m) {
        modalidad = m;
    }

    public String obtener_modalidad() {
        return modalidad;
    }

    @Override
    public String toString() {

        String cadena = String.format("de la carrera %s"
                + " - modalidad(%s).", obtener_nombre(), obtener_modalidad());

        return cadena;

    }

}
