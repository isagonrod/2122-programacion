package Tema5.Act_Aplicacion;

import java.util.Arrays;

public class Act_20 {

	/* La fusión de dos tablas ordenadas consiste en copiar todos sus elementos (de ambas tablas) en una tercera que deberá seguir ordenada.
	 * Podemos realizar una fusión "ineficiente" copiando los elementos de ambas tablas (sin tener en cuenta el orden) en la tabla final y 
	 * ordenar esta.
	 * Existe una manera óptima de realizar la fusión en la que se elige en cada momento el primer elemento no copiado de alguna de las tablas
	 * y se añade a la tabla final, que seguirá ordenada sin necesidad de ordenación alguna.
	 * 
	 * Busca información sobre el algoritmo de fusión e impleméntalo en Java.
	 */

	public static void main (String args[]) {
		int vector1[] = new int[5], vector2[] = new int[5], vector3[];

		rellenar(vector1, 50);
		rellenar(vector2, 50);

		Arrays.sort(vector1);
		Arrays.sort(vector2);

		System.out.println(Arrays.toString(vector1));
		System.out.println(Arrays.toString(vector2));

		vector3 = fusionar(vector1, vector2);

		System.out.println(Arrays.toString(vector3));
	}

	static void rellenar (int vector[], int valorMaximo) {
		int aux;
		for (int i = 0; i < vector.length; i++) {
			aux = (int)(Math.random() * valorMaximo);
			vector[i] = aux;
		}
	}

	static int[] fusionar (int vector1[], int vector2[]) {
		int resultado[] = new int[0], indice1 = 0, indice2 = 0, indice3 = 0;

		while (indice1 < vector1.length && indice2 < vector2.length) {
			if (vector1[indice1] < vector2[indice2]) {
				resultado = Arrays.copyOf(resultado, resultado.length + 1);
				resultado[indice3] = vector1[indice1];
				indice1++;
				indice3++;
			} else if (vector1[indice1] > vector2[indice2]) {
				resultado = Arrays.copyOf(resultado, resultado.length + 1);
				resultado[indice3] = vector2[indice2];
				indice2++;
				indice3++;
			} else {
				resultado = Arrays.copyOf(resultado, resultado.length + 1);
				resultado[indice3] = vector1[indice1];
				indice1++;
				indice2++;
				indice3++;
			}
		}

		while (indice1 < vector1.length - 1) {
			resultado = Arrays.copyOf(resultado, resultado.length + 1);
			resultado[indice3] = vector1[indice1];
			indice1++;
			indice3++;
		}
		while (indice2 < vector2.length - 1) {
			resultado = Arrays.copyOf(resultado, resultado.length + 1);
			resultado[indice3] = vector2[indice2];
			indice2++;
			indice3++;
		}

		return resultado;
	}

}
