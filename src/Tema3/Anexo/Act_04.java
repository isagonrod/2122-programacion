package Tema3.Anexo;

import java.util.Scanner;

public class Act_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int num, i=0;
		
		System.out.println("Dame un numero: ");
		num = sc.nextInt();
		
		while (num != 0) {
			num = num / 10;
			i++;
		}
		System.out.println("El numero dado tiene " + i + " cifras");
	}
}
