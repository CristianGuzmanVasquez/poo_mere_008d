package dev.rampmaster;

public abstract class Usuario {
    protected String run;
    protected String primerNombre;
    protected String segundoNombre;
    protected String primerApellido;
    protected String segundoApellido;
    protected String fechaNacimiento;
    protected String correoAcademico;

    public Usuario(String run, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String fechaNacimiento, String correoAcademico) {
        this.run = run;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.correoAcademico = correoAcademico;
    }
    public abstract void mostrarDatos();
}
