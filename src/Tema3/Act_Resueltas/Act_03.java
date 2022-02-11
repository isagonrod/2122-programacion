package Tema3.Act_Resueltas;

import java.util.Scanner;

public class Act_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num, numSecreto;
		numSecreto = (int) (Math.random() * 100 + 1);
		
		System.out.println("Introduce un numero entre el 1 y el 100: ");
		num = sc.nextInt();
		
		while (numSecreto != num && num != -1) {
			if (numSecreto < num) { 
				System.out.println("Menor");
			} else { 
				System.out.println("Mayor");
			}
			System.out.println("Introduce otro numero: ");
			num = sc.nextInt();
		}
		
		if (num == numSecreto) {
			System.out.println("�ENHORABUENA!�HAS ACERTADO!");
		} else if (num == -1) {
			System.out.println("LO SIENTO. LA PROXIMA VEZ SERA");
		}
			
	}

}
