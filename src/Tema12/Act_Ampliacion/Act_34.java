package Tema12.Act_Ampliacion;

/* ACTIVIDAD DE AMPLIACIÓN 12.34
 * Amplía la actividad resuelta 12.14, de forma que se gestionen los registros de temperatura de diferentes días en la
 * misma aplicación.
 * Para ello, implementa un MAPA cuyas entradas tendrán como clave la fecha y como valor el conjunto de los registros
 * de un día.
 * Implementa también un programa que gestione los registros del día actual y permita visualizar los de un día cualquiera,
 * junto con sus estadísticas.
 * Al arrancar el programa se cargará en memoria el mapa a partir del fichero correspondiente y, al terminar, se volverá
 * a guardar actualizado.
 */

import Tema12.Act_Resueltas.Act_14.Registro;
import Utilidades.Teclado;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Act_34 {
    public static void main(String[] args) {
        Map<LocalDate, Set<Registro>> registroTemperaturas = leerFichero();
        int opc;

        do {
            menu();
            opc = Teclado.leerOpcion(1, 4);
            switch (opc) {
                case 1 -> {
                    String fecha = Teclado.getString("Fecha del registro: ");
                    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate fechaRegistro = LocalDate.parse(fecha, f);
                    //registroTemperaturas.put(fechaRegistro, new Registro());
                }
            }
        } while (opc != 4);
    }

    static void menu() {
        System.out.println("-- MENÚ DE OPCIONES --");
        System.out.println("1. Nuevo registro");
        System.out.println("2. Listar registros del día actual");
        System.out.println("3. Listar registros de un día concreto");
        System.out.println("4. Salir");
    }

    public static Map<LocalDate, Set<Registro>> leerFichero() {
        Map<LocalDate, Set<Registro>> mapa = new TreeMap<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/Tema12/Act_Amplicacion/registroTemp.dat"))) {
            mapa = (TreeMap<LocalDate, Set<Registro>>)in.readObject();		}
        catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return mapa;
    }

    static void guardarFichero(Map<LocalDate, Set<Registro>> conjunto) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/Tema12/Act_Amplicacion/registroTemp.dat"))) {
            out.writeObject(conjunto);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
