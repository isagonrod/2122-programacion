package Tema7.Act_Resueltas.Act_11a13;

/* EJERCICIO RESUELTO 7.13.
 * Una pila es una estructura dinámica de datos donde los elementos se insertan (se apilan) y se retiran (se desapilan)
 * siguiendo la norma de que el último que se apila será el primero en desapilarse, como ocurre con una pila de platos.
 * Cuando vamos a retirar un plato de una pila a nadie se le ocurre tirar de uno de los de abajo; retiramos (desapilamos)
 * el que está encima de todos, que fue el último en ser apilado.
 * Se llama CIMA de la pila al último elemento apilado (o al primer elemento para desapilar).
 * Los métodos fundamentales de una pila son apilar() y desapilar().
 *
 * Implementar la clase Pila para números Integer, donde se usa una lista (un objeto de la clase Lista implementada en
 * la Actividad resuelta 7.11) para guardar los elementos apilados.
 */

public class Pila {
    private Lista lista;

    public Pila() {
        lista = new Lista();
    }

    void apilar(Integer elemento) {
        lista.insertarFinal(elemento);
    }

    Integer desapilar() {
        return lista.eliminar(lista.tabla.length - 1);
    }

    public void mostrar() {
        lista.mostrar();
    }
}
