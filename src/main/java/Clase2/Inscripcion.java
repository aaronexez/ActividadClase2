package Clase2;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private Materia materia;

    public Inscripcion() {
    }

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public boolean Aprobada() {
        List<Materia> correlativas = materia.getCorrelativas();
        boolean aprobada = true; //inicializacion

        if (correlativas == null) {
            return aprobada;
        }

        for (Materia i : correlativas) { //recorre la lista verificando el estado de la variable aprobada
            Materia correlativa = i;
            if (i.getAprobada() != true) {
                aprobada = false;
            }
        }
        if (materia.getAprobada() == true) { //si la materia a la que se trata de inscribir ya estaba aprobada se rechaza su inscripcion
            aprobada = false;
        }

        return aprobada;
    }

    public String estado(Boolean aprobada) { //mensaje que se muestra de acuerdo al estado de la inscripcion
        List<Materia> correlativas = materia.getCorrelativas();
        if (getMateria().getAprobada() == true) {
            //mensaje con color rojo ANSI en consola
            return "\u001B[31mla materia ya se encuentra aprobada, inscripcion rechazada.\u001B[0m";
        }
        if (aprobada == false) {
            //mensaje con color rojo ANSI en consola
            return "\u001B[31malguna materia correlativa no se encuentra aprobada, inscripcion rechazada.\u001B[0m";
        }
        //mensaje con color verde ANSI en consola
        return "\u001B[32minscripcion realizada con exito.\u001B[0m";
    }
}
