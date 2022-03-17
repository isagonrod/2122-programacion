package Tema10.Act_Ampliacion.Act_31;

/* ACTIVIDAD DE AMPLIACIÓN 10.31
 * Se pretende mantener los datos de los clientes de un banco en un archivo de texto.
 * De cada cliente se guardará: DNI, nombre completo, fecha de nacimiento y saldo.
 * Implementa una aplicación que arranque mostrando en el menú:
 *  1. Alta cliente.
 *  2. Baja cliente.
 *  3. Listar clientes.
 *  4. Salir.
 * Implementa la clase Cliente con los atributos referidos.
 *
 * Nada más arrancar la aplicación se leerán del archivo los datos de los clientes construyendo los objetos Cliente de
 * todos ellos, que se irán insertando en una tabla de clientes.
 *
 * Cuando se dé de alta uno nuevo, se creará el objeto correspondiente y se insertará de la tabla.
 * Al listar los clientes, se mostrará el DNI, el nombre, el saldo y la edad de todos ellos, así como el saldo máximo,
 * el mínimo y el promedio del conjunto de los clientes.
 * Al cerrar la aplicación, se guardarán en el archivo los datos actualizados con el mismo formato.
 */

import Utilidades.Teclado;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Act_31 {
    public static void main (String[] main) {
        ConjuntoCliente banco = leerFichero();

        int opc;

        do {
            menu();
            opc = Teclado.leerOpcion(1, 4);
            switch (opc) {
                case 1 -> banco.altaCliente();
                case 2 -> banco.bajaCliente(Teclado.getString("DNI del cliente que quieres dar de baja: "));
                case 3 -> banco.listarClientes();
                case 4 -> {
                    guardarFichero(banco);
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

    static ConjuntoCliente leerFichero() {
        FileInputStream in;
        Scanner sc;
        ConjuntoCliente contenido = new ConjuntoCliente();

        try {
            in = new FileInputStream("archivos_txt/ficheroBanco.txt");
            sc = new Scanner(in);

            while (sc.hasNextLine()) {
                String linea[] = sc.nextLine().split("\s\s\s");
                contenido.encolar(new Cliente(linea[0], linea[1], linea[2], Double.valueOf(linea[3])));
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return contenido;
    }

    static void guardarFichero(ConjuntoCliente tabla) {
        BufferedWriter bw = null;
        String linea;
        Cliente elemento;

        try {
            bw = new BufferedWriter(new FileWriter("archivos_txt/ficheroBanco.txt"));

            while(tabla.getLength() > 0) {
                elemento = (Cliente)tabla.desencolar();
                linea = elemento.getDni() + "\s\s\s" + elemento.getNombreCompleto() + "\s\s\s"
                        + elemento.getFechaNacimiento().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
                        + "\s\s\s" + elemento.getSaldo();
                bw.write(linea);
                bw.newLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
