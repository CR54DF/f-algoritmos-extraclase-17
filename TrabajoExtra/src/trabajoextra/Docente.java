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
public class Docente {

    //nombres, apellidos, titulo_tercer_nivel, titulo_cuarto_nivel, asignatura_1, asignatura2
    private String nombreD;
    private String apellidos;
    private String titulo_tercer_nivel;
    private String titulo_cuarto_nivel;
    private String asignatura_1;
    private String asignatura_2;

    public void agregar_nombreD(String n) {
        nombreD = n;
    }

    public String obtener_nombreD() {
        return nombreD;
    }

    public void agregar_apellidos(String a) {
        apellidos = a;
    }

    public String obtener_apellidos() {
        return apellidos;
    }

    public void agregar_titulo_tercer_nivel(String t) {
        titulo_tercer_nivel = t;
    }

    public String obtener_titulo_tercer_nivel() {
        return titulo_tercer_nivel;
    }

    public void agregar_titulo_cuarto_nivel(String tc) {
        titulo_cuarto_nivel = tc;
    }

    public String obtener_titulo_cuarto_nivel() {
        return titulo_cuarto_nivel;
    }

    public void agregar_asignatura_1(String a1) {
        asignatura_1 = a1;
    }

    public String obtener_asignatura_1() {
        return asignatura_1;
    }

    public void agregar_asignatura_2(String a2) {
        asignatura_2 = a2;
    }

    public String obtener_asignatura_2() {
        return asignatura_2;
    }

}

