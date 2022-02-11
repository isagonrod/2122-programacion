package Tema2.Act_Propuestas;

import java.util.Scanner;

public class Act_5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		double precio, precioRebaj, precioFinal;
		int aforo, entradas;
		
		System.out.println("Aforo maximo: ");
		aforo = teclado.nextInt();
		System.out.println("Precio de las entradas: ");
		precio = teclado.nextDouble();
		System.out.println("Numero de entradas vendidas: ");
		entradas = teclado.nextInt();
		
		if (entradas <= (aforo*0.2)) {
			System.out.println("Concierto cancelado");
		} else if (entradas <= (aforo*0.5)) {
			precioRebaj = precio - (precio*0.25);
			precioFinal = precioRebaj * entradas;
			System.out.println("Entradas rebajadas un 25%");
			System.out.println("La recaudacion ha sido de: " + precioFinal + " euros");				
		} else {
			precioFinal = precio * entradas;
			System.out.println("Concierto normal");
			System.out.println("La recaudacion ha sido de: " + precioFinal + " euros");	
		}

	}

}
