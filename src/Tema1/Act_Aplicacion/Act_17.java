package Tema1.Act_Aplicacion;

import java.util.Scanner;

public class Act_17 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int med1, med2, med3, suma;
		
		System.out.println("Introduce una medida en milimetros: ");
		med1 = teclado.nextInt();
		
		System.out.println("Introduce una medida en centimetros: ");
		med2 = teclado.nextInt();
		
		System.out.println("Introduce una medida en metros: ");
		med3 = teclado.nextInt();
		
		suma = (med1 / 10) + med2 + (med3 * 100);
		System.out.println("La suma de las tres medidas es de " + suma + " centimetros.");

	}

}
