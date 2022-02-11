package Tema4.Act_Aplicacion;

import java.util.Scanner;

public class Act_15 {

	/* Diseña una función a la que se le pasan las horas y minutos de dos instantes de tiempo,
	 * con el siguiente prototipo:
	 * 		static int diferenciaMin (int hora1, int minuto1, int hora2, int minuto2)
	 * La función devolverá la cantidad de minutos que existen de diferencia entre los dos instantes utilizados.
	 */

	public static void main(String[] args) {
		
		int hora1;
		int minuto1;
		int hora2;
		int minuto2;
		int result;
		
		hora1 = getNumber("Introduce la primera hora: ");
		minuto1 = getNumber("Introduce los primeros minutos: ");
		hora2 = getNumber("Introduce la segunda hora: ");
		minuto2 = getNumber("Introduce los segundos minutos: ");

		result = diferenciaMin (hora1, minuto1, hora2, minuto2);
		
		System.out.println("La diferencia en minutos entre ambos instantes es de " + result + " minutos");
	}
	
	static int getNumber(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();
	}
	
	static int diferenciaMin (int hora1, int minuto1, int hora2, int minuto2) {
		int resta;
		int suma1, suma2;
		suma1 = (hora1 * 60) + minuto1;
		suma2 = (hora2 * 60) + minuto2;
		resta = suma2 - suma1;
		return resta;
	}
}
