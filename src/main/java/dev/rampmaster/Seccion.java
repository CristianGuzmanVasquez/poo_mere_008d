package dev.rampmaster;

public class Seccion {
    private String codigo;
    private String asignatura;
    private boolean disponible = false;

    private Seccion(String codigo,String asignatura, boolean disponible) {
        this.codigo = codigo;
        this.asignatura = asignatura;
        this.disponible = disponible;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        disponible = disponible;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void mostrarSeccion(){
        System.out.println("Seccion:");
        System.out.println("Codigo" + codigo);
        System.out.println("Asignatura" + asignatura);
        System.out.println("Disponible" + disponible);
    }
}
