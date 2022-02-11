package Tema4.Act_Resueltas;

import java.util.Scanner;

public class Act_08 {

	// Diseñar la funcion Calculadora()

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		int operacion;
		
		System.out.println("Introduce un numero: ");
		n1 = sc.nextInt();
		System.out.println("Introduce otro numero: ");
		n2 = sc.nextInt();
		System.out.println("Introduce la operacion que desea realizar (1=suma, 2=resta, 3=multiplicacion y 4=division): ");
		operacion = sc.nextInt();
		
		double result = calculadora(n1, n2, operacion);
		
		System.out.println("El resultado de la operacion es de: " + result);
	}
	
	static double calculadora (int a, int b, int operacion) {
		double result = 0;
		switch (operacion) {
			case 1 -> {
				result = a+b;
			}
			case 2 -> {
				result = a-b;
			}
			case 3 -> {
				result = a*b;
			}
			case 4 -> {
				result = a/b;
			}
			default -> {
				System.out.println("ERROR");
			}
		}
		return result;
	}

}
