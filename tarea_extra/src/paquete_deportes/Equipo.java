/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_deportes;

/**
 *
 * @author crsyhian
 */
public class Equipo {

    private String nombre;
    private String siglas;
    private int anio_fundacion;

    private Jugador[] jugadores;
    private Tecnico[] tecnicos;

    public Equipo(String n, String s, int a_fu, Jugador[] j, Tecnico[] t) {
        nombre = n;
        siglas = s;
        anio_fundacion = a_fu;
        jugadores = j;
        tecnicos = t;
    }

    public void establecer_nombre(String n) {
        nombre = n;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_siglas(String s) {
        siglas = s;
    }

    public String obtener_siglas() {
        return siglas;
    }

    public void establecer_anio_fundacion(int a_fu) {
        this.anio_fundacion = a_fu;
    }

    public int obtener_anio_fundacion() {
        return anio_fundacion;
    }

    public void establecer_jugadores(Jugador[] j) {
        jugadores = j;
    }

    public Tecnico[] obtner_tecnicos() {
        return tecnicos;
    }

    public void establecer_tecnicos(Tecnico[] t) {
        tecnicos = t;
    }

    public Jugador[] obtener_jugadores() {
        return jugadores;
    }

    public double obtener_promedio_edad_tecnicos() {
        double edades = 0;
        Tecnico[] arrayTecnicos = obtner_tecnicos();
        for (int i = 0; i < arrayTecnicos.length; i++) {
            edades += arrayTecnicos[i].obtener_edad();
        }

        return edades / arrayTecnicos.length;
    }

    public double obtener_promedio_edad_jugadores() {

        double edades = 0;
        Jugador[] arrayJugadores = obtener_jugadores();

        for (int i = 0; i < arrayJugadores.length; i++) {
            edades += arrayJugadores[i].obtener_edad();

        }

        return edades / arrayJugadores.length;
    }

    public String convertir_jugadores() {
        String cadenaJugadores = "";
        Jugador[] arrayJugadores = obtener_jugadores();
        for (int i = 0; i < jugadores.length; i++) {
            cadenaJugadores += String.format("\t%s - %s - %d años\n",
                    arrayJugadores[i].obtener_nombre(),
                    arrayJugadores[i].obtener_posicion(),
                    arrayJugadores[i].obtener_edad());

        }

        return cadenaJugadores;
    }

    public String convertir_tecnicos() {
        String cadenaTecnicos = "";
        Tecnico[] arrayTecnicos = obtner_tecnicos();
        for (int i = 0; i < tecnicos.length; i++) {
            cadenaTecnicos += String.format("\t%s - %s - %d años\n",
                    arrayTecnicos[i].obtener_nombre(),
                    arrayTecnicos[i].obtener_funcion(),
                    arrayTecnicos[i].obtener_edad());

        }

        return cadenaTecnicos;
    }

    @Override
    public String toString() {
        String c = String.format("Equipo \"%s\"\n"
                + "Sus técnicos son: \n"
                + "%s"
                + "Sus jugadores son: \n"
                + "%s"
                + "Promedio de edad de:\n"
                + "\tTécnicos: %.2f años\n"
                + "\tJugadores: %.2f años",
                obtener_nombre(),
                convertir_tecnicos(),
                convertir_jugadores(),
                obtener_promedio_edad_tecnicos(),
                obtener_promedio_edad_jugadores()
        );
        return c;
    }

}
