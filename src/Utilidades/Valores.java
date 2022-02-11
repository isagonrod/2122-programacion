package Utilidades;

/**
 * Clase con métodos útiles para generar o transformar valores.
 */
public class Valores {

    /** Método para generar un número entero aleatorio dado un mínimo y un máximo.
     *
     * @param valorMin - valor mínimo que puede tomar el aleatorio
     * @param valorMax - valor máximo que puede tomar el aleatorio
     * @return int - el entero generado
     */
    public static int generarAleatorio(int valorMin, int valorMax) {
        return (int)(Math.random() * (valorMax - valorMin) + valorMin);
    }

    /** Método para generar una cadena aleatoria dado un mínimo y un máximo.<br>
     * Usar mínimo=97 y máximo=122 para que se generen letras minúsculas.
     *
     * @param valorMin - valor mínimo que puede tomar el aleatorio
     * @param valorMax - valor máximo que puede tomar el aleatorio
     * @return String - la cadena generada
     */
    public static String generarAleatorio(char valorMin, char valorMax) {
        return "" + (char)(Math.random() * (valorMax - valorMin) + valorMin);
    }
}
