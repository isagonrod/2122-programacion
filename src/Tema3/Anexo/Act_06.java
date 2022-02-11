package Tema3.Anexo;

import java.util.Scanner;

public class Act_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num, i, var1=3, var2;
		
		System.out.println("Dame un numero: ");
		num = sc.nextInt();
		
		for (i=1; i <= num; i++); {
			var2 = ((var1 * 2) + 1);
			var1 = var2;
			var2 = var1;
			}
		System.out.println(var1);
	}
}
/* No sale
 * 
 * public static void main(String[] args) {
//        Calcular el término que pida el usuario, de la siguiente serie numérica:
//        (3,7,15,31,...) Ej: A0=3 y An=((A(n-1))*2)+1
//        Tener en cuenta que empezamos en la posicion 0

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero:");
        n = sc.nextInt();
        int res = 3;
        int num1 = 3;

        for (int i = 0; i < n; i++) {
            res = (num1 * 2) + 1;
            num1 = res;
        }
        System.out.println(res);
    }
 * 
 */
