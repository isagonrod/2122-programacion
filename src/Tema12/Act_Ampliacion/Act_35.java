package Tema12.Act_Ampliacion;

/* ACTIVIDAD DE AMPLIACIÓN 12.35
 * Con la clase Jornada definida en la actividad de ampliación 9.28, implementa una aplicación que gestione las jornadas
 * de los trabajadores de una empresa por medio de colecciones, incluyendo altas y bajas de trabajadores y altas de
 * jornadas, así como el listado de las jornadas de un trabajador.
 * Los datos se guardarán en un fichero binario.
 */

import Tema9.Act_Ampliacion.Act_28a30.Jornada;
import Utilidades.Fechas;
import Utilidades.Teclado;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Act_35 {
    public static void main (String[] args) {
        Map<String, List<Jornada>> trabajadores = leerFichero();
        int opc;

        do {
            menu();
            opc = Teclado.leerOpcion(1, 5);
            switch (opc) {
                case 1 -> {
                    trabajadores.put(Teclado.getString("DNI de nuevo trabajador: "), new ArrayList<>());
                }
                case 2 -> {
                    trabajadores.remove(Teclado.getString("DNI del trabajador a eliminar: "));
                }
                case 3 -> {
                    String dni = Teclado.getString("DNI del trabajador: ");
                    List<Jornada> jornadasTrabajador = trabajadores.get(dni);
                    if (jornadasTrabajador != null) {
                        String fecha = Teclado.getString("Fecha de entrada: ");
                        LocalDateTime fechaEntrada = Fechas.formatearFecha(fecha, "dd/MM/yyyy HH:mm");
                        fecha = Teclado.getString("Fecha de salida: ");
                        LocalDateTime fechaSalida = Fechas.formatearFecha(fecha, "dd/MM/yyyy HH:mm");
                        jornadasTrabajador.add(new Jornada(dni, fechaEntrada, fechaSalida));
                    } else {
                        System.out.println("El trabajador no existe.");
                    }
                }
                case 4 -> {
                    String dni = Teclado.getString("DNI del trabajador a listar: ");
                    System.out.println(trabajadores.get(dni));
                }
                case 5 -> {
                    guardarFichero(trabajadores);
                    System.out.println("¡Adiós!");
                }
            }
        } while (opc != 5);
    }

    static void menu() {
        System.out.println("-- MENÚ DE OPCIONES --");
        System.out.println("1. Alta de trabajador");
        System.out.println("2. Baja de trabajador");
        System.out.println("3. Alta de jornada");
        System.out.println("4. Listar jornadas");
        System.out.println("5. Salir");
    }

    public static Map<String, List<Jornada>> leerFichero() {
        Map<String, List<Jornada>> mapa = new TreeMap<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/Tema12/Act_Ampliacion/registroJornadas.dat"))) {
            mapa = (TreeMap<String, List<Jornada>>)in.readObject();
        }
        catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return mapa;
    }

    static void guardarFichero(Map<String, List<Jornada>> conjunto) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/Tema12/Act_Ampliacion/registroJornadas.dat"))) {
            out.writeObject(conjunto);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
