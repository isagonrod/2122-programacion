package Tema1.Anexo;

import java.util.Scanner;

public class Act_7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		String nombre;
		int edad;
		
		System.out.println("Introduce tu nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Introduce tu edad: ");
		edad = teclado.nextInt();
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);

	}

}
