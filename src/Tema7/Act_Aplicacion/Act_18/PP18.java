package Tema7.Act_Aplicacion.Act_18;

/* Introducir un menú de opciones:
 *      1. Encolar
 *      2. Desencolar
 *      3. Mostrar
 *      4. Salir
 */

import Utilidades.Teclado;

public class PP18 {
    public static void main(String[] args) {
        Cola cola = new Cola();
        int opc;

        do {
            menu();
            opc = Teclado.leerOpcion(1,4);
            switch (opc) {
                case 1 -> cola.encolar(Teclado.getNumber("Inserta un número: "));
                case 2 -> cola.desencolar();
                case 3 -> System.out.println(cola.toString());
                case 4 -> System.out.println("¡Adiós!");
            }
        } while (opc != 4);
    }

    static void menu() {
        System.out.println("-- MENÚ DE OPCIONES --");
        System.out.println("1. Encolar.");
        System.out.println("2. Desencolar.");
        System.out.println("3. Mostrar.");
        System.out.println("4. Salir.");
    }
}
