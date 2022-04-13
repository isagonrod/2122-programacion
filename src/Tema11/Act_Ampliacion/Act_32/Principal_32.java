package Tema11.Act_Ampliacion.Act_32;

/* ACTIVIDAD DE AMPLIACIÓN 11.32
 * Con la clase Llamada de la Actividad de ampliación 9.31, crea un registro de las llamadas efectuadas en una centralita,
 * que se guardarán en el archivo binario centralita.dat.
 * Al arrancar la aplicación se leerán los datos del archivo y a continuación se mostrará el menú:
 * 		1. Nuevo registro de llamada.
 * 		2. Listar las llamadas de un número de teléfono.
 * 		3. Listar todas las llamadas.
 * 		4. Salir.
 * En el apartado 1, las fechas y horas se introducirán como cadenas con el formato "dd/MM/yyyy HH:mm".
 * En los apartados 2 y 3, se mostrará el número de teléfono del titular, el del interlocutor, la fecha y hora de inicio
 * (con el formato aludido antes) y la duración en minutos de cada llamada.
 * Los registros se insertarán en una tabla por su orden natual.
 * Al terminar la aplicación se guardará la tabla actualizada en el mismo archivo.
 */

import Utilidades.Teclado;

import java.io.*;
import java.util.Arrays;

public class Principal_32 {
    public static void main (String[] args) {
        ConjuntoLlamadas registro = cargarFichero();
        int opc;

        do {
            menu();
            opc = Teclado.leerOpcion(1, 4);
            switch (opc) {
                case 1 -> registro.nuevoRegistroLlamada(new Llamada(
                        Teclado.getString("Teléfono cliente: "),
                        Teclado.getString("Teléfono interlocutor: "),
                        Teclado.getString("Inicio de la llamada: "),
                        Teclado.getString("Final de la llamada: ")));
                case 2 -> System.out.println(Arrays.toString(registro.mostrarListaLlamadas(Teclado.getString("Teléfono cliente: "))));
                case 3 -> System.out.println(Arrays.toString(registro.getTabla()));
                case 4 -> {
                    guardarFichero(registro);
                    System.out.println("¡Adiós!");
                }
            }
        } while (opc != 4);
    }

    static void menu() {
        System.out.println("-- MENÚ DE OPCIONES --");
        System.out.println("1. Nuevo registro de llamadas");
        System.out.println("2. Listar las llamadas de un número de teléfono");
        System.out.println("3. Listar todas las llamadas");
        System.out.println("4. Salir");
    }

    static ConjuntoLlamadas cargarFichero() {
        ConjuntoLlamadas tabla = new ConjuntoLlamadas();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivos_binary/centralita.dat"))) {
            while (true) {
                tabla.nuevoRegistroLlamada((Llamada) in.readObject());
            }
        }
        catch (EOFException ex) {
            System.out.println("Fin de fichero");
        }
        catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return tabla;
    }

    static void guardarFichero(ConjuntoLlamadas tabla) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("archivos_binary/centralita.dat"))) {
            for (Object elemento : tabla.getTabla()) {
                out.writeObject(elemento);
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
