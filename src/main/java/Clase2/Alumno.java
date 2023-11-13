package Clase2;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Inscripcion> inscripciones = new ArrayList<>();

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarInscripcion(Inscripcion inscripcion) {
        inscripciones.add(inscripcion);
    }

    public void removerInscripcion(Inscripcion inscripcion) {
        inscripciones.remove(inscripcion);
    }

    public void mostrarInscripciones() {
        int contador = 1;
        for (Inscripcion i : inscripciones) {
            System.out.println("\n------ INSCRIPCION " + contador + " ------\n");
            System.out.println(". alumno: " + i.getAlumno().getNombre());
            System.out.println(". materia: " + i.getMateria().getNombre());
            System.out.println(". estado: " + i.Aprobada());
            System.out.println(i.estado(i.Aprobada()));
            i.getMateria().mostrarCorrelativas();
            contador++;
        }
        System.out.println("\n---------------------------");
    }
}
