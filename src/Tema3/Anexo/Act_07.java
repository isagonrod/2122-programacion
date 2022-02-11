package Tema3.Anexo;

import java.util.Scanner;

public class Act_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num, nPos=0, nNeg=0, i=0;
		
		do {
			System.out.println("Dame un numero: ");
			num = sc.nextInt();
			i++;
			if (num < 0) {
				nNeg++;
			} else {
				nPos++;
			}
		} while (i < 10);
		
		System.out.println("Hay " + nPos + " numeros positivos y " + nNeg + " numeros negativos");
	}
}
