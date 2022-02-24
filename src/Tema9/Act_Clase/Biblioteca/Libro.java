package Tema9.Act_Clase.Biblioteca;

public class Libro extends Publicacion implements Prestable {
    private boolean prestado;

    public Libro(String titulo, int añoPublicacion) {
        super(titulo, añoPublicacion);
        this.prestado = false;
    }

    public static Libro pedirDatosLibro() {
        return pedirDatosLibro();
    }

    @Override
    public void prestar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public boolean prestado() {
        return false;
    }
}
