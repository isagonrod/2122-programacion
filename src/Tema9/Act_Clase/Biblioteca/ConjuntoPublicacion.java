package Tema9.Act_Clase.Biblioteca;

import Proyectos_Menu.Socio.Socio;

import java.util.Arrays;

public class ConjuntoPublicacion {
    Publicacion[] tablaPub;

    void altaLibro() {
        tablaPub = Arrays.copyOf(tablaPub, tablaPub.length + 1);
        this.tablaPub[tablaPub.length - 1] = Libro.pedirDatosLibro();
        Publicacion.numPublicacion++;
    }

    void altaRevista() {
        tablaPub = Arrays.copyOf(tablaPub, tablaPub.length + 1);
        //this.tablaPub[tablaPub.length - 1] = Revista.pedirDatosRevista();
        Publicacion.numPublicacion++;
    }

    int buscarLibro(int idLibro) {
        int indice = -1, i;

        for (i = 0; i < this.tablaPub.length; i++) {
            if (this.tablaPub[i].codigo == idLibro) {
                indice = i;
            }
        }
        return indice;
    }

    void prestarLibro(int codigo) {

    }

    void devolverLibro(int codigo) {

    }

    void listadoCompleto() {

    }

    void listadoRevistas() {
        int i;
        for (i = 0; i < this.tablaPub.length; i++) {
            if (tablaPub[i] instanceof Revista) {
                System.out.println(tablaPub[i]);
            }
        }
    }

    void listadoLibros() {

    }
}
