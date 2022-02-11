package Tema3.Act_Resueltas;

import java.util.Scanner;

public class Act_13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int nota, i, aprobados=0, suspensos=0, condicionados=0;
		
		for (i=1; i<=6; i++) {
			System.out.println("Nota del alumno " + i + ": ");
			nota = sc.nextInt();
			if (nota == 4) {
				condicionados++;
			} else if (nota >= 5) {
				aprobados++;
			} else if (nota < 4) {
				suspensos++;
			}
		}
		System.out.println("Hay " + aprobados + " aprobados");
		System.out.println("Hay " + suspensos + " suspensos");
		System.out.println("Hay " + condicionados + " condicionados");
	}

}
