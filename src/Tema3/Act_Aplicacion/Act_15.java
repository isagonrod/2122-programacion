package Tema3.Act_Aplicacion;

import java.util.Scanner;

public class Act_15 {
	
	// Triangulo de Pascal

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int fila, i, j, k, fact1=1, fact2=1, fact3=1;
		
		System.out.println("Dame un numero: ");
		fila = sc.nextInt();
		
		for (i=0; i <= fila; i++) {
			for (j=0; j <= i; j++) {
				fact1=1; fact2=1; fact3=1;
				for (k=2; k <= i; k++) {
					fact1 *= k;
				}
				for (k=2; k <= j; k++) {
					fact2 *= k;
				}
				for (k=2; k <= (i-j); k++) {
					fact3 *= k;
				}
				System.out.print(fact1 / (fact2 * fact3) + " ");
				//System.out.print(Act_15.factorial(i) / (Act_15.factorial(j) * Act_15.factorial(i-j)) + " ");
			}
			System.out.println("");
		}
	}
	
	/* usando una funcion va perfe, pero el mismo mecanismo dentro del bucle no quiere funcionar
	 * que esta pasando??????????
	 * 
	 * EVA, ESTO NO IBA EN RECURSIVIDAD???? DEJA DE TORTURARME A LAS NIÑAS PORFA
	 */
	public static int factorial(int num) {
		int k, result=1;		
		for (k=2; k <= num; k++) {
			result *= k;
		}
		return result;
	}
}
