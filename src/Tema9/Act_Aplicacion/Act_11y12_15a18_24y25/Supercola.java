package Tema9.Act_Aplicacion.Act_11y12_15a18_24y25;

/* ACTIVIDAD 9.15
 * Implementar la clase Supercola, que tiene como atributos dos colas para enteros, en las que se encola y desencola por
 * separado. Sin embargo, si una de las colas queda vacía, al llamar a su método desencolar, se desencola de la otra
 * mientras tenga elementos.
 * Solo cuando las dos colas estén vacías, cualquier llamada a desencolar devolverá null.
 * Escribir un programa con el menú:
 *      1. Encolar en cola1.
 *      2. Encolar en cola2.
 *      3. Desencolar en cola1.
 *      4. Desencolar en cola2.
 *      5. Salir.
 * Después de cada operación se mostrará el estado de las dos colas para seguir su evolución.
 */

public class Supercola {
    Cola cola1;
    Cola cola2;

    public Supercola() {
        this.cola1 = new Lista();
        this.cola2 = new Lista();
    }

    public void encolar(Object nuevo, Integer objetivo) {
        if (objetivo == 1) {
            cola1.encolar(nuevo);
        }
        else if (objetivo == 2) {
            cola2.encolar(nuevo);
        }
    }

    public Object desencolar(Integer objetivo) {
        Object resultado = null;

        if (objetivo == 1) {
            resultado = cola1.desencolar();
            if (resultado == null) {
                resultado = cola2.desencolar();
            }
        }
        else if (objetivo == 2) {
            resultado = cola2.desencolar();
            if (resultado == null) {
                resultado = cola1.desencolar();
            }
        }

        return resultado;
    }

    public String toString() {
        return "Cola 1: " + cola1 +
                "\nCola 2: " + cola2;
    }
}
