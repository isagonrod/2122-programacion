package Tema8.Act_Ampliacion.Act_25y27a28;

/* EJERCICIO 8.28
 * Implementa la clase Suceso, que hereda de Punto3D.
 * Un suceso está caracterizado de forma única por el lugar y el instante en que ocurre (el atributo tiempo de tipo int).
 * Añade un atributo descripcion de tipo String.
 * Implementa el método equals() para sucesos.
 */

public class Suceso extends Punto3D {
    int tiempo;
    String descripcion;

    public Suceso(int x, int y, int z, int tiempo, String descripcion) {
        super(x, y, z);
        this.tiempo = tiempo;
        this.descripcion = descripcion;
    }

    public String toString() {
        return "Suceso: " + descripcion + "; ocurrido en: " + super.toString() + "; durante " + this.tiempo + " minutos.";
    }

    public boolean equals(Suceso otroSuceso) {
        return super.equals(otroSuceso) && this.tiempo == otroSuceso.tiempo && this.descripcion == otroSuceso.descripcion;
    }
}
