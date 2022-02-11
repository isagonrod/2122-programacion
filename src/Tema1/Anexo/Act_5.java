package Tema1.Anexo;

import java.util.Scanner;

public class Act_5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int dia_act, mes_act, year_act;
		int dia_nac, mes_nac, year_nac;
		boolean mayorEdad;
		
		System.out.println("Dia actual: ");
		dia_act = teclado.nextInt();
		System.out.println("Mes actual: ");
		mes_act = teclado.nextInt();
		System.out.println("Year actual: ");
		year_act = teclado.nextInt();
		
		System.out.println("Dia de nacimiento: ");
		dia_nac = teclado.nextInt();
		System.out.println("Mes de nacimiento: ");
		mes_nac = teclado.nextInt();
		System.out.println("Year de nacimiento: ");
		year_nac = teclado.nextInt();
		
		mayorEdad = (year_act - year_nac >=18) && (mes_act >= mes_act) && (dia_act <= dia_nac);
		System.out.println("Es mayor de edad: " + mayorEdad);
		
	}

}
