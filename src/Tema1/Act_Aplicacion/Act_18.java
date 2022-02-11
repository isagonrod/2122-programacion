package Tema1.Act_Aplicacion;

import java.util.Scanner;

public class Act_18 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int horm, ara, coch, patas;
		
		System.out.println("Introduce el numero de hormigas capturadas: ");
		horm = teclado.nextInt();
		
		System.out.println("Introduce el numero de arañas capturas: ");
		ara = teclado.nextInt();
		
		System.out.println("Introduce el numero de cochinillas capturas: ");
		coch = teclado.nextInt();
		
		patas = (horm * 6) + (ara * 8) + (coch * 14);
		System.out.println("El numero total de patas es: " + patas);

	}

}
