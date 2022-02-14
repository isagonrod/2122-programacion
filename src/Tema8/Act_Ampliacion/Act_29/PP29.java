package Tema8.Act_Ampliacion.Act_29;

/* EJERCICIO 8.29
 * Calcula la raíz cuadrada de 2 con 100 cifras significativas usando objetos de la clase BigDecimal.
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PP29 {
    public static void main (String[] args) {
        BigDecimal raizCuadrada = new BigDecimal(Math.sqrt(2));
        raizCuadrada.setScale(100, RoundingMode.UNNECESSARY);
        System.out.println(raizCuadrada.toString());
    }
}
