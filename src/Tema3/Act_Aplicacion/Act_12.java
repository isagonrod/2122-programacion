package Tema3.Act_Aplicacion;

import java.util.Scanner;

public class Act_12 {
	
	// Pasar de binario a decimal

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int binario, result = 0, i = 0;
		
		System.out.println("Introduce un numero en binario (empezando por la derecha)");
		System.out.println("Inserta -1 para finalizar");
		
		do {
			System.out.println("Numero: ");
			binario = sc.nextInt();
			if (binario != -1) {
				result = (int) (binario * Math.pow(2, i)) + result;
			}
			i++;
		} while (binario != -1);
		
		System.out.println("El resultado en decimal es: " + result);		

	}

}
