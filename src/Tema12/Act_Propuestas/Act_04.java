package Tema12.Act_Propuestas;

/* ACTIVIDAD PROPUESTA 12.4
 * Implementa una aplicación donde se piden por consola números reales hasta que se introduce un 0.
 * A medida que se leen del teclado, los valores positivos se insertan en una colección y los negativos en otra.
 * Al final, se muestran ambas colecciones y las sumas de los elementos de cada una de ellas.
 * Por último, se eliminan de ambas todos los valores que sean mayores que 10 o menores de -10 y se vuelven a mostrar.
 */

import Utilidades.Teclado;

import java.util.ArrayList;
import java.util.Collection;

public class Act_04 {
	public static void main(String[] args) {
		Collection<Integer> positivos = new ArrayList<>();
		Collection<Integer> negativos = new ArrayList<>();
		Integer n = Teclado.getNumber("Introduce número real (positivo o negativo): ");
		Integer sumaPositivos = 0, sumaNegativos = 0;

		while (n != 0) {
			n = Teclado.getNumber("Introduce número real (positivo o negativo): ");
			if (n > 0) {
				positivos.add(n);
				sumaPositivos = sumaPositivos + n;
			}
			else if (n < 0) {
				negativos.add(n);
				sumaNegativos = sumaNegativos + n;
			}
		}
		System.out.println("Positivos: " + positivos + " | Suma de sus elementos: " + sumaPositivos);
		System.out.println("Negativos: " + negativos + " | Suma de sus elementos: " + sumaNegativos);

		while (positivos.remove(n > 10));
		while (negativos.remove(n < -10));

		System.out.println("\nPositivos: " + positivos);
		System.out.println("Negativos: " + negativos);
	}
}