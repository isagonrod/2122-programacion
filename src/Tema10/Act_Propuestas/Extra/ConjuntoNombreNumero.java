package Tema10.Act_Propuestas.Extra;

import java.io.*;
import java.util.Arrays;

public class ConjuntoNombreNumero {
    NombreNumero[] tabla;

    public ConjuntoNombreNumero() {
        this.tabla = new NombreNumero[0];
    }

    // insertarNuevo (NombreNumero obj)
    public void insertarNuevo (NombreNumero nuevo) {
        this.tabla = Arrays.copyOf(tabla, tabla.length + 1);
        this.tabla[this.tabla.length - 1] = nuevo;

        if (buscarNombre(nuevo.nombre) != -1) {
            // si encontrado, meter en tabla el nombre en la parte de nombres, y todos los números encontrados
        }
    }

    // int buscarNombre (String nombre) => devuelve la posición
    public int buscarNombre (String nombre) {
        int posicion = -1, i;

        for (i = 0; i < tabla.length; i++) {
            if (this.tabla[i].nombre == nombre) {
                posicion = i;
            }
        }

        return posicion;
    }

    // leerFichero (String nombreFichero)
    static String[] leerFichero(String nombreFichero) {
        BufferedReader in = null;
        String[] contenido = new String[5];

        try {
            in = new BufferedReader(new FileReader("archivos_txt/" + nombreFichero + ".txt"));
            String linea = in.readLine();
            contenido = linea.split(", ");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (in != null) {
                try {
                    in.close();
                }
                catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
        return contenido;
    }

    // mostrarTabla()

    // escribirFichero()
    static void escribirFichero(String[] contenido) {
        BufferedWriter out = null;

        try {
            out = new BufferedWriter(new FileWriter("archivos_txt/nombres3.txt"));
            out.write(String.valueOf(contenido));
            out.newLine();
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
        finally {
            if (contenido != null) {
                try {
                    out.close();
                }
                catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
