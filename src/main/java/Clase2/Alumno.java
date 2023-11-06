package Clase2;

import java.util.List;

public class Alumno {
    private String nombre;
    private List<Inscripcion> inscripciones;

    public Alumno() {
    }

    public Alumno(String nombre, List<Inscripcion> inscripciones) {
        this.nombre = nombre;
        this.inscripciones = inscripciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(List<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }
    public void agregarInscripcion(Inscripcion inscripcion) {
        inscripciones.add(inscripcion);
    }
}
