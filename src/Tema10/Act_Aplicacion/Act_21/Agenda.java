package Tema10.Act_Aplicacion.Act_21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Agenda {
    Contacto[] tabla;

    public Agenda() {
        this.tabla = new Contacto[20];
    }

    void cargarTablaFichero() { // TODO : No sé si esto está así bien
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("archivos_txt/agenda.txt"));
            String linea = in.readLine();
            while (linea != null) {
                for (int i = 0; i < tabla.length; i++) {
                    System.arraycopy(tabla, 0, linea, 0, tabla.length-1);
                    linea = in.readLine();
                }
            }
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
    }

    Contacto insertarContacto() {
        Contacto cont1 = new Contacto();
        // TODO: cont1.buscarNombre() -> para que el nombre no esté repetido
        return cont1;
    }

    boolean buscarNombre() {
        boolean resultado = false;
        // TODO
        return resultado;
    }

    void listarAgenda() {
        Arrays.sort(tabla);
        System.out.println(tabla.toString());
    }

    String buscarNombreIniciales(String inicial) {
        String tlf = "";
        // TODO
        return tlf;
    }
}
