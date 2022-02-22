package Tema5.Act_Aplicacion;

import java.util.Arrays;
import java.util.Scanner;

public class Act_19 {

	/* Diseña una aplicación para gestionar la llegada a meta de los participantes de una carrera.
	 * Cada uno de ellos dispone de un dorsal (un número entero) que los identifica.
	 * En la aplicación se introduce el número de dorsal de cada corredor cuando este llega a la meta.
	 * Para indicar que la carrera ha finalizado (han llegado todos los corredores a la meta),
	 * se introduce como dorsal el número -1.
	 * 
	 * A continuación, la aplicación solicita información extra de los corredores.
	 * En primer lugar, se introducen los dorsales de todos los corredores menores de edad; para premiarlos
	 * por su esfuerzo se les avanza un puesto en el ranking general de la carrera, es decir, es como si 
	 * hubieran adelandao al corredor que llevaban delante.
	 * En segundo lugar, se introducen los dorsales de los corredores que han dado positivo en el test 
	 * antidopaje, lo que provoca su expulsión inmediata.
	 * Para finalizar, se introducen los dorsales de los corredores que no han pagado su inscripción en la
	 * carrera, lo que provoca que se releguen a los últimos puestos del ranking general.
	 * La aplicación debe mostrar los dorsales de los corredores que han conseguido las medallas de oros, plata y bronce.
	 */

	public static void main(String[] args) {
		
		int dorsal = 0, dorsalMenor = 0, dorsalPositivo = 0, dorsalImpagado = 0;
		int carrera[] = new int [0];
		
		do {
			dorsal = getNumber("Introduce dorsal: ");
			if (dorsal != -1) {
				carrera = Arrays.copyOf(carrera, carrera.length+1);
				carrera[carrera.length-1] = dorsal;
			}
		} while (dorsal != -1);
		
		/* Menores de edad */
		do {
			dorsalMenor = getNumber("Dorsal de menor de edad: ");
			if (dorsalMenor != -1) {
				avanzaPuesto (carrera, dorsalMenor);
			}			
		}
		while (dorsalMenor != -1);
		
		/* Positivos dopaje */
		do {
			dorsalPositivo = getNumber("Dorsal positivo en dopaje: ");
			if (dorsalPositivo != -1) {
				carrera = eliminar (carrera, dorsalPositivo);
			}
		}
		while (dorsalPositivo != -1);
		
		/* Impagados */
		do {
			dorsalImpagado = getNumber("Dorsal impagado: ");
			if (dorsalImpagado != -1) {
				ultimoPuesto (carrera, dorsalImpagado);
			}
		}
		while (dorsalImpagado != -1);
		
		/* Podium */
		System.out.println("\nMEDALLERO:");
		System.out.println("Medalla de oros: " + carrera[0]);
		System.out.println("Medalla de plata: " + carrera[1]);
		System.out.println("Medalla de bronce: " + carrera[2]);

	}
	
	static int getNumber (String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();
	}
	
	static int buscar (int vector[], int clave) {
		boolean encontrado = false;
		int resultado = -1;
		int i;
		for (i = 0; i < vector.length && !encontrado; i++) {
			if (clave == vector[i]) {
				encontrado = true;
			}
		}
		
		if (encontrado) {
			resultado = i-1;
		}
		
		return resultado;
	}
	
	static void avanzaPuesto (int ranking[], int dorsal) {
		int posicion = buscar(ranking, dorsal), aux;
		
		if (posicion == -1) {
			System.out.println("Error: el dorsal " + dorsal + " no existe.");
		} else if (posicion == 0) { //no interesa avanzarlo si ya es el primero
			System.out.println("Error: el dorsal " + dorsal + " ya está en primera posición.");
		} else {
			aux = ranking[posicion-1];
			ranking[posicion-1] = ranking[posicion];
			ranking[posicion] = aux;
		}
	}
	
	static int [] eliminar (int ranking[], int dorsal) {
		int posicion = buscar (ranking, dorsal);
		if (posicion == -1) {
			System.out.println("Error: el dorsal " + dorsal + " no existe.");
		} else {
			System.arraycopy(ranking, posicion + 1, ranking, posicion, ranking.length - posicion -1);
			ranking = Arrays.copyOf(ranking, ranking.length-1);
		}
		return ranking;
	}
	
	static void ultimoPuesto (int ranking[], int dorsal) {
		int posicion = buscar(ranking, dorsal);
		if (posicion == -1) {
			System.out.println("Error: el dorsal " + dorsal + " no existe.");
		} else {
			System.arraycopy(ranking, posicion + 1, ranking, posicion, ranking.length - posicion - 1);
			ranking[ranking.length - 1] = dorsal;
		}
	}
}
