package Tema1.Act_Aplicacion;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Act_19 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatter = new DecimalFormat ("0.00");
		
		int inf, adult;
		double total, descuento;
		
		final double PRECIO_INFANTIL = 15.50;
		final double PRECIO_ADULTO = 20.00;
		
		System.out.println("Introduce la cantidad de entradas infantiles que desea: ");
		inf = teclado.nextInt();
		
		System.out.println("Introduce la cantidad de entradas para adultos que desea: ");
		adult = teclado.nextInt();
			
		total = (inf * PRECIO_INFANTIL) + (adult * PRECIO_ADULTO);
		descuento = total >= 100.00 ? (total*5/100) : 0;
		System.out.println("Obtiene un descuento de " + formatter.format(descuento) + " euros");
		
		total -= descuento;
		System.out.println("El importe total a pagar es de " + formatter.format(total) + " euros");
		
	}

}
