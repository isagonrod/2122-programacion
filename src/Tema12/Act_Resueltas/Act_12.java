package Tema12.Act_Resueltas;

/* ACTIVIDAD RESUELTA 12.12
 * Implementar un método estático que lleve a cabo la unión de dos conjuntos de elementos genéricos.
 * La unión es un nuevo conjunto con todos los elementos que pertenezcan, al menos, a uno de los dos conjuntos.
 * Hacer lo mismo con la intersección, formada por los elementos comunes a los dos conjuntos.
 * Los prototipos de los métodos son:
 * 	- static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2)
 * 	- static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2)
 */

import java.util.HashSet;
import java.util.Set;

public class Act_12 {
	public static void main(String[] args) {
		Set<Integer> conjunto1 = new HashSet<>();
		Set<Integer> conjunto2 = new HashSet<>();
		Set<Integer> conjunto3;

		conjunto1.add(1);
		conjunto1.add(2);
		conjunto1.add(3);

		conjunto2.add(3);
		conjunto2.add(4);
		conjunto2.add(5);

		conjunto3 = union(conjunto1, conjunto2);
		System.out.println("Unión: " + conjunto3);

		conjunto3 = interseccion(conjunto1, conjunto2);
		System.out.println("Intersección: " + conjunto3);
	}

	public static <E> Set<E> union(Set<E> conj1, Set<E> conj2) {
		Set<E> resultado = new HashSet<>(conj1);
		resultado.addAll(conj2);
		return resultado;
	}

	public static <E> Set<E> interseccion(Set<E> conj1, Set<E> conj2) {
		Set<E> interseccion = new HashSet<>(conj1);
		interseccion.retainAll(conj2);
		return interseccion;
	}
}
