package Tema3.Act_Aplicacion;

import java.util.Scanner;

public class Act_13 {
	
	// Incrementar hora

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int hora, min, seg, segIncr;
		int horaFin, minFin, segFin;
		int i = 0, sobraMin = 0, sobraHora = 0;
	
		System.out.println("Introduce la hora: ");
		hora = sc.nextInt();
		System.out.println("Introduce los minutos: ");
		min = sc.nextInt();
		System.out.println("Introduce los segundos: ");
		seg = sc.nextInt();
		
		System.out.println("Cuantos segundos quieres incrementar? ");
		segIncr = sc.nextInt();
		
		segFin = seg;
		minFin = min;
		horaFin = hora;
		
		do {
			if (segFin == 59) {
				segFin = 0;
				sobraMin++;
			} else {
				segFin++;
			}
			i++;
		} while (i < segIncr);
		
		i = 0;
		
		do {
			if (sobraMin > 0) {
				if (minFin == 59) {
					minFin = 0;
					sobraHora++;
				} else {
					minFin++;
				}
			}
			i++;
		} while (i < sobraMin);
		
		i = 0;
		
		do {
			if (sobraHora > 0) {
				if (horaFin == 23) {
					minFin = 0;
				} else {
					horaFin++;
				}
			}
			i++;
		} while (i < sobraHora);

		System.out.println("Son las: " + horaFin + " : " + minFin + " : " + segFin);
	}

}
