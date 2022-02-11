package Tema5.Act_Aplicacion;

import java.util.Arrays;

public class Act_15 {

	/* Debe desarrollar una aplicación que ayude a gestionar las notas de un centro educativo.
	 * Los alumnos se organizan en grupos compuestos por 5 personas.
	 * Leer las notas (números enteros) del primer, segundo y tercer trimestre de un grupo.
	 * Debes mostrar al final la nota media del grupo en cada trimestre y la media del alumno que se encuentra en una
	 * posición dada (que el usuario introduce por teclado).
	 */

	public static void main(String[] args) {
		
		int nota = 0;
		int trimestre1[] = new int [5];
		int trimestre2[] = new int [5];
		int trimestre3[] = new int [5];

		rellenar (trimestre1, nota);
		rellenar (trimestre2, nota);
		rellenar (trimestre3, nota);
		
		System.out.println("Primer trimestre: " + Arrays.toString(trimestre1));
		System.out.println("Segundo trimestre: " + Arrays.toString(trimestre2));
		System.out.println("Tercer trimestre: " + Arrays.toString(trimestre3));
		
		System.out.println("\nMedia del primer trimestre: " + media(trimestre1));
		System.out.println("Media del segundo trimestre: " + media(trimestre2));
		System.out.println("Media del tercer trimestre: " + media(trimestre3));
		
		for (int i = 0; i < 5; i++) {
			System.out.println("\nNota media del alumno " + i + ": " + notaMedia(trimestre1[i], trimestre2[i], trimestre3[i]));
		}
		
	}
	
	static void rellenar (int vector[], int nElementos) {
		for (int i = 0; i < vector.length; i++) {
			nElementos = (int)(Math.random() * 11);
			vector[i] = nElementos;
		}
	}
	
	static int media (int vector[]) {
		int suma = 0;
		for (int i = 0; i < vector.length; i++) {
			suma += vector[i];
		}
		suma /= vector.length;
		return suma;
	}
	
	static int notaMedia (int t1, int t2, int t3) {
		return (t1 + t2 + t3) /3;
	}
}
