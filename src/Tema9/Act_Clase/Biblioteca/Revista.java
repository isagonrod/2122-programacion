package Tema9.Act_Clase.Biblioteca;

import Utilidades.Teclado;

public class Revista extends Publicacion {
    int numero;

    public Revista(String titulo, int añoPublicacion, int numero) {
        super(titulo, añoPublicacion);
        this.numero = numero;
    }

//    public static Revista pedirDatosRevista() {
//        return pedirDatosPublicacion(), this.numero = Teclado.getNumber("Número de la revista: "); // TODO : por qué??
//    }
}
