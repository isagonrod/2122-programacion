package Tema12.Act_Propuestas;

/* ACTIVIDAD PROPUESTA 12.3
 * Repite la Actividad resuelta 12.6 usando un iterador para eliminar los elementos cuyo valor es 5.
 */

import Utilidades.Valores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Act_03 {
	public static void main(String[] args) {
		Collection<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			lista.add(Valores.generarAleatorio(1, 10));
		}
		System.out.println("Lista: " + lista);

		for (Iterator<Integer> it = lista.iterator(); it.hasNext();) {
			Integer n = it.next();
			if (n == 5) {
				it.remove();
			}
		}

		System.out.println("Lista sin nº5: " + lista);
	}
}
