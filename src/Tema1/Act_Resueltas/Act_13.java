package Tema1.Act_Resueltas;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Act_13 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatter = new DecimalFormat ("0.00");
		
		int nota1, nota2, nota3, mediaBoletin;
		double mediaExp;
		
		System.out.println("Nota del primer trimestre: ");
		nota1 = teclado.nextInt();
		System.out.println("Nota del segundo trimestre: ");
		nota2 = teclado.nextInt();
		System.out.println("Nota del tercer trimestre: ");
		nota3 = teclado.nextInt();
		
		mediaExp = (nota1 + nota2 + nota3) / 3.0;
		mediaBoletin = (int) mediaExp;
		
		System.out.println("Boletin de calificaciones: " + mediaBoletin);
		System.out.println("Expediente academico: " + formatter.format(mediaExp));
		
	}

}
