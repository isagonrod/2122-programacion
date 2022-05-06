package Tema12.Act_Resueltas;

/* ACTIVIDAD RESUELTA 12.15
 * Implementar una aplicación para gestionar las existencias de una tienda de repuestos de automóviles.
 * Cada producto se identifica por un código alfanumérico.
 * La aplicación permitirá dar de alta o de baja productos y actualizar el número de unidades en stock de cada uno de ellos.
 * Los datos se mantendrán en un fichero, que deberá actualizarse al cerrar el programa.
 */

import Utilidades.Teclado;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Act_15 {
    public static void main(String[] args) {
        Map<String, Integer> existencias = new TreeMap<>();
        int opc;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/Tema12/Act_Resueltas/existencias.dat"))) {
            existencias = (TreeMap<String, Integer>) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        do {
            menu();
            opc = Teclado.leerOpcion(1, 5);
            switch (opc) {
                case 1 -> {
                    String codigo = Teclado.getString("Código producto: ");
                    if (!existencias.containsKey(codigo)) {
                        existencias.put(codigo, 0);
                    } else {
                        System.out.println("El código ya existe");
                    }
                }
                case 2 -> existencias.remove(Teclado.getString("Código producto: "));
                case 3 -> existencias.put(Teclado.getString("Código producto: "), Teclado.getNumber("Nuevo stock: "));
                case 4 -> System.out.println("Existencias: " + existencias);
                case 5 -> System.out.println("¡Adiós!");
            }
        } while (opc != 5);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/Tema12/Act_Resueltas/existencias.dat"))) {
            out.writeObject(existencias);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void menu() {
        System.out.println("-- MENÚ DE OPCIONES --");
        System.out.println("1. Alta producto");
        System.out.println("2. Baja producto");
        System.out.println("3. Cambio stock de producto");
        System.out.println("4. Listar existencias");
        System.out.println("5. Salir");
    }
}
