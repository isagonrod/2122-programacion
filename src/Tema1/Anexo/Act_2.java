package Tema1.Anexo;

import java.util.Scanner;

public class Act_2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int num;
		
		System.out.println("Introduce un numero: ");
		num = teclado.nextInt();
		
		boolean par = (num%2) == 0;
		System.out.println("El numero es par: " + par);	
	}

}
