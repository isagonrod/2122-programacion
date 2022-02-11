package Tema1.Act_Aplicacion;

import java.util.Scanner;

public class Act_16 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int seg, min, hor;
		
		System.out.println("Introduce una cantidad de segundos: ");
		seg = teclado.nextInt();
		
		min = seg / 60;
		hor = seg / 3600;
				
		System.out.println(seg + " segundos, equivalen a " + hor + " horas, y a " + min + " minutos");
		
		int seg1, resto, min1, restomin, hor1;
		System.out.println("Introduce una cantidad de segundos: ");
		seg1 = teclado.nextInt();
		resto = seg1%60;
		min1 = seg%60;
		restomin = min1%60;
		min1 = restomin == 0 ? 0 : restomin;
		hor1 = seg1 / 3600;
		seg1 = resto == 0 ? 0 : resto;
		System.out.println(seg1 + " segundos, equivalen a " + hor1 + "horas con " + min1 + "minutos y " + seg1 + " segundos.");

	}

}
