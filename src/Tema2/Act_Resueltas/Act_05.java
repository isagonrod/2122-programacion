package Tema2.Act_Resueltas;

import java.util.Scanner;

public class Act_05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int num1, num2, mayor, menor;
		
		System.out.println("Primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("Segundo numero: ");
		num2 = teclado.nextInt();
		
		mayor = num1 < num2 ? num1 : num2;
		menor = num1 > num2 ? num1 : num2;
		
		System.out.println(mayor + ", " + menor);

	}

}
