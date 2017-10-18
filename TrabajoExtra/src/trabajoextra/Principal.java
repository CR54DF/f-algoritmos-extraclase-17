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
public class Principal {

    public static void main(String[] args) {
        Docente d = new Docente();
        d.agregar_nombreD("luis v");
        d.agregar_apellidos("perez j");
        d.agregar_asignatura_1("matematicas 8 creditos");
        d.agregar_asignatura_2("fisica 6 creditos");
        d.agregar_titulo_tercer_nivel("Licenciado en Físico Matemáticas - Universidad Politécnica");
        d.agregar_titulo_cuarto_nivel("Magister en Docencia Matemática - Universidad Valenciana");
        Docente d1 = new Docente();
        d.agregar_nombreD("Ana M");
        d.agregar_apellidos("Velez P");
        d.agregar_asignatura_1("Literatura 10creditos");
        d.agregar_asignatura_2("Sociales 9 creditos");
        d.agregar_titulo_tercer_nivel("Licenciado en Ciencias Sociales - Universidad Salesiana");
        d.agregar_titulo_cuarto_nivel("Magister en Docencia Social - Universidad Cataluña");
    }

}
