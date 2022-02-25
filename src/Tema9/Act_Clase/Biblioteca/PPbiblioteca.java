package Tema9.Act_Clase.Biblioteca;

import Utilidades.Teclado;

public class PPbiblioteca {
    public static void main (String[] args) {
        ConjuntoPublicacion biblioteca = new ConjuntoPublicacion();
        int opc;

        do {
            menu();
            opc = Teclado.leerOpcion(1,8);
            switch (opc) {
                case 1 -> biblioteca.altaLibro();
                case 2 -> biblioteca.altaRevista();
                case 3 -> biblioteca.prestarLibro(Teclado.getNumber("Introduce el código identificativo del libro: "));
                case 4 -> biblioteca.devolverLibro(Teclado.getNumber("Introduce el código identificativo del libro: "));
                case 5 -> biblioteca.listadoCompleto();
                case 6 -> biblioteca.listadoRevistas();
                case 7 -> biblioteca.listadoLibros();
                case 8 -> System.out.println("¡Adiós!");
            }
        } while (opc != 8);
    }

    static void menu() {
        System.out.println("\n-- MENÚ DE OPCIONES --");
        System.out.println("1. Dar de alta un LIBRO");
        System.out.println("2. Dar de alta una REVISTA");
        System.out.println("3. Prestar un LIBRO");
        System.out.println("4. Devolver un LIBRO");
        System.out.println("5. Listado completo de PUBLICACIONES");
        System.out.println("6. Listado de REVISTAS");
        System.out.println("7. Listado de LIBROS");
        System.out.println("8. Salir\n");
    }
}
