package Tema12.Act_ListIterator;

public class Persona implements Comparable, Empleado {
    private String nombre, apellidos;
    private int edad;

    public Persona(String n, String a, int e) {
        this.nombre = n;
        this.apellidos = a;
        this.edad = e;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public int getEdad() {
        return this.edad;
    }

    public boolean equals(Object o) {
        Persona p = (Persona)o;
        return p.nombre.equals(this.nombre) && p.apellidos.equals(this.apellidos) && p.edad == this.edad;
    }

    public String toString() {
        return this.apellidos + ", " + this.nombre + " (" + this.edad + ")";
    }

    @Override
    public int compareTo(Object o) {
        Persona p = (Persona)o;
        int comp = this.apellidos.compareToIgnoreCase(p.apellidos);
        if (comp == 0) {
            comp = this.nombre.compareToIgnoreCase(p.nombre);
            if (comp == 0) {
                comp = this.edad - p.edad;
            }
        }
        return comp;
    }
}
