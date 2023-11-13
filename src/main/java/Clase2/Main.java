package Clase2;

public class Main {
    public static void main(String[] args) {
//------crear materias
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos", true);

        Materia paradigmas = new Materia("Paradigmas de Programacion", false);
        paradigmas.agregarCorrelativa(algoritmos);

        Materia disenio = new Materia("Diseño de Sistemas", false);
        disenio.agregarCorrelativa(paradigmas);
        disenio.agregarCorrelativa(algoritmos);
//------crear alumnos
        Alumno alumno1 = new Alumno("Aaron");
//------crear inscripciones
        Inscripcion inscripcion1 = new Inscripcion(alumno1, disenio);
        alumno1.agregarInscripcion(inscripcion1);
        Inscripcion inscripcion2 = new Inscripcion(alumno1, paradigmas);
        alumno1.agregarInscripcion(inscripcion2);
        Inscripcion inscripcion3 = new Inscripcion(alumno1, algoritmos);
        alumno1.agregarInscripcion(inscripcion3);
//------mostrar inscripciones
        alumno1.mostrarInscripciones();
    }
}
