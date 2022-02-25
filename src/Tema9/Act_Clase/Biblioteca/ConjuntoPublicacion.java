package Tema9.Act_Clase.Biblioteca;

import java.util.Arrays;

public class ConjuntoPublicacion {
    Publicacion[] tablaPub;

    public ConjuntoPublicacion() {
        this.tablaPub = new Publicacion[0];
    }

    void altaLibro() {
        tablaPub = Arrays.copyOf(tablaPub, tablaPub.length + 1);
        this.tablaPub[tablaPub.length - 1] = Libro.pedirDatosLibro();
        Publicacion.numPublicacion++;
    }

    void altaRevista() {
        tablaPub = Arrays.copyOf(tablaPub, tablaPub.length + 1);
        this.tablaPub[tablaPub.length - 1] = Revista.pedirDatosRevista();
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

    void prestarLibro(int idLibro) {
        Integer indiceLibro = buscarLibro(idLibro);

        if (indiceLibro != -1) {
            ((Libro)tablaPub[indiceLibro]).prestar();
        }
    }

    void devolverLibro(int idLibro) {
        Integer indiceLibro = buscarLibro(idLibro);

        if (indiceLibro != -1) {
            ((Libro)tablaPub[indiceLibro]).devolver();
        }
    }

    void listadoCompleto() {
        int i;
        for (i = 0; i < this.tablaPub.length; i++) {
            System.out.println(tablaPub[i]);
        }
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
        int i;
        for (i = 0; i < this.tablaPub.length; i++) {
            if (tablaPub[i] instanceof Libro) {
                System.out.println(tablaPub[i]);
            }
        }
    }
}
