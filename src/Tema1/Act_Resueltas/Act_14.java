package Tema1.Act_Resueltas;

import java.util.Locale;
import java.util.Scanner;

public class Act_14 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		teclado.useLocale(Locale.US);
		
		double num;
		int redondeo;
		
		System.out.println("Introduce un numero con decimales: ");
		num = teclado.nextDouble();
		
		redondeo = (int) (num + 0.5);
		redondeo = (int) Math.round(num); //Miguel: esto es menos flamenco xD
		System.out.println("El redondeo de " + num + " es: " + redondeo);

	}

}
