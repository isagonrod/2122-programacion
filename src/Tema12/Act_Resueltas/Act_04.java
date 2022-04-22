package Tema12.Act_Resueltas;

/* ACTIVIDAD RESUELTA 12.4
 * Implementar una aplicación que pida por consola números enteros no negativos hasta que se introduce -1.
 * Los números se irán insertando en una colección, pudiéndose repetir.
 * Al terminar, se mostrará la colección por pantalla.
 * A continuación, se mostrarán todos los valores pares.
 * Por último, se eliminarán todos los múltiplos de 3 y se mostrará por pantalla la colección resultante.
 */

import Utilidades.Teclado;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Act_04 {
	public static void main(String[] args) {
		Collection<Integer> numeros = new ArrayList<>();
		Integer n = Teclado.getNumber("Introducir entero: ");
		while (n >= 0) {
			numeros.add(n);
			n = Teclado.getNumber("Introducir entero: ");
		}
		System.out.println("Lista completa: " + numeros);
		System.out.print("Pares: ");
		for (Integer a : numeros) {
			if (a % 2 == 0) {
				System.out.print(a + " ");
			}
		}
		System.out.println("");
		for (Iterator<Integer> it = numeros.iterator(); it.hasNext();) {
			n = it.next();
			if (n % 3 == 0) {
				it.remove();
			}
		}
		System.out.println("No múltiplos de 3: " + numeros);
	}
}
