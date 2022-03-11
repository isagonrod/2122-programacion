package Tema10.Act_Aplicacion.Act_21;

/* ACTIVIDAD DE APLICACIÓN 10.21
 * Diseña una pequeña agenda, que muestre el siguiente menú:
 *  1. Nuevo contacto.
 *  2. Buscar por nombre.
 *  3. Mostrar todos. (ordenar por nombre)
 *  4. Salir.
 *
 * En ella, guardaremos el nombre y el teléfono de un máximo de 20 personas.
 * La opción 1 nos permitirá introducir un nuevo contacto siempre y cuando la agenda no esté llena, comprobando que el
 * nombre no se encuentra insertado ya.
 * La opción 2 muestra todos los teléfonos que coinciden con la cadena que se busca. Por ejemplo, si tecleamos "Pe",
 * mostrará el teléfono de Pedro, de Pepe y de Petunia.
 * La opción 3 mostrará un listado con toda la información (nombres y teléfonos) ordenados alfabéticamente por el nombre.
 * Por último, la opción 4 guarda todos los datos de la agenda en el archivo agenda.txt
 * La próxima vez que se ejecute la aplicación, si hay datos guardados, se cargarán en memoria.
 */

import Utilidades.Teclado;
import Utilidades.Valores;

public class Act_21 {
    public static void main (String[] args) {
        Agenda miAgenda = new Agenda();
        int opc;
        String inicial;

        /*

        agenda.cargarTablaFichero();
        do {
            menu();
            opc = Teclado.leerOpcion(1,4);
            switch (opc) {
                case 1 -> agenda.insertarContacto();
                case 2 -> agenda.buscarNombreIniciales(inicial = Teclado.getString("Introduce las iniciales del nombre: ");
                case 3 -> agenda.listarAgenda();
                case 4 -> {
                    agenda.cargarTablaFichero();
                    System.out.println("¡Adiós! ¡Hasta la próxima!");
                }
            }
        } while (opc != 4);

        */
    }

    static void menu() {
        System.out.println("\n-- MENÚ DE OPCIONES : AGENDA --");
        System.out.println("1. Nuevo contacto");
        System.out.println("2. Buscar por nombre");
        System.out.println("3. Mostrar todos");
        System.out.println("4. Salir\n");
    }
}
