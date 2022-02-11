package Tema1.Act_Aplicacion;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Act_11 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatter = new DecimalFormat ("0.00");
		
		System.out.println("Introduce la base imponible:" );
		double num = teclado.nextInt();
		
		System.out.println("Introduce el IVA(%): ");
		double iva = teclado.nextInt();
		
		double ivanum = (iva * num) / 100.00;
		double total = num + ivanum;
		
		System.out.println("El IVA de " + num + " es: " + formatter.format(ivanum) + "euros");
		System.out.println("El total es: " + formatter.format(total) + "euros");
		
	}

}
