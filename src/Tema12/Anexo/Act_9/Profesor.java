package Tema12.Anexo.Act_9;

import java.util.Objects;

public class Profesor {
    private String dni;
    private String nombreApellido;

    public Profesor(String dni, String nombreApellido) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
    }

    public String getDni() {
        return dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    @Override
    public String toString() {
        return this.nombreApellido + " (" + this.dni + ")";
    }

    public void insertarProfesor(String dni, String nombreApellido) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
    }

    @Override
    public boolean equals(Object o) {
        Profesor profesor = (Profesor) o;
        return dni.equals(profesor.dni) && nombreApellido.equals(profesor.nombreApellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombreApellido);
    }
}
