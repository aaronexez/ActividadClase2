package Clase2;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas = new ArrayList<>();
    private boolean aprobada;

    public Materia() {
    }

    public Materia(String nombre, boolean aprobada) {
        this.nombre = nombre;
        this.aprobada = aprobada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
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

    public void removerCorrelativa(Materia materia) {
        correlativas.remove(materia);
    }

    public void mostrarCorrelativas() {
        System.out.println("Correlativas: ");
        for (Materia i : correlativas) {
            System.out.println(". " + i.getNombre());
        }
    }
}
