package Tema5.Act_Clase;

import java.util.Arrays;
import java.util.Scanner;

public class Act_05 {

    public static void main(String [] args) {
        int tabla[][] = new int[4][3];
        int i, j;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 3; j++) {
                tabla[i][j] = getNumber("Introduce dato: ");
            }
        }
        System.out.println(Arrays.deepToString(tabla));
    }

    static int getNumber(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }
}
