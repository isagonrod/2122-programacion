package Tema1.Act_Aplicacion;

import java.util.Scanner;

public class Act_22 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		double metros, cm;
		int cmRedondeo;
		
		System.out.println("Introduce la longitud alcanzada (en metros): ");
		metros = teclado.nextDouble();
		
		cm = metros*100;
		cmRedondeo = (int) cm;
		System.out.println("En el ranking esta con " + cmRedondeo + " cm");

	}

}
