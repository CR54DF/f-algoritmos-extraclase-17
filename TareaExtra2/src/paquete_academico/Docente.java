/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;

import paquete_general.Pais;

/**
 *
 * @author crsyhian
 */
public class Docente {

    private String nombre;
    private String apellido;
    private Pais pais;

    public void establecer_nombre(String n) {
        nombre = n;
    }

    public String obetener_nombre() {
        return nombre;
    }

    public void establecer_apellido(String a) {
        apellido = a;
    }

    public String obtener_apellido() {
        return apellido;
    }

    public void establecer_pais(Pais p) {
        pais = p;
    }

    public Pais obetener_pais() {
        return pais;
    }

    @Override
    public String toString() {

        String c = String.format("Docente: %s %s"
                + "%s", obetener_nombre(), obtener_apellido(), obetener_pais());

        return c;

    }

}
