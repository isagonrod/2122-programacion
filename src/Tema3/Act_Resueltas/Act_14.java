package Tema3.Act_Resueltas;

public class Act_14 {

	public static void main(String[] args) {

		int tabla, i;
		
		for (tabla = 1; tabla <= 10; tabla++) {
			System.out.println("");
			System.out.println("Tabla del " + tabla);
			for (i = 1; i <= 10; i++) {
				System.out.println(tabla + " x " + i + " = " + tabla*i);
			}
		}
	}
}
