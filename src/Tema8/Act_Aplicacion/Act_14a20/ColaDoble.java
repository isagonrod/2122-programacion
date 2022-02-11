package Tema8.Act_Aplicacion.Act_14a20;

/* EJERCICIO 8.18
 * Diseña la clase ColaDoble, que hereda de Cola para enteros, añadiendo los siguientes métodos:
 *      - void encolarPrincipio(), que encola un elemento al principio de la cola.
 *      - Integer desencolarFinal(), que desencola un elemento del final de la cola.
 */

public class ColaDoble extends ColaNueva {

    void encolarPrincipio(Integer elemento) {
        super.insertarPrincipio(elemento);
    }

    Integer desencolarFinal() {
        return super.eliminar(tabla.length);
    }
}
