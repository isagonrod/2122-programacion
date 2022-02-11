package Tema2.Anexo;

import java.util.Scanner;

public class Act_1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int dia, diaSemana;
		
		System.out.println("Dia: ");
		dia = teclado.nextInt();
		
		diaSemana = dia%7;
		
		switch (diaSemana) {
			case 1 -> {System.out.println("LUNES");}
			case 2 -> {System.out.println("MARTES");}
			case 3 -> {System.out.println("MIERCOLES");}
			case 4 -> {System.out.println("JUEVES");}
			case 5 -> {System.out.println("VIERNES");}
			case 6 -> {System.out.println("SABADO");}
			case 0 -> {System.out.println("DOMINGO");}
		}

	}

}
