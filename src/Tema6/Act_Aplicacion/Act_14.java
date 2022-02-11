package Tema6.Act_Aplicacion;

import java.util.Arrays;
import java.util.Scanner;

public class Act_14 {
    /* Diseña una aplicación que se comporte con una pequeña agenda.
     * Mediante un menú el usuario podrá elegir entre:
     *      a) Añadir un nuevo contacto (nombre y teléfono).
     *      b) Buscar el teléfono de un contacto a partir de su nombre.
     *      c) Mostrar la información de todos los contactos ordenados alfabéticamente mediante el nombre.
     *      d) Salir.
     * Pista: El nombre y el teléfono se pueden codificar como una única cadena con la forma << nombre : teléfono >>
     */
    public static void main (String[] args) {
        String[] agenda = new String[0];
        char menu = 0;

        do {
            mostrarMenu ();
            menu = pedirOpcion();
            switch (menu) {
                case 'a' -> agenda = nuevoContacto(agenda);
                case 'b' -> buscarTelefono(agenda);
                case 'c' -> mostrarInfo(agenda);
                case 'd' -> System.out.println("ADIÓS");
            }
        } while (menu != 'd');
    }

    static void mostrarMenu() {
        System.out.println("\n -- MENÚ -- ");
        System.out.println("a) Añadir un nuevo contacto (nombre y teléfono)");
        System.out.println("b) Buscar el teléfono de un contacto a partir de su nombre");
        System.out.println("c) Mostrar la información de todos los contactos ordenados alfabéticamente mediante el nombre");
        System.out.println("d) Salir\n");
    }

    static char pedirOpcion () {
        char opcionValida;
        do {
            opcionValida = getString("¿Qué quieres hacer?").charAt(0);
        } while (opcionValida < 'a' || opcionValida > 'd');
        return opcionValida;
    }

    static String[] nuevoContacto (String[] agenda) {
        String nombre = getString("Nombre: ");
        String tfno = getString("Teléfono: ");
        String contacto = (nombre + " : " + tfno);
        agenda = Arrays.copyOf(agenda,agenda.length+1);
        agenda[agenda.length - 1] = contacto;
        return agenda;
    }

    static void buscarTelefono (String[] agenda) {
        String nombre = getString("Nombre a buscar: ");
        int encontrados = 0;

        for (String contacto: agenda) {
            String aux[] = contacto.split(" : ");
            if (aux[0].startsWith(nombre)) {
                System.out.println(aux[1] + "\n");
                encontrados++;
            }
        }
        /* for (int i = 0; i < agenda.length; i++) {
            int busqueda = agenda[i].indexOf(nombre);
            if (busqueda != -1) {
                System.out.println(agenda[i]);
                encontrados++;
            }
        } */

        if (encontrados == 0) {
            System.out.println("No se ha encontrado ese contacto");
        }
    }

    static void mostrarInfo (String[] agenda) {
        String agendaCompleta = Arrays.toString(agenda);
        System.out.println(agendaCompleta);
    }

    static String getString (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
