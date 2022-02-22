package Tema9.Act_Ampliacion.Act_34;

/* ACTIVIDAD DE AMPLIACIÓN 9.34
 * Las cartas, formadas por un palo y un número, son la base para muchos juegos de azar.
 * Construir las clases necesarias que permitan ordenar una serie de cartas según el palo y el número, o solamente
 * por su número.
 * Asimismo, como el azar es algo ligado a los juegos de cartas, implementar en la clase Carta un método estático que
 * construya y devuelva una carta al azar.
 */

public class Carta implements Comparable {
    final Palo palo;
    Integer num;

    public Carta(Palo palo, Integer num) {
        this.palo = palo;
        this.num = num;
    }

//    static Carta cartaAzar() {
//        palo = Math.random();
//        num = (Integer)Math.random() * 12 - 1;
//        return (new Carta(palo, num));
//    }

    @Override
    public int compareTo(Object o) { // segun palo y numero
        return 0;
    }
}
