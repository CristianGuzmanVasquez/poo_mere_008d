package dev.rampmaster;

import java.util.HashSet;

public class Sala {
   private  int numeroSala;
   private int capacidadMaxima;
   private int codigoSala;

   public Sala(int numeroSala, int capacidadMaxima, int codigoSala) {
       this.numeroSala = numeroSala;
       this.capacidadMaxima = capacidadMaxima;
       this.codigoSala = codigoSala;
   }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(int codigoSala) {
        this.codigoSala = codigoSala;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public void mostrarSala(){
       System.out.println("Sala:");
       System.out.println("Numero de sala: " + numeroSala);
       System.out.println("Capacidad maxima: " + capacidadMaxima);
       System.out.println("Codigo de sala: " + codigoSala);
    }
}
