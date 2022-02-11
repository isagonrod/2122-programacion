package Tema2.Act_Resueltas;

import java.util.Scanner;

public class Act_14 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int day, month, year;
		
		System.out.println("Dia: ");
		day = teclado.nextInt();
		System.out.println("Mes: ");
		month = teclado.nextInt();
		System.out.println("A�o: ");
		year = teclado.nextInt();
		
		int daysOfMonth;
		daysOfMonth = switch (month) {
			case 2 -> 28;
			case 1, 3, 5, 7, 8, 10, 12 -> 31;
			default -> 30;
		};
		
		day++;
		if (day > daysOfMonth) {
			day = 1;
			month++;
		}
		
		if (month > 12) {
			month = 1;
			year++;
		}
		
		if (year == 0) {
			year = 1;
		}
		
		System.out.println("Fecha: " + day + " / " + month + " / " + year);

	}
	
}
