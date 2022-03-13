package Tema10.Act_Aplicacion.Act_21;

import Utilidades.Teclado;

public class Contacto implements Comparable {
    String nombre;
    String telefono;

    public Contacto() {
        this.nombre = Teclado.getString("Nombre del contacto: ");
        this.telefono = Teclado.getString("Teléfono del contacto: ");
    }

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public int compareTo(Object o) {
        return this.nombre.compareTo(((Contacto)o).nombre);
    }

    public String toString() {
        return "NOMBRE: " + this.nombre + " | TELÉFONO: " + this.telefono + "\n";
    }
}
