package Tema2.Anexo;

import java.util.Scanner;

public class Act_2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int diaSemana, diaMes, result;
		
		System.out.println("Introduce dia de la semana que corresponda con el dia 1 (1 = lunes, 2 = martes, 3 = miercoles, 4 = jueves, 5 = viernes,"
				+ "6 = sabado, 0 = domingo: ");
		diaSemana = teclado.nextInt();
		
		switch (diaSemana) {
			case 1 -> {System.out.println("LUNES");}
			case 2 -> {System.out.println("MARTES");}
			case 3 -> {System.out.println("MIERCOLES");}
			case 4 -> {System.out.println("JUEVES");}
			case 5 -> {System.out.println("VIERNES");}
			case 6 -> {System.out.println("SABADO");}
			case 0 -> {System.out.println("DOMINGO");}
		}	
		
		System.out.println("Introduce cualquier dia del mes: ");
		diaMes = teclado.nextInt();
		
		diaSemana = diaSemana - 1;
		diaMes = diaMes + diaSemana;
		result = diaMes % 7;
		
		switch (result) {
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

