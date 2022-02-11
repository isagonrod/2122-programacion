package Utilidades;

/** Clase con operaciones matemáticas básicas.
 *
 */
public class Mates {
    /** Devuelve el máximo común divisor de a y b.
     *
     * @param a número 1
     * @param b número 2
     * @return Integer - máximo común divisor
     */
    public static Integer mcd(int a, int b) {
        int i, result=0, menor;
        menor = Math.min(a, b);

        for (i = menor; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                result = i;
                break;
            }
        }

        return result;
    }

    /** Devuelve el mínimo común múltiplo de a y b.
     *
     * @param a número 1
     * @param b número 2
     * @return Integer - mínimo común múltiplo
     */
    public static Integer mcm(int a, int b) {
        int i, j, mayor, menor, n1, n2, result = 1;

        if (a > b) {
            mayor = a;
            menor = b;
        } else {
            mayor = b;
            menor = a;
        }

        for (i = 1; i != 0; i++) {
            n1 = mayor * i;
            n2 = 0;
            for (j = 1; n2 < n1; j++) {
                n2 = menor * j;
                if (n1 == n2) {
                    result = n1;
                    i = -1; //al dar la siguiente vuelta del for exterior, hace un i++ y nunca acaba el bucle
                    break;
                }
            }
        }

        return result;

        /* int mayor = a > b ? a : b;
         * int mcm = mayor;
         * while (mcm % a != 0 || mcm % b != 0) {
         * 		mcm += mayor;
         * }
         * return mcm;
         */
    }

}
