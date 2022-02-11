package Tema1.Act_Resueltas;

import java.util.Scanner;

public class Act_10_1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		boolean lluvia;
		boolean tarea;
		boolean bibl;
		
		System.out.println("�Esta lloviendo? (true/false)");
		lluvia = teclado.nextBoolean();
		
		System.out.println("�Has terminado la tarea? (true/false)");
		tarea = teclado.nextBoolean();
		
		System.out.println("�Tienes que ir a la biblioteca? (true/false)");
		bibl = teclado.nextBoolean();
		
		boolean salir = (!lluvia && tarea) || bibl;
		System.out.println("Puedes salir: " + salir);
		
		
		
		

	}

}
