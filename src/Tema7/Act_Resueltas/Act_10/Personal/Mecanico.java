package Tema7.Act_Resueltas.Act_10.Personal;

public class Mecanico {
    String nombre;
    String telefono;
    Especialidad especialidad;

    public Mecanico(String nombre, String telefono, String especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = Especialidad.valueOf(especialidad);
    }

    public String toString() {
        return "Mecanico: " + "nombre='" + nombre + ", telefono='" + telefono + ", especialidad=" + especialidad;
    }
}
