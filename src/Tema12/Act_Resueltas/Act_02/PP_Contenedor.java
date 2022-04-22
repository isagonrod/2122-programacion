package Tema12.Act_Resueltas.Act_02;

/* ACTIVIDAD RESUELTA 12.2
 * Implementar, con tipos genéricos, la clase Contenedor, donde podremos guardar tantos objetos como deseemos.
 * Para ello utilizaremos una tabla, que inicialmente tendrá tamaño cero y se irá redimensionando según añadamos o
 * eliminemos elementos.
 * La clase, además del constructor y toString(), tendrá los siguientes métodos:
 *      - void insertarAlPrincipio(T nuevo)
 *      - void insertarAlFinal(T nuevo)
 *      - T extraerDelPrincipio()
 *      - T extraerDelFinal()
 *      - void ordenar()
 */

import Utilidades.Valores;

public class PP_Contenedor {
    public static void main(String[] args) {
        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);

        for (int i = 0; i < 20; i++) {
            c.insertarAlFinal(Valores.generarAleatorio(1, 20));
        }
        System.out.println("Sin ordenar: " + c);

        c.ordenar();
        System.out.println("Ordenado: " + c);

        Integer n = c.extraerDelPrincipio();
        System.out.println("Elemento extraído: " + n);
        System.out.println("Después de extraer: " + c);
    }
}
