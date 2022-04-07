package Tema11.Práctica;

public class Alumno {
    private String nombre;
    private String dni;
    private CalificacionAsignatura[] notas;

    public Alumno(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.notas = new CalificacionAsignatura[5];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public CalificacionAsignatura[] getNotas() {
        return notas;
    }

    public void setNotas(CalificacionAsignatura[] notas) {
        this.notas = notas;
    }
}
