package Tema12.Act_Resueltas.Act_13;

/* ACTIVIDAD RESUELTA 12.13
 * Implementar la clase Sorteo con parámetros genéricos.
 * Deberá guardar un conjunto de valores distintos de tipo genérico, suministrados por consola y será capaz de generar
 * una combinación premiada de un tamaño determinado.
 * Deberán implementarse, como mínimo, los métodos:
 *      - boolean add(T elemento), que añadirá un elemento nuevo al conjunto de valores posibles en una apuesta.
 *          Si el elemento se añade, devuelve true y, en caso contrario, debido a que ya estaba presente, false.
 *      - Set<T> premiados(int numPremiados), que devolverá una combinación ganadora de numPremiados elementos distintos.
 */

public class PP_Sorteo {
    public static void main(String[] args) {
        Sorteo<Integer> sorteo = new Sorteo<>();
        for (int i = 0; i < 100; i++) {
            sorteo.add(i);
        }
        System.out.println(sorteo);
        System.out.println("Premiados: " + sorteo.premiados(20));
    }
}
