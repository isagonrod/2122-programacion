package Tema12.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 12.21
 * Implementa una aplicación donde se insertan 20 números enteros aleatorios distintos, menores que 100, en una colección.
 * Deberán guardarse por orden decreciente a medida que se vayan generando, y se mostrará la colección resultante por
 * pantalla.
 */

import Utilidades.Valores;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Act_21 {
	public static void main(String[] args) {
		Set<Integer> numerosEnteros = new TreeSet<>(Comparator.reverseOrder());
		for (int i = 0; i < 20; i++) {
			numerosEnteros.add(Valores.generarAleatorio(1, 100));
		}
		System.out.println("Colección de números enteros: " + numerosEnteros);
	}
}
