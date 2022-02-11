package Tema1.Anexo;

import java.util.Scanner;

public class Act_1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int num;		
		boolean positivo;
		
		System.out.println("Introduce un numero (positivo o negativo): ");
		num = teclado.nextInt();
		
		positivo = (num >=0);
		System.out.println("El numero es positivo: " + positivo);
		
	}

}
