package Tema7.Act_Resueltas.Act_11a13;

import Utilidades.Teclado;
import Utilidades.Vectores;

public class PP11 {
    public static void main (String[] args) {
        int opcion;
        Lista tabla = new Lista(), tablaNueva = new Lista();

        do {
            menu();
            opcion = Teclado.leerOpcion(1, 11);
            switch (opcion) {
                case 1 -> tabla.insertarPrincipio(Teclado.getNumber("Escribe un número nuevo para insertar al principio: "));
                case 2 -> tabla.insertarFinal(Teclado.getNumber("Escribe un número nuevo para insertar al final: "));
                case 3 -> tabla.insertar(Teclado.getNumber("Escribe una posición para insertar: "), Teclado.getNumber("Escribe un número nuevo para insertar: "));
                case 4 -> { Vectores.rellenarVector(tablaNueva.tabla, 1, 100); tabla.insertarFinal(tablaNueva); }
                case 5 -> tabla.buscar(Teclado.getNumber("Escribe un número para buscar: "));
                case 6 -> tabla.get(Teclado.getNumber("Escribe un número para buscar: "));
                case 7 -> tabla.eliminar(Teclado.getNumber("Escribe una posición para eliminar: "));
                case 8 -> tabla.mostrar();
                case 9 -> System.out.println("Hay " + tabla.numeroElementos() + " elementos en la lista");
                case 10 -> Lista.concatena(tabla, tablaNueva);
                case 11 -> System.out.println("¡Adiós!");
            }
        } while (opcion != 11);

    }

    static void menu(){
        System.out.println("\n-- MENÚ DE OPCIONES --");
        System.out.println("1. Insertar un número al principio de la lista");
        System.out.println("2. Insertar un número al final de la lista");
        System.out.println("3. Insertar un número en un lugar concreto de la lista");
        System.out.println("4. Agregar otra lista a la que ya hay");
        System.out.println("5. Buscar la posición concreta de un número");
        System.out.println("6. Buscar un número concreto dentro de la lista");
        System.out.println("7. Eliminar un elemento de la lista");
        System.out.println("8. Mostrar la lista");
        System.out.println("9. Mostrar número de elementos de la lista");
        System.out.println("10. Concatenar varias listas");
        System.out.println("11. Salir\n");
    }
}
