package Tema7.Act_Aplicacion.Act_11;

/*
 * Escribe una clase MarcaPagina, que ayuda a llevar el control de la lectura de un libro.
 * Deberá disponer de métodos para incrementar la página leída, para obtener información de
 * la última página que se ha leído y para comenzar desde el principio una lectura del mismo libro.
 */

public class MarcaPagina {

    int pag;

    void incrementar () {
        this.pag++;
    }

    void info () {
        System.out.println(pag);
    }

    void empezar () {
        this.pag = 1;
    }
}
