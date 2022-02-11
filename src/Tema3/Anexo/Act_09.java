package Tema3.Anexo;

import java.util.Scanner;

public class Act_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n1, n2, mayor, menor, i;
		
		do {
			System.out.println("Dame un numero: ");
			n1 = sc.nextInt();
			System.out.println("Dame otro numero: ");
			n2 = sc.nextInt();
			if (n1 == n2) {
				System.out.println("Debes introducir dos numeros distintos");
			}
		} while (n1 == n2);
		
		// Calcular cual es mayor y cual menor de los dos
		// También se podría haber utilizado el Math.max / Math.min
		
		if (n1 < n2) {
			mayor = n2;
			menor = n1;
		} else {
			mayor = n1;
			menor = n2;
		}
		
		// Mostrar por pantalla los numeros que hay entre ambos
		
		System.out.println("Los numeros que hay entre " + mayor + " y " + menor + " son: ");
		for (i = menor; i <= mayor; i++) {
			System.out.println(i);
		}
	}
}
