package Tema3.Act_Resueltas;

import java.util.Scanner;

public class Act_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int altura = 0, alturaArbolMasAlto = 0, etiqueta = 0, etiquetaArbolMasAlto = 0;
		
		System.out.println("Cuando no haya mas datos, introducir -1");
			
		while (altura != -1) {
			if (altura > alturaArbolMasAlto) {
				alturaArbolMasAlto = altura;
				etiquetaArbolMasAlto = etiqueta;
			}
			etiqueta++;
			System.out.println("Altura del arbol (" + etiqueta + ": ");
			altura = sc.nextInt();
		}
		
		if (alturaArbolMasAlto == -1) {
			System.out.println("No hay ningun arbol registrado");
		} else {
			System.out.println("El arbol mas alto mide: " + alturaArbolMasAlto);
			System.out.println("Etiqueta del arbol: " + etiquetaArbolMasAlto);
		}
		
	}

}
