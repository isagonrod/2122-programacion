package Tema7.Act_Resueltas.Act_10.Personal;

import java.util.Date;

public class JefeEstacion {
    String nombre;
    String dni;
    Date nombramiento;

    public JefeEstacion(String nombre, String dni, Date nombramiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.nombramiento = nombramiento;
    }

    public String toString() {
        return "JefeEstacion: " + "nombre='" + nombre + ", dni='" + dni + ", nombramiento=" + nombramiento;
    }
}
