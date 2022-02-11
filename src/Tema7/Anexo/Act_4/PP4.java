package Tema7.Anexo.Act_4;

/* Crea un proyecto para organizar a un conjunto de personas que se apuntan a una asociación.
 * De cada persona interesa saber sus datos básicos: NIF, nombre completo y fecha de nacimiento.
 * Cuando cada nuevo socio se da de alta, se le asigna un código de asociado único y se anota la fecha de alta (del sistema)
 * de forma automática.
 * Crear un menú con las siguientes opciones:
 *      a. Alta de socio (pedir datos: nif, nombre y fecha de nacimiento): Crear una clase Fecha propia (día, mes y año)
 *      b. Modificación de fecha de nacimiento (pedir el número de socio).
 *      c. Listado completo.
 *      d. Listado completo ordenado según el nombre.
 *      e. Listado completo ordenado según la fecha de nacimiento.
 *      f. Salir.
 */

import Utilidades.Teclado;

public class PP4 {
    public static void main (String[] args) {
        ConjuntoPersona asociacion = new ConjuntoPersona();
        Persona persona;
        int opc = 0;

        do {
            menu();
            opc = Teclado.leerOpcion(1,6);
            switch (opc) {
                case 1 -> {asociacion.altaSocio();}
                case 2 -> {asociacion.modificarFechaNacimiento(Teclado.getNumber("Introducir número de socio a modificar: "));}
                case 3 -> {asociacion.listadoCompleto();}
                case 4 -> {asociacion.listadoOrdenadoNombre();}
                case 5 -> {asociacion.listadoOrdenaFecha();}
                case 6 -> System.out.println("¡Adiós!¡Hasta pronto!");
            }
        } while (opc != 6);
    }

    static void menu() {
        System.out.println("\n-- MENÚ DE OPCIONES --");
        System.out.println("1. Alta de socio");
        System.out.println("2. Modificación de fecha de nacimiento");
        System.out.println("3. Listado completo");
        System.out.println("4. Listado completo ordenado según el nombre");
        System.out.println("5. Listado completo ordenado según la fecha de nacimiento");
        System.out.println("6. Salir\n");
    }
}
