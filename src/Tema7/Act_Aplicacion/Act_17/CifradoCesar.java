package Tema7.Act_Aplicacion.Act_17;

/* El cifrado César es una forma sencilla de modificar un texto para que no sea entendible a quienes no conocen el código.
 * Este cifrado consiste en modificar cada letra de un texto por otra que se encuentra en el alfabeto n posiciones detrás.
 * Por ejemplo, para un valor de n igual a 3, la letra 'a' se codifica con la 'd', y la letra 'q' se codifica con la 'x'.
 * En el caso de que una letra exceda a la 'z', seguiremos de forma circular utilizando la 'a'.
 * Solo se cifrarán las letras, mayúsculas o minúsculas.
 *
 * Realizar una clase que, mediante un método estático, devuelva cifrado el texto que se le pasa con un paso de n letras.
 */

public class CifradoCesar {

    // Character.isAlphabetic --> para decir que solo sean letras

    public static String cifrar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if ((texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') || (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z')) {
                if ((texto.charAt(i) + codigo) > 'z' || ((texto.charAt(i) + codigo) > 'Z' && (texto.charAt(i) + codigo) < 'a')) {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            } else {
                cifrado.append(texto.charAt(i));
            }
        }
        return cifrado.toString();
    }

    public static String descifrar(String texto, int codigo) {

        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if ((texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') || (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z')) {
                if (((texto.charAt(i) - codigo) > 'Z' && (texto.charAt(i) - codigo) < 'a') || ((texto.charAt(i) - codigo) < 'A')) {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            } else {
                cifrado.append(texto.charAt(i));
            }
        }
        return cifrado.toString();
    }
}
