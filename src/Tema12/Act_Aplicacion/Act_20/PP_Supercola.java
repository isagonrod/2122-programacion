package Tema12.Act_Aplicacion.Act_20;

/* ACTIVIDAD DE APLICACIÓN 12.20
 * Utilizando colecciones, implementa la clase Supercola, que tiene como atributos dos colas para enteros, en las que
 * se encola y desencola por separado.
 * Sin embargo, si una de las colas queda vacía, al llamar a su método desencolar(), se desencola de la otra mientras
 * tenga elementos.
 * Solo cuando las dos colas estén vacías, cualquier llamada a desencolar devolverá null.
 * Escribe un programa con el menú:
 *      1. Encolar en cola1.
 *      2. Encolar en cola2.
 *      3. Desencolar de cola1.
 *      4. Desencolar de cola2.
 *      5. Salir.
 * Después de cada operación se mostrará el estado de las dos colas para seguir su evolución.
 */

import Utilidades.Teclado;

public class PP_Supercola {
    public static void main(String[] args) {
        Supercola<Integer> supercola = new Supercola<>();
        int opc;

        do {
            menu();
            opc = Teclado.leerOpcion(1, 5);
            switch (opc) {
                case 1 -> {
                    supercola.encolar(Teclado.getNumber("Inserta número: "), 1);
                    System.out.println(supercola);
                }
                case 2 -> {
                    supercola.encolar(Teclado.getNumber("Inserta número: "), 2);
                    System.out.println(supercola);
                }
                case 3 -> {
                    System.out.println("Desencolado: " + supercola.desencolar(1));
                    System.out.println(supercola);
                }
                case 4 -> {
                    System.out.println("Desencolado: " + supercola.desencolar(2));
                    System.out.println(supercola);
                }
                case 5 -> System.out.println("¡Adiós!");
            }
        } while (opc != 5);
    }

    static void menu() {
        System.out.println("\n-- MENÚ DE OPCIONES --");
        System.out.println("1. Encolar en cola 1");
        System.out.println("2. Encolar en cola 2");
        System.out.println("3. Desencolar de cola 1");
        System.out.println("4. Desencolar de cola 2");
        System.out.println("5. Salir\n");
    }
}
