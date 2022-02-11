package Tema1.Act_Aplicacion;

import java.util.Scanner;

public class Act_14 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int base, altura, area;
		
		System.out.println("Introduce lo que mide la base del triangulo: ");
		base = teclado.nextInt();
		
		System.out.println("Introduce lo que mide la altura del triangulo: ");
		altura = teclado.nextInt();
		
		area = (base * altura) / 2;
		System.out.println("El area del triangulo es " + area);

	}

}
