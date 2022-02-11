package Tema3.Act_Aplicacion;

import java.util.Scanner;

public class Act_19 {
	
	// Raiz cuadrada aproximada

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int num, i, result;
		
		System.out.println("Dame un numero: ");
		num = sc.nextInt();
		
		for (i = 1; Math.pow(i, 2) <= num; i++);
		
		if (Math.pow(i, 2) > num) {
			result = i - 1;
		} else {
			result = i;
		}
		System.out.println("La raiz cuadrada de " + num + " es " + result + " con resto " + (num-Math.pow(result,2)));
	}
}
