package Tema10.Act_Aplicacion.Act_21;

import Tema9.Act_Aplicacion.Act_11y12_15a18_24y25.Lista;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Agenda extends Lista {
    public Agenda() {
        super();
    }

    void cargarTablaFichero() {
        FileInputStream in = null;
        String nombre, telefono;
        Contacto contacto;

        try {
            in = new FileInputStream("archivos_txt/agenda.txt");
            Scanner sc = new Scanner(in);

            while (sc.hasNextLine()) {
                nombre = "";

                do {
                    nombre += sc.next() + " ";
                } while (!sc.hasNextInt());
                nombre = nombre.trim(); //para quitar el espacio que sobra del do-while
                telefono = String.valueOf(sc.nextInt());

                contacto = new Contacto(nombre, telefono);

                this.encolar(contacto);
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

    void guardarTablaFichero() {
        BufferedWriter out = null;
        Contacto contacto;

        try {
            out = new BufferedWriter(new FileWriter("archivos_txt/agenda.txt"));

            while (this.getLength() > 0) {
                contacto = (Contacto)this.desencolar();

                out.write(contacto.nombre + " " + contacto.telefono);
                out.newLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }

    void insertarContacto() {
        Contacto cont1 = new Contacto();
        if (!this.buscarNombre(cont1.nombre) && this.getLength() <= 20) {
            this.encolar(cont1);
        }
        else {
            System.out.println("Registro repetido o límite de la agenda sobrepasado.");
        }
    }

    boolean buscarNombre(String nombre) {
        return this.buscar(nombre) >= 0;
    }

    void listarAgenda() {
        this.ordenar();
    }

    String buscarNombreIniciales(String inicial) {
        Contacto contacto;
        String tlf = "";

        for (Object o : this.tabla) {
            contacto = (Contacto) o;
            if (contacto.nombre.startsWith(inicial)) {
                tlf += contacto.telefono + " ";
            }
        }

        return tlf;
    }
}
