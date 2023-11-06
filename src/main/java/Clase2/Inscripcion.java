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
        boolean aprobada = true;

        if (correlativas == null) {
            return aprobada;
        }

        for (int i = 0; i < correlativas.size(); i++) {
            Materia correlativa = correlativas.get(i);
            if (correlativa.getAprobada() != true){
                aprobada = false;
            }
        }
        return aprobada;
    }
}
