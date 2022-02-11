package Tema3.Act_Propuestas;

import java.util.Scanner;

public class Act_Clase_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num, i = 0, suma = 0;
		double media = 0;
		
		do {
			System.out.println("Introduce un numero: ");
			num = sc.nextInt();
			suma += num;
			i++;
		} while (suma < 10000);
		
		// Meter un IF para no sumar el ultimo numero introducido si con ello se sobrepasa de 10.000
		
		media = suma / i;
		
		System.out.println("El total acumulado es de: " + suma);
		System.out.println("El total de numeros introducidos es de: " + i);
		System.out.println("La media de todos los numeros es: " + media);
	}
}
