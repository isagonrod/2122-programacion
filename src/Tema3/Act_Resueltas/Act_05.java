package Tema3.Act_Resueltas;

import java.util.Scanner;

public class Act_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int op1, op2, result = 0, numOp = 0;
		
		do {
			op1 = (int) (Math.random()*100 + 1);
			op2 = (int) (Math.random()*100 + 1);
			System.out.println(op1 + " + " + op2 + " = ");
			result = sc.nextInt();
		} while (result == op1 + op2);
		
		System.out.println("Has conseguido realizar " + (numOp - 1) + " sumas correctas");
	}

}
