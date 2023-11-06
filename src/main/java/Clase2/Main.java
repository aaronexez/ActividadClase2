package Clase2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Materia> correlativas = new ArrayList<>();

        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos", correlativas,true);
        algoritmos.agregarCorrelativa(algoritmos);

        Materia paradigmas = new Materia("Paradigmas de Programacion", correlativas,true);
        paradigmas.agregarCorrelativa(paradigmas);

        Materia diseño = new Materia("Diseño de Sistemas", correlativas,true);

        List<Inscripcion> inscripciones = new ArrayList<>();
        Alumno alumno1 = new Alumno("Aaron", inscripciones);

        Inscripcion inscripcion1 = new Inscripcion(alumno1, algoritmos);
        alumno1.agregarInscripcion(inscripcion1);
        System.out.println(inscripcion1.Aprobada());
    }
}
