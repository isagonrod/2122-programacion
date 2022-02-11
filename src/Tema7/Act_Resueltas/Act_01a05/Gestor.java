package Tema7.Act_Resueltas.Act_01a05;

/* Para cumplir los requisitos:
 *      - Todos los constructores usarán el nombre y el teléfono.
 *      - El importe máximo autorizado tendrá un valor por defecto de 10.000 euros.
 *      - El teléfono será privado con un método get() para que se pueda consultar.
 *      - El nombre será público y el importe máximo usará visibilidad por defecto.
 */

public class Gestor {
    public String nombre;
    private String tlf;
    double importeMax;

    public Gestor(String nombre, String tlf, double importeMax) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.importeMax = importeMax;
    }

    public Gestor(String nombre, String tlf) {
        this(nombre, tlf, 10000.0);
    }

    String getTlf() {
        return tlf;
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + tlf);
        System.out.println("Importe máximo: " + importeMax + " euros");
    }
}
