package Tema12.Anexo.Act_8;

/* ACTIVIDAD 9 DEL ANEXO
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja española y que sume los puntos según el juego
 * de la brisca. El valor de las cartas se debe guardar en una estructura HashMap que debe contener parejas (figura, valor),
 * por ejemplo caballo, 3.
 * La secuencia de cartas debe ser una estructura de la clase ArrayList que contiene objetos de la clase Carta.
 * El valor de las cartas es el siguiente:
 *  - as = 11
 *  - tres = 10
 *  - sota = 2
 *  - caballo = 3
 *  - rey = 4
 * El resto de cartas no vale nada.
 */

import Utilidades.Valores;

import java.util.*;

public class Brisca {
    public static void main(String[] args) {
        Map<Carta, Integer> baraja = rellenarBaraja();
        ArrayList<Carta> mano = repartirMano(baraja);

        System.out.println("\nMano recibida: " + mano);

        System.out.println("\nTotal puntos: " + calcularMano(baraja, mano));
    }

    private static Integer calcularMano(Map<Carta, Integer> baraja, ArrayList<Carta> mano) {
        Integer resultado = 0;

        for (Carta carta : mano) {
            resultado += baraja.get(carta);
        }

        return resultado;
    }

    static ArrayList<Carta> repartirMano(Map<Carta, Integer> baraja) {
        int indiceAleatorio;
        ArrayList<Carta> mano = new ArrayList<>();
        List<Object> arrayBaraja = Arrays.asList(baraja.keySet().toArray());
        Collections.shuffle(arrayBaraja);

        for (int i = 0; i < 5; i++) {
            indiceAleatorio = Valores.generarAleatorio(0, arrayBaraja.size());

            if (!mano.contains((Carta)arrayBaraja.get(indiceAleatorio))) {
                mano.add((Carta)arrayBaraja.get(indiceAleatorio));
            }
        }

        return mano;
    }

    static Map<Carta, Integer> rellenarBaraja() {
        Map<Carta, Integer> baraja = new HashMap<>();

        baraja.put(new Carta("as", "OROS"), 11);
        baraja.put(new Carta("dos", "OROS"), 0);
        baraja.put(new Carta("tres", "OROS"), 10);
        baraja.put(new Carta("cuatro", "OROS"), 0);
        baraja.put(new Carta("cinco", "OROS"), 0);
        baraja.put(new Carta("seis", "OROS"), 0);
        baraja.put(new Carta("siete", "OROS"), 0);
        baraja.put(new Carta("sota", "OROS"), 2);
        baraja.put(new Carta("caballo", "OROS"), 3);
        baraja.put(new Carta("rey", "OROS"), 4);

        baraja.put(new Carta("as", "COPAS"), 11);
        baraja.put(new Carta("dos", "COPAS"), 0);
        baraja.put(new Carta("tres", "COPAS"), 10);
        baraja.put(new Carta("cuatro", "COPAS"), 0);
        baraja.put(new Carta("cinco", "COPAS"), 0);
        baraja.put(new Carta("seis", "COPAS"), 0);
        baraja.put(new Carta("siete", "COPAS"), 0);
        baraja.put(new Carta("sota", "COPAS"), 2);
        baraja.put(new Carta("caballo", "COPAS"), 3);
        baraja.put(new Carta("rey", "COPAS"), 4);

        baraja.put(new Carta("as", "ESPADAS"), 11);
        baraja.put(new Carta("dos", "ESPADAS"), 0);
        baraja.put(new Carta("tres", "ESPADAS"), 10);
        baraja.put(new Carta("cuatro", "ESPADAS"), 0);
        baraja.put(new Carta("cinco", "ESPADAS"), 0);
        baraja.put(new Carta("seis", "ESPADAS"), 0);
        baraja.put(new Carta("siete", "ESPADAS"), 0);
        baraja.put(new Carta("sota", "ESPADAS"), 2);
        baraja.put(new Carta("caballo", "ESPADAS"), 3);
        baraja.put(new Carta("rey", "ESPADAS"), 4);

        baraja.put(new Carta("as", "BASTOS"), 11);
        baraja.put(new Carta("dos", "BASTOS"), 0);
        baraja.put(new Carta("tres", "BASTOS"), 10);
        baraja.put(new Carta("cuatro", "BASTOS"), 0);
        baraja.put(new Carta("cinco", "BASTOS"), 0);
        baraja.put(new Carta("seis", "BASTOS"), 0);
        baraja.put(new Carta("siete", "BASTOS"), 0);
        baraja.put(new Carta("sota", "BASTOS"), 2);
        baraja.put(new Carta("caballo", "BASTOS"), 3);
        baraja.put(new Carta("rey", "BASTOS"), 4);

        return baraja;
    }
}
