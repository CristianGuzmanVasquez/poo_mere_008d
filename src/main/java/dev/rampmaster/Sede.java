package dev.rampmaster;

import java.util.HashSet;

public class Sede {
   private int idSede;
   private String nomSede;
   private String direccionSede;
   private HashSet<Piso> pisos;

   public Sede(int idSede, String nomSede, String direccionSede) {
       this.idSede = idSede;
       this.nomSede = nomSede;
       this.direccionSede = direccionSede;
       this.pisos = new HashSet<>();
   }

    public String getNomSede() {
        return nomSede;
    }

    public void setNomSede(String nomSede) {
        this.nomSede = nomSede;
    }

    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }

    public String getDireccionSede() {
        return direccionSede;
    }

    public void setDireccionSede(String direccionSede) {
        this.direccionSede = direccionSede;
    }

    public HashSet<Piso> getPisos() {
        return pisos;
    }

    public void setPisos(HashSet<Piso> pisos) {
        this.pisos = pisos;
    }

    public void mostrarSede(){
       System.out.println("Sede:");
       System.out.println("ID de la sede: " + idSede);
       System.out.println("Nombre de  la sede: " + nomSede);
       System.out.println("Direccion de la sede: " + direccionSede);
    }
}
