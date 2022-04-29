package Tema12.Act_Ampliacion.Act_31;

/* ACTIVIDAD DE AMPLIACIÓN 12.31
 * Implementa las clases Cola y Pila genérica heredando de ArrayList.
 */

public class Act_31 {
	public static void main(String[] args) {
		Cola<Integer> cola = new Cola<>();
		Pila<Integer> pila = new Pila<>();

		cola.add(1);
		cola.encolar(2);
		cola.add(3);
		System.out.println(cola);
		cola.desencolar();
		cola.remove(0);
		System.out.println(cola);

		pila.add(4);
		pila.apilar(5);
		pila.add(6);
		System.out.println(pila);
		pila.desapilar();
		pila.remove(pila.size() - 1);
		System.out.println(pila);
	}
}
