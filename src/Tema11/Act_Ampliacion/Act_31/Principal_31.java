package Tema11.Act_Ampliacion.Act_31;

/* ACTIVIDAD DE AMPLIACIÓN 11.31
 * Se quieren mantener los datos de los clientes de un banco en un archivo binario.
 * De cada cliente se guardará: DNI, nombre completo, fecha de nacimiento y saldo.
 * Implementa una aplicación que arranque mostrando el menú:
 * 		1. Alta cliente.
 * 		2. Baja cliente.
 * 		3. Listar clientes.
 * 		4. Salir.
 * Implementa la clase Cliente con los atributos referidos.
 * Los objetos Cliente irán insertados en un objeto Lista de tipo Object.
 * Nada más arrancar la aplicación se leerá del archivo la lista de clientes.
 * Cuando se dé de alta uno nuevo, se creará el objeto correspondiente y se insertará en la lista por orden de DNI.
 * Para eliminar un cliente, se pedirá el DNI y se eliminará de la lista.
 * Al listar los clientes, se mostrará el DNI, el nombre, el saldo y la edad de todos ellos, así como el saldo máximo,
 * el mínimo y el saldo promedio del conjunto de los clientes.
 * Al cerrar la aplicación, se guardará en el archivo la lista actualizada.
 */

import Tema9.Act_Aplicacion.Act_11y12_15a18_24y25.Lista;
import Utilidades.Teclado;

import java.io.*;
import java.util.Arrays;

public class Principal_31 {
    public static void main (String[] args) {
        Lista tablaClientes = cargarFichero();
        int opc;

        do {
            menu();
            opc = Teclado.leerOpcion(1, 4);
            switch (opc) {
                case 1 -> {
                    Cliente nuevo = new Cliente(
                            Teclado.getString("DNI: "),
                            Teclado.getString("Nombre: "),
                            Teclado.getString("Fecha de nacimiento: "),
                            Teclado.getDouble("Saldo: "));
                    int pos = Arrays.binarySearch(tablaClientes.getTabla(), nuevo);
                    pos = pos < 0 ? Math.abs(pos) - 1 : pos;
                    tablaClientes.insertar(pos, nuevo);
                }
                case 2 -> tablaClientes.eliminar(buscar(tablaClientes, Teclado.getString("Introduce DNI de cliente a eliminar: ")));
                case 3 -> listarClientes(tablaClientes);
                case 4 -> {
                    guardarFichero(tablaClientes);
                    System.out.println("¡Adiós!");
                }
            }
        } while (opc != 4);
    }

    static void menu() {
        System.out.println("\n-- MENÚ DE OPCIONES --");
        System.out.println("1. Alta cliente");
        System.out.println("2. Baja cliente");
        System.out.println("3. Listar clientes");
        System.out.println("4. Salir\n");
    }

    static Lista cargarFichero() {
        Lista tabla = new Lista();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivos_binary/clientes_Act_31.dat"))) {
            while (true) {
                tabla.encolar(in.readObject());
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

    static void guardarFichero(Lista tabla) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("archivos_binary/clientes_Act_31.dat"))) {
            for (Object elemento : tabla.getTabla()) {
                out.writeObject(elemento);
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static int buscar(Lista tabla, String dni) {
        int indice = -1;
        for (int i = 0; i < tabla.getLength() && indice == -1; i++) {
            if (((Cliente)tabla.get(i)).getDni().compareToIgnoreCase(dni) == 0) {
                indice = i;
            }
        }
        return indice;
    }

    static void listarClientes(Lista tabla) {
        double aux, saldoMax = 0, saldoMin = 9999999, saldoProm = 0;
        Object[] listado = tabla.getTabla();

        for (Object cliente : listado) {
            aux = ((Cliente)cliente).getSaldo();

            if (aux < saldoMin) {
                saldoMin = aux;
            }
            if (aux > saldoMax) {
                saldoMax = aux;
            }
            saldoProm += aux;
            saldoProm /= tabla.getLength();
        }

        System.out.println(tabla);
        System.out.println(
                "\nSaldo máximo del conjunto de clientes: " + saldoMax +
                "\nSaldo mínimo del conjunto de clientes: " + saldoMin +
                "\nSaldo promedio del conjunto de clientes: " + saldoProm
        );
    }


}
