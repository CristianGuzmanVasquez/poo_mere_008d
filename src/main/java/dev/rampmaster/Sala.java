package dev.rampmaster;

import java.util.HashSet;

public class Sala {
    private  String codigoSala;
    private int numeroAsientos;
    private int maximoEstudiantes;
    private boolean disponible;

    public Sala(String codigoSala, int numeroAsientos, int maximoEstudiantes) {
        this.codigoSala = codigoSala;
        this.numeroAsientos = numeroAsientos;
        this.maximoEstudiantes = maximoEstudiantes;
        this.disponible = true;

    }
}
