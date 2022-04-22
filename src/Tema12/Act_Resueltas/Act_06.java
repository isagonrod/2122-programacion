package Tema12.Act_Resueltas;

/* ACTIVIDAD RESUELTA 12.6
 * Implementar una aplicación donde se insertan 100 números enteros aleatorios entre 1 y 10 (incluidos), que pueden estar
 * repetidos, en una colección.
 * Después se eliminan todos los elementos que valen 5.
 * Mostrar la colección antes y después de la eliminación.
 */

import Utilidades.Valores;

import java.util.ArrayList;
import java.util.Collection;

public class Act_06 {
	public static void main(String[] args) {
		Collection<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			lista.add(Valores.generarAleatorio(1, 10));
		}
		System.out.println("Lista: " + lista);
		while (lista.remove(5));
		System.out.println("Lista sin nº5: " + lista);
	}
}
