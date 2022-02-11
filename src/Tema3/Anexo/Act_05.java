package Tema3.Anexo;

import java.util.Scanner;

public class Act_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int num, i, n0=1, n1=1, nResult=0;
		
		System.out.println("Dame un numero: ");
		num = sc.nextInt();
				
		for (i = 1; i <= num; i++) {
			if (num == i) {
				System.out.println(n0);
			} else {
				nResult = n0 + n1;
				n0 = n1;
				n1 = nResult;
			}			
		}
	}
}
