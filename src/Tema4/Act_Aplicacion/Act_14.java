package Tema4.Act_Aplicacion;

import java.util.Scanner;

public class Act_14 {

	// Escribe una funcion a la que se le pase dias, horas y minutos. Calculara y devolvera el numero en segundos

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int dias, horas, minutos;
		
		System.out.println("Introduce una cantidad de dias: ");
		dias = sc.nextInt();
		System.out.println("Introduce una cantidad de horas: ");
		horas = sc.nextInt();
		System.out.println("Introduce una cantidad de minutos: ");
		minutos = sc.nextInt();
		
		System.out.println("Total en segundos = " + suma(dias, horas, minutos));
	}
	
	static int suma (int dias, int horas, int minutos) {
		int suma;
		int segDias, segHoras, segMin;
		
		segDias = (dias * 24) * 1200;
		segHoras = horas * 1200;
		segMin = minutos * 60;
		suma = segDias + segHoras + segMin;
		
		return suma;
	}
}
