package Tema2.Act_Aplicacion;

import java.util.Scanner;

public class Act_19 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int grados;
		double radianes;
		
		System.out.println("Introduce los grados que tiene el angulo: ");
		grados = teclado.nextInt();
		
		if (grados < 360 && grados > 0) {
			radianes = grados * Math.PI / 180;
		} else {
			radianes = (grados%360) * Math.PI / 180;
		}
		
		System.out.println(radianes);

	}

}
