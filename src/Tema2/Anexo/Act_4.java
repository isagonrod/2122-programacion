package Tema2.Anexo;

import java.util.Scanner;

public class Act_4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int diaNac, mesNac;
		
		System.out.println("Dia de nacimiento: ");
		diaNac = teclado.nextInt();
		System.out.println("Mes de nacimiento: ");
		mesNac = teclado.nextInt();
		
		if ((mesNac == 3 && diaNac >= 21) || (mesNac == 4 && diaNac <= 20)) {
			System.out.println("ARIES");
		} else if ((mesNac == 4 && diaNac >= 21) || (mesNac == 5 && diaNac <= 20)) {
			System.out.println("TAURO");
		} else if ((mesNac == 5 && diaNac >= 21) || (mesNac == 6 && diaNac <= 20)) {
			System.out.println("GEMINIS");
		} else if ((mesNac == 6 && diaNac >= 21) || (mesNac == 7 && diaNac <= 20)) {
			System.out.println("CANCER");
		} else if ((mesNac == 7 && diaNac >= 21) || (mesNac == 8 && diaNac <= 20)) {
			System.out.println("LEO");
		} else if ((mesNac == 8 && diaNac >= 21) || (mesNac == 9 && diaNac <= 20)) {
			System.out.println("VIRGO");
		} else if ((mesNac == 9 && diaNac >= 21) || (mesNac == 10 && diaNac <= 20)) {
			System.out.println("LIBRA");
		} else if ((mesNac == 10 && diaNac >= 21) || (mesNac == 11 && diaNac <= 20)) {
			System.out.println("ESCORPIO");
		} else if ((mesNac == 11 && diaNac >= 21) || (mesNac == 12 && diaNac <= 20)) {
			System.out.println("SAGITARIO");
		} else if ((mesNac == 12 && diaNac >= 21) || (mesNac == 1 && diaNac <= 20)) {
			System.out.println("CAPRICORNIO");
		} else if ((mesNac == 1 && diaNac >= 21) || (mesNac == 2 && diaNac <= 20)) {
			System.out.println("ACUARIO");
		} else if ((mesNac == 2 && diaNac >= 21) || (mesNac == 3 && diaNac <= 20)) {
			System.out.println("PISCIS");
		}
		
	}

}
