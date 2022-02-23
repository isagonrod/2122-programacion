package Utilidades;

import java.util.Arrays;

/**
 * Clase con métodos de utilidad para trabajar con vectores.
 */
public class Vectores {

    /** Rellena un vector de Integer con un valor mínimo y máximo para los valores aleatorios.
     *
     * @param vector - objetivo a rellenar
     * @param valorMin - entero mínimo
     * @param valorMax - entero máximo
     */
    public static void rellenarVector (Integer[] vector, Integer valorMin, Integer valorMax) {
        int i;
        for (i = 0; i < vector.length; i++) {
            vector[i] = Valores.generarAleatorio(valorMin, valorMax);
        }
    }

    /** Rellena un vector de Double con un valor mínimo y máximo para los valores aleatorios.
     *
     * @param vector - objetivo a rellenar
     * @param valorMin - entero mínimo
     * @param valorMax - entero máximo
     */
    public static void rellenarVector (double[] vector, Double valorMin, Double valorMax) {
        int i;
        for (i = 0; i < vector.length; i++) {
            vector[i] = Valores.generarAleatorio(valorMin, valorMax);
        }
    }

    /** Rellena un vector de String con un rango específico de caracteres y una longitud para los valores aleatorios.<br>
     * Usar mínimo=97 y máximo=122 para que se generen letras minúsculas.
     *
     * @param vector - objetivo a rellenar
     * @param valorMin - mínimo
     * @param valorMax - máximo
     * @param cantidadLetras - cantidad de letras
     */
    public static void rellenarVector (String[] vector, char valorMin, char valorMax, int cantidadLetras) {
        int i, j;
        for (i = 0; i < vector.length; i++) {
            for (j = 0; j < cantidadLetras; j++) {
                if (vector[i] == null) {
                    vector[i] = "";
                }
                vector[i] = vector[i] + Valores.generarAleatorio(valorMin, valorMax);
            }
        }
    }

    /** Método para buscar si existe una cadena en el vector (no ordenado) especificado.<br>
     * Ordena temporalmente el vector para hacer una búsqueda binaria.<br>
     * Devuelve la posición o un número negativo.
     *
     * @param cadena - cadena a buscar
     * @return int - negativo si no existe
     */
    public static int buscarEnVector(String[] vector, String cadena) {
        int resultado;
        String[] vectorOrdenado = vector.clone();

        //ordenamos temporalmente
        Arrays.sort(vectorOrdenado);
        resultado = Arrays.binarySearch(vectorOrdenado, cadena);

        return resultado;
    }

    /** Método para buscar si existe un número en el vector (no ordenado) especificado.<br>
     * Ordena temporalmente el vector para hacer una búsqueda binaria.<br>
     * Devuelve la posición o un número negativo.
     *
     * @param num - número a buscar
     * @return int - negativo si no existe
     */
    public static int buscarEnVector(int[] vector, int num) {
        int resultado;
        int[] vectorOrdenado = vector.clone();

        //ordenamos temporalmente
        Arrays.sort(vectorOrdenado);
        resultado = Arrays.binarySearch(vectorOrdenado, num);

        return resultado;
    }
}
