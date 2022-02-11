package Tema7.Act_Resueltas.Act_10.Personal;

public class Maquinista {
    String nombre;
    String dni;
    double sueldo;
    String rango;

    public Maquinista(String nombre, String dni, double sueldo, String rango) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }

    public String toString() {
        return "Maquinista: " + "nombre='" + nombre + ", dni='" + dni + ", sueldo=" + sueldo + ", rango='" + rango;
    }
}
