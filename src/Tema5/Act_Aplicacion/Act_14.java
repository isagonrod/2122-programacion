package Tema5.Act_Aplicacion;

import java.util.Arrays;
import java.util.Scanner;

public class Act_14 {

	/* El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a realizar encuestas estadísticas para conocer
	 * el nivel adquisitivo de los habitantes del municipio. Para ello tendrás que preguntar el sueldo a cada persona encuestada.
	 * A priori, no conoces el número de encuestados. Para finalizar la entrada de datos, introduce un sueldo con valor -1.
	 * Una vez terminada la entrada de datos, muestra la siguiente información: todos los sueldos introducidos ordenados de 
	 * forma decreciente, el sueldo máximo y mínimo, y la media de los sueldos.
	 */

	public static void main(String[] args) {
		
		int cantidad = 0, suma = 0;
		int sueldos[] = new int [0];
		
		do {
			cantidad = getNumber("Introduce tu sueldo: ");
			if (cantidad != -1) {
				sueldos = Arrays.copyOf(sueldos, sueldos.length+1);
				sueldos[sueldos.length-1] = cantidad;
				suma += cantidad;
			}
		} while (cantidad != -1);
		
		Arrays.sort(sueldos);
		
		System.out.println("Tabla de sueldos: " + Arrays.toString(reordenar(sueldos)));
		System.out.println("Sueldo máximo: " + sueldos[0]);
		System.out.println("Sueldo mínimo: " + sueldos[sueldos.length-1]);
		System.out.println("Media de los sueldos: " + suma/sueldos.length);
	}

	static int getNumber (String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();
	}
	
	static int [] reordenar (int sueldos[]) {
		int sueldosOrdenados[] = Arrays.copyOf(sueldos, sueldos.length);
		for (int i = 0; i < sueldos.length; i++) {
			sueldosOrdenados[sueldosOrdenados.length-i-1] = sueldos[i];
		}
		return sueldosOrdenados;
	}
}
