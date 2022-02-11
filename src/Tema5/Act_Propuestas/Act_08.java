package Tema5.Act_Propuestas;

import java.util.Arrays;

public class Act_08 {

	/* Comprueba qué produce la comparación con el operador == de dos tablas del mismo tipo, la misma longitud y los mismos valores. */

	public static void main(String[] args) {
		
		int t1[] = {7,9,20};
		int t2[] = {7,9,20};
		
		System.out.println(t1 == t2);
		
		System.out.println(Arrays.equals(t1, t2));
	}
}
