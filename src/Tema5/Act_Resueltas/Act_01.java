package Tema5.Act_Resueltas;

public class Act_01 {

	/* Crear una tabla de longitud 10 que se inicializará con números aleatorios comprendidos entre 1 y 100.
	 * Mostrar la suma de todos los números aleatorios que se guardan en la tabla.
	 */

	public static void main(String[] args) {
		
		int valores [] = new int [10];
		
		for (int i = 0; i < valores.length; i++) {
			valores [i] = (int) (Math.random() * 100 + 1);
		}
		int suma = 0;
		for (int valor: valores) {
			suma += valor;
		}
		System.out.println("La suma de los valores aleatorios es: " + suma);
	}
}
