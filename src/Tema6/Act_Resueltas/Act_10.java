package Tema6.Act_Resueltas;

import java.util.Scanner;

public class Act_10 {
    /* Realizar un programa que lea una frase del teclado y nos indique si es palíndroma, es decir, que la frase sea
     * igual leyendo de izquierda a derecha, que de derecha a izquierda, sin tener en cuenta los espacios.
     * Un ejemplo de frase palíndroma es: << Dábale arroz a la zorra el abad >>.
     *
     * Las vocales con tilde hacen que los algoritmos consideren una frase palíndroma como si no lo fuese.
     * Por esto, supondremos que el usuario introduce la frase sin tildes.
     */
    public static void main (String[] args) {
        String frase, sinEspacios, invertida;

        frase = getString("Introduce una frase: ");
        frase = frase.toLowerCase();

        sinEspacios = eliminaEspacios(frase);
        invertida = alReves(sinEspacios);

        if (sinEspacios.equals(invertida)) {
            System.out.println("La frase es palíndroma");
        } else {
            System.out.println("La frase no es palíndroma");
        }
    }

    static String getString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    static String eliminaEspacios (String cadena) {
        String sin = "";
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (!Character.isWhitespace(c)) {
                sin = sin + c;
            }
        }
        return sin;
    }

    static String alReves (String original) {
        String nueva = "";
        for (int i = 0; i < original.length(); i++) {
            nueva = original.charAt(i) + nueva;
        }
        return nueva;
    }
}
