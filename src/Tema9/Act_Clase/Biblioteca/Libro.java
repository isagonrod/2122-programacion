package Tema9.Act_Clase.Biblioteca;

import Utilidades.Teclado;

public class Libro extends Publicacion implements Prestable {
    private boolean prestado;

    public Libro() {
        super();
        this.prestado = false;
    }

    public boolean isPrestado() {

        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public static Libro pedirDatosLibro() {
        return new Libro();
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public boolean prestado() {
        return this.prestado;
    }

}
