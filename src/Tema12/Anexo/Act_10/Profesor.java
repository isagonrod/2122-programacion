package Tema12.Anexo.Act_10;

import Utilidades.Teclado;

public class Profesor {
    private String dni;
    private String nombreApellido;

    public Profesor(String dni) {
        this.dni = dni;
    }

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
        return this.nombreApellido + "(" + this.dni + ")";
    }

    public void insertarProfesor(String dni, String nombreApellido) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
    }
}
