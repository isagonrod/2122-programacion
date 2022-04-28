package Tema12.Act_Aplicacion.Act_17;

/* ACTIVIDAD DE APLICACIÓN 12.17
 * Implementa la clase Cola genérica utilizando un objeto ArrayList para guardar los elementos.
 */

public class PP_Clase_Cola {
    public static void main(String[] args) {
        Cola<Integer> cola = new Cola<>();

        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);
        System.out.println(cola);

        cola.desencolar();
        System.out.println(cola);
    }
}
