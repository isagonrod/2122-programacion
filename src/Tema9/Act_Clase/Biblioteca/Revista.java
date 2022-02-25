package Tema9.Act_Clase.Biblioteca;

import Utilidades.Teclado;

public class Revista extends Publicacion {
    private int numero;

    public Revista() {
        super();
        this.numero = Teclado.getNumber("Número de la revista: ");
    }

    public static Revista pedirDatosRevista() {
        return new Revista();
    }

    public String toString() {
        return super.toString() + " | Número: " + this.numero + "\n";
    }
}
