package Tema6.Act_StringBuilderBuffer;

public class Act_02 {
    /* Escribir un método separarMiles que reciba un String que representa un número entero y devuelva un String con el
     * mismo número al que se le añadirán los puntos separadores de millares.
     * Por ejemplo, si el método recibe el String "12345678" debe devolver el String "12.345.678"
     */

    public static void main (String[] args) {
        String s = "1234567890";
        s = separarMiles(s);
        System.out.println(s);
    }

    static String separarMiles (String s) {
        StringBuilder aux = new StringBuilder(s);
        aux.reverse();
        int posicion = 3;
        while (posicion < aux.length()) {
            aux.insert(posicion, '.');
            posicion += 4;
        }
        aux.reverse();
        return aux.toString();
    }
}
