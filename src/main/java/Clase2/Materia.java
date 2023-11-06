package Clase2;

import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;
    private boolean aprobada;

    public Materia() {
    }

    public Materia(String nombre, List<Materia> correlativas, boolean aprobada) {
        this.nombre = nombre;
        this.correlativas = correlativas;
        this.aprobada = aprobada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public boolean getAprobada() {
        return aprobada;
    }

    public void setAprobada(boolean aprobada) {
        this.aprobada = aprobada;
    }

    public void agregarCorrelativa(Materia materia) {
        correlativas.add(materia);
    }
}
