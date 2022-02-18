package Tema9.Act_Aplicacion.Act_11y12y15a18;

import Utilidades.Teclado;

public class PP15 {
    public static void main (String[] args) {
        Supercola supercola = new Supercola();
        int opc;

        do {
            menu();
            opc = Teclado.leerOpcion(1,5);
            switch (opc) {
                case 1 -> supercola.cola1.encolar(Teclado.getNumber("Inserta número: "));
                case 2 -> supercola.cola2.encolar(Teclado.getNumber("Inserta número: "));
                case 3 -> supercola.cola1.desencolar();
                case 4 -> supercola.cola2.desencolar();
                case 5 -> System.out.println("¡Adiós!");
            }
        } while (opc != 5);
    }

    static void menu() {
        System.out.println("-- MENÚ DE OPCIONES --");
        System.out.println("1. Encolar en cola1");
        System.out.println("2. Encolar en cola2");
        System.out.println("3. Desencolar de cola1");
        System.out.println("4. Desencolar de cola2");
        System.out.println("5. Salir");
    }
}
