package Tema2.Act_Aplicacion;

import java.util.Scanner;

public class Act_13 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int comidaDiaria, numAnimales, kilosPorAnimal;
		
		System.out.println("Cantidad de comida diaria comprada: ");
		comidaDiaria = teclado.nextInt();
		System.out.println("Numero de animales de la granja: ");
		numAnimales = teclado.nextInt();
		System.out.println("Media (en kilos) de comida consumida por cada animal: ");
		kilosPorAnimal = teclado.nextInt();
		
		if (kilosPorAnimal * numAnimales >= comidaDiaria) {
			System.out.println("Hay comida suficiente");
		} else {
			System.out.println("No hay comida suficiente");
			System.out.println("Cada animal tendrá que comer " + comidaDiaria / numAnimales + " kilos");
		}

	}

}
