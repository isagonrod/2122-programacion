package Tema3.Act_Resueltas;

import java.util.Scanner;

public class Act_12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int nota, i;
		boolean suspenso = false;
		
		for (i = 0; i < 5; i++) {
			System.out.println("Introduzca la nota (de 0 a 10): ");
			nota = sc.nextInt();
			if (nota < 5) {
				suspenso = true;
			}
		}
		if (suspenso) {
			System.out.println("Hay algunos suspensos");
		} else {
			System.out.println("No hay ningun suspenso");
		}
	}

}
