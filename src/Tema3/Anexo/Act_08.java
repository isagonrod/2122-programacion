package Tema3.Anexo;

import java.util.Scanner;

public class Act_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int base, expon, result=1;
		
		System.out.println("Vamos a calcular la potencia de un numero.");
		System.out.println("Dame la base: ");
		base = sc.nextInt();
		System.out.println("Dame su exponente: ");
		expon = sc.nextInt();
		
		do {
			result = result * base;
			expon--;
		} while (expon != 0);
		
		System.out.println("La potencia de " + base + " es " + result);
	}

}
