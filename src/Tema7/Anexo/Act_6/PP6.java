package Tema7.Anexo.Act_6;

import Utilidades.Teclado;

public class PP6 {
    public static void main (String[] args) {
        int opc;
        Bidimensional matriz = new Bidimensional(4,4);
        matriz.rellenarMatriz();

        do {
            menu();
            opc = Teclado.leerOpcion(1,7);
            switch (opc) {
                case 1 -> matriz.mostrarMatriz();
                case 2 -> matriz.filaN(Teclado.getNumber("Introduce el número de la fila que quieres ver: "));
                case 3 -> matriz.columnaN(Teclado.getNumber("Introduce el número de la columna que quieres ver: "));
                case 4 -> System.out.println(matriz.get(Teclado.getNumber("Introduce la fila: "), Teclado.getNumber("Introduce la columna: ")));
                case 5-> System.out.println(matriz.esPuntoDeSilla(Teclado.getNumber("Introduce un número de la matriz: ")));
                case 6 -> matriz.diagonal();
                case 7 -> System.out.println("¡Adiós!");
            }
        } while (opc != 7);
    }

    static void menu() {
        System.out.println("-- MENÚ DE OPCIONES --");
        System.out.println("1. Mostrar matriz.");
        System.out.println("2. Fila N.");
        System.out.println("3. Columna N.");
        System.out.println("4. Buscar elemento, introduciendo fila y columna.");
        System.out.println("5. ¿Es punto de silla?");
        System.out.println("6. Diagonal principal.");
        System.out.println("7. Salir.\n");
    }
}
