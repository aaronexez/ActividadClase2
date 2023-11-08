package Clase2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos",false);

        Materia paradigmas = new Materia("Paradigmas de Programacion", true);
        paradigmas.agregarCorrelativa(algoritmos);

        Materia disenio = new Materia("Diseño de Sistemas", false);
        disenio.agregarCorrelativa(paradigmas);
        disenio.agregarCorrelativa(algoritmos);

        Alumno alumno1 = new Alumno("Aaron");
        Inscripcion inscripcion1 = new Inscripcion(alumno1, disenio);
        alumno1.agregarInscripcion(inscripcion1);

        System.out.println("Nombre del alumno: " + alumno1.getNombre());
        alumno1.mostrarInscripciones();//crear metodo con inscripcion unica
        System.out.println("Estado de la inscripcion: " + inscripcion1.Aprobada());
        disenio.mostrarCorrelativas();
    }
}
