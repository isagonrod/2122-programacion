package Tema7.Act_Aplicacion.Act_14;

/* Crea una clase que sea capaz de mostrar el importe de un cambio, por ejemplo, al realizar una compra, con el
 * menor número de monedas y billetes posibles.
 */

import java.util.Arrays;

public class Cambio {
    final double[] monedas = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
    private double cantidad;

    public Cambio(double cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        }
    }

    public void setCantidad(double cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("ERROR");
        }
    }

    public void calcularCambio() {
        int monedasUsadas[] = new int[this.monedas.length]; //{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        double cantidadRestante = this.cantidad;
        for (int i = 0; i < monedas.length; i++) {
            monedasUsadas[i] = (int) (cantidadRestante / this.monedas[i]);
            cantidadRestante = cantidadRestante - (this.monedas[i] * monedasUsadas[i]);
        }

        System.out.println(Arrays.toString(this.monedas));
        System.out.println(Arrays.toString(monedasUsadas));
    }
}
