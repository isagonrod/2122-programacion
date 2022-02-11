package Tema2.Act_Resueltas;

import java.util.Scanner;

public class Act_12 {

	/* Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
	 * Hay que tener en cuenta que existen meses con 28, 30 y 31 días (no se
	 * considerará los años bisiestos).
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int day, month, year;
		boolean date;
		
		System.out.println("Introduce el dia: ");
		day = teclado.nextInt();
		System.out.println("Introduce el mes: ");
		month = teclado.nextInt();
		System.out.println("Introduce el a�o: ");
		year = teclado.nextInt();
		
		if (year == 0) {
			date = false;
		} else {
			if (month == 2 && (1 <= day && day <= 28)) {
				date = true;
			} else {
				if ((month == 4 || month == 6 || month == 9 || month == 11) && (1 <= day && day <= 30)) {
					date = true;
				} else {
					if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (1 <= day && day <= 31)) {
						date = true;
					} else {
						date = false;
					}
				}
				
			}
		}
		
		if (date == true) {
			System.out.println("Fecha correcta: " + day + " / " + month + " / " + year);
		} else {
			System.out.println("Fecha incorrecta");
		}
		
	}

}
