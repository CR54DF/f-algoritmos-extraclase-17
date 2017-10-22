/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

import paquete_academico.Asignatura;
import paquete_academico.Carrera;
import paquete_academico.Docente;
import paquete_academico.Universidad;
import paquete_estudiante.Estudiante;
import paquete_general.Pais;

/**
 *
 * @author crsyhian
 */
public class Principal {

    public static void main(String[] args) {
        // clases pais
        Pais p = new Pais();
        p.establecer_nombre("Ecuador");

        Pais p1 = new Pais();
        p1.establecer_nombre("Colombia");

        Pais p2 = new Pais();
        p2.establecer_nombre("Perú");

        Pais p3 = new Pais();
        p3.establecer_nombre("Venezuela");

        Universidad u = new Universidad();
        u.establecer_nombre("Universidad Técnica Particular de Loja");
        u.establecer_siglas("UTPL");
        u.establecer_pais(p);

        Universidad u1 = new Universidad();
        u1.establecer_nombre("Universidad Técnica Equinoccial");
        u1.establecer_siglas("UTE");
        u1.establecer_pais(p);

        Carrera c = new Carrera();
        c.establecer_nombre("Sistemas");
        c.establecer_modalidad("presencial");

        Carrera c1 = new Carrera();
        c1.establecer_nombre("Ingeniería Química");
        c1.establecer_modalidad("distancia");

        Docente d = new Docente();
        d.establecer_nombre("Mario");
        d.establecer_apellido("Alcivar");
        d.establecer_pais(p1);

        Docente d1 = new Docente();
        d1.establecer_nombre("Maria");
        d1.establecer_apellido("Ruiz");
        d1.establecer_pais(p2);

        Docente d2 = new Docente();
        d2.establecer_nombre("Luis");
        d2.establecer_apellido("Armigos");
        d2.establecer_pais(p3);

        Asignatura a1 = new Asignatura();
        a1.establecer_nombre("Matemáticas");
        a1.establecer_creditos(10);
        a1.establecer_carrera(c);
        a1.establecer_docente(d);

        Asignatura a2 = new Asignatura();
        a2.establecer_nombre("Física");
        a2.establecer_creditos(8);
        a2.establecer_carrera(c);
        a2.establecer_docente(d1);

        Asignatura a3 = new Asignatura();
        a3.establecer_nombre("Biología");
        a3.establecer_creditos(9);
        a3.establecer_carrera(c1);
        a3.establecer_docente(d2);

        Asignatura a4 = new Asignatura();
        a4.establecer_nombre("Física");
        a4.establecer_creditos(7);
        a4.establecer_carrera(c1);
        a4.establecer_docente(d1);

        Estudiante e = new Estudiante();
        e.establecer_nombres("Luis V");
        e.establecer_apellidos("Perez J");
        e.establecer_asignatura_1(a1);
        e.establecer_asignatura_2(a2);
        e.establecer_universidad(u);

        Estudiante e1 = new Estudiante();
        e1.establecer_nombres("Ana");
        e1.establecer_apellidos("Lima J");
        e1.establecer_asignatura_1(a3);
        e1.establecer_asignatura_2(a4);
        e1.establecer_universidad(u1);

        System.out.println("Caso 1: \n");
        System.out.println(e);

        System.out.println("\nCaso 2: \n");
        System.out.println(e1);

    }

}
