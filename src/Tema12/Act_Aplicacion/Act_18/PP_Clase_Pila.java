package Tema12.Act_Aplicacion.Act_18;

/* ACTIVIDAD DE APLICACIÓN 12.18
 * Implementa la clase Pila genérica utilizando un objeto ArrayList para guardar los elementos.
 */

public class PP_Clase_Pila {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();

        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);
        System.out.println(pila);

        pila.desapilar();
        System.out.println(pila);
    }
}
