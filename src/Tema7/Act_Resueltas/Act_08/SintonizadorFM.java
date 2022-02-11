package Tema7.Act_Resueltas.Act_08;

/* Definir una clase que permita controlar un sintonizador digital de emisoras FM; concretamente, se desea dotar al
 * controlador de una interfaz que permita subir (up) o bajar (down) la frecuencia (en saltos de 0,5 MHz) y mostrar la
 * frecuencia sintonizada en un momento dado (display).
 * Supondremos que el rango de frecuencias para manejar oscila entre los 80 MHz y los 108 MHz y que, al inicio, el
 * controlador sintonice la frecuencia indicada en el constructor u 80 MHz por defecto.
 * Si durante una operación de subida o bajada se sobrepasa uno de os dos límites, la frecuencia sintonizada debe pasar
 * a ser la del extremo contrario.
 * Escribir un pequeño programa principal para probar su funcionamiento.
 */

public class SintonizadorFM {
    double frecuencia;

    SintonizadorFM (double frecuenciaInicial) {
        if (frecuenciaInicial < 80) {
            frecuencia = 80;
        } else if (frecuenciaInicial > 108) {
            frecuencia = 108;
        } else {
            frecuencia = frecuenciaInicial;
        }
    }

    SintonizadorFM() {
        this(80);
    }

    public double down() {
        frecuencia -= 0.5;
        comprobarRango();
        return (frecuencia);
    }

    public double up() {
        frecuencia += 0.5;
        comprobarRango();
        return (frecuencia);
    }

    public void display() {
        System.out.println("Sintonizando: " + frecuencia + " MHz");
    }

    private void comprobarRango() {
        if (frecuencia < 80) {
            frecuencia = 108;
        } else if (frecuencia > 108) {
            frecuencia = 80;
        }
    }
}
