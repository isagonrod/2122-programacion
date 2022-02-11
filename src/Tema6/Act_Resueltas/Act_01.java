package Tema6.Act_Resueltas;

public class Act_01 {
    /* Escribir un programa que muestre todos los caracteres Unicode junto a su code point, cuyo valor esté
     * comprendido entre \u0000 y \uFFFF.
     */
    public static void main (String[] args) {
        int codePoint;

        for (codePoint = 0x0000; codePoint <= 0xFFFF; codePoint++) {
            String xxxx = Integer.toHexString(codePoint);
            System.out.println("\\u" + xxxx + ": " + (char)codePoint);
        }
    }
}
