package Tema12.Act_Resueltas;

/* ACTIVIDAD RESUELTA 12.5
 * Implementar una aplicación en la que se insertan 20 números enteros aleatorios entre 1 y 10 (incluidos), que pueden
 * estar repetidos, en una colección.
 * A continuación, se crea una lista con los mismos elementos sin repeticiones.
 */

import Utilidades.Valores;

import java.util.ArrayList;
import java.util.Collection;

public class Act_05 {
	public static void main(String[] args) {
		Collection<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			lista.add(Valores.generarAleatorio(1, 10));
		}
		System.out.println("Lista: " + lista);

		Collection<Integer> listaSinRepetidos = new ArrayList<>();
		for (Integer e : lista) {
			if (!listaSinRepetidos.contains(e)) {
				listaSinRepetidos.add(e);
			}
		}
		System.out.println("Lista sin repetidos: " + listaSinRepetidos);
	}
}
