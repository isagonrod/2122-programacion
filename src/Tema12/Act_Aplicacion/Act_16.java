package Tema12.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 12.16
 * Implementa una aplicación que gestione los socios de un club usando la clase Socio implementada en la actividad
 * resuelta 12.11.
 * En particular, se deberán ofrecer las opciones de alta, baja y modificación de los datos de un socio.
 * Además, se listarán los socios por nombre o por antigüedad en el club.
 */

import Tema12.Act_Resueltas.Act_11.Socio;
import Utilidades.Teclado;

import java.util.ArrayList;
import java.util.List;

public class Act_16 {
    public static void main(String[] args) {
        List<Socio> club = new ArrayList<>();
        int opc;

        do {
            menu();
            opc = Teclado.leerOpcion(1, 4);
        }
        while (opc != 4);
    }

    static void menu() {
        System.out.println("-- MENÚ DE OPCIONES --");
        System.out.println("1. Alta");
        System.out.println("2. Baja");
        System.out.println("3. Modificación");
        System.out.println("4. Salir");
    }
}
