package Tema11.Act_Ampliacion.Act_26;

/* ACTIVIDAD DE AMPLIACIÓN 11.26
 * Se quiere mantener un registro de las temperaturas máximas y mínimas diarias en una estación meteorológica.
 * Defina la clase Registro con los atributos tempMax, tempMin y fecha, cuyos valores se introducen por teclado.
 * Los dos primeros como valores double y el tercero como cadena con el formato dd/mm/aaaa.
 *
 * Implementa un programa que muestre por pantalla un menú con las opciones:
 *      1. Nuevo registro
 *      2. Mostrar historial
 *      3. Mostrar estadísticas
 *      4. Salir
 *
 * La opción 2 mostrará en cuatro columnas las fechas, los valores máximo y mínimo diario y la variación (la diferencia
 * entre el máximo y el mínimo) diaria.
 * La opción 3 mostrará los valores medios, máximos y mínimos de las temperaturas máximas, de las mínimas y de las
 * variaciones diarias.
 *
 * Todos los registros se insertarán en la tabla, que se guardará en un archivo binario de forma que, al arrancar la
 * aplicación, se leerá del archivo y al salir de ella (opción 4) se volverá a guardar actualizada.
 */

import Utilidades.Teclado;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Principal_26 {
    public static void main (String[] args) {
        ConjuntoRegistro tabla = leerFichero();
        int opc;

        do {
            menu();
            opc = Teclado.leerOpcion(1, 4);
            switch (opc) {
                case 1 -> tabla.nuevoRegistro(new Registro(Teclado.getDouble("Temp.Máxima: "), Teclado.getDouble("Temp.Mínima: "),
                        Teclado.getString("Fecha: ")));
                case 2 -> System.out.println(tabla);
                case 3 -> {
                    System.out.println("\nTEMPERATURAS MÁXIMAS\nTemperatura máxima: " + " | Temperatura mínima: " + " | Temperatura media: ");
                    System.out.println("\nTEMPERATURAS MÍNIMAS\nTemperatura máxima: " + " | Temperatura mínima: " + " | Temperatura media: ");
                    System.out.println("\nVARIACIONES\nTemperatura máxima: " + " | Temperatura mínima: " + " | Temperatura media: ");
                }
                case 4 -> {
                    System.out.println("¡Adiós!");
                }
            }
        } while (opc != 4);
    }

    static void menu() {
        System.out.println("-- MENÚ DE OPCIONES --");
        System.out.println("1. Nuevo registro");
        System.out.println("2. Mostrar historial");
        System.out.println("3. Mostrar estadísticas");
        System.out.println("4. Salir");
    }

    static ConjuntoRegistro leerFichero() {
        ConjuntoRegistro tabla = new ConjuntoRegistro();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivos_binary/empleados.dat"))) {
            while (true) {
                in.readObject();
                tabla.nuevoRegistro((Registro) in.readObject());
            }
        }
        catch (EOFException e) {
            System.out.println("Se ha leído el fichero registro.dat");
        }
        catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return tabla;
    }
}
