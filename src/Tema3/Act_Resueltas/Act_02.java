package Tema3.Act_Resueltas;

import java.util.Scanner;

public class Act_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int edadAlumnos = 0, contadorAlumnos = 0, contadorMayorEdad = 0, sumaEdades = 0;
		double media;
		
		System.out.println("Cuando no haya mas alumnos, introducir un numero negativo.");
		System.out.println("Introduce una edad: ");
		edadAlumnos = sc.nextInt();
		
		while (edadAlumnos >= 0) {
			sumaEdades += edadAlumnos;
			contadorAlumnos++;
			if (edadAlumnos >= 18) {
				contadorMayorEdad++;
			}
			System.out.println("Vuelva a introducir una edad: ");
			edadAlumnos = sc.nextInt();
		}
		media = (double) sumaEdades / contadorAlumnos;
		
		System.out.println("Suma de todas las edades: " + sumaEdades);
		System.out.println("Media de edad de los alumnos: " + media);
		System.out.println("Numero de alumnos: " + contadorAlumnos);
		System.out.println("Numero de alumnos mayores de edad: " + contadorMayorEdad);

	}

}
