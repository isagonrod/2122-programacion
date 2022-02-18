package Tema9.Act_Aplicacion.Act_11y12y15a18;

/* ACTIVIDAD 9.17
 * Escribir un programa donde se use una Lista para elementos Object para encolar y desencolar objetos de distintos
 * tipos, mostrándolos por pantalla.
 */
/* ACTIVIDAD 9.18
 * Repetir la Actividad de aplicación 9.17 con la interfaz Pila apilando y desapilando.
 */

public class PP17 {
    public static void main (String[] args) {
        Lista lista1 = new Lista();
        Lista lista2 = new Lista();

        lista1.encolar("Hola");
        lista1.encolar(2);
        lista1.encolar(5);
        lista1.encolar(9);
        System.out.println("Lista 1: " + lista1);

        lista1.desencolar();
        System.out.println("Lista 1 modificada: " + lista1);

        lista2.apilar('a');
        lista2.apilar('b');
        lista2.apilar('z');
        lista2.apilar(69);
        System.out.println("\nLista 2: " + lista2);

        lista2.desapilar();
        System.out.println("Lista 2 modificada: " + lista2);
    }
}
