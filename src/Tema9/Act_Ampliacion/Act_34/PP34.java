package Tema9.Act_Ampliacion.Act_34;

import Tema9.Act_Aplicacion.Act_11y12_15a18_24y25.Lista;

public class PP34 {
    public static void main (String[] args) {
        Lista baraja = new Lista();

        baraja.apilar(Carta.cartaAzar());
        baraja.apilar(Carta.cartaAzar());

        System.out.println("BARAJA: " + baraja);

        baraja.ordenar();
        baraja.ordenar(new ComparaNumero());
    }
}