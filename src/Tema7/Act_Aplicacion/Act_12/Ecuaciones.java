package Tema7.Act_Aplicacion.Act_12;

/*
 * Implementa una clase que permita resolver ecuaciones de segundo grado.
 * Los coeficientes pueden identificarse en el constructor y modificarse a posteriori.
 * Es fundamental que la clase disponga de un método que devuelva las distintas soluciones
 * y de un método que nos informe si el discriminante es positivo.
 */

public class Ecuaciones {

    int a;
    int b;
    int c;

    /* -- CONSTRUCTOR -- */
    Ecuaciones (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /* -- SETTER -- */
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    /* -- TO STRING -- */
    public String toString() {
        return this.a + "x^2 + " + this.b + "x + " + this.c + " = 0";
    }

    /* -- MÉTODOS -- */
    //original: (-b +- raizc (b2 - 4ac)) / 2a
    //solucion1: (-b + raizc (b2 - 4ac)) / 2a
    //solucion2: (-b - raizc (b2 - 4ac)) / 2a
    double[] solucion() {
        double[] resultado = new double[2];
        double discriminante = Math.sqrt((Math.pow(this.b,2) - 4 * this.a * this.c));

        resultado[0] = (-this.b + discriminante) / (2 * this.a);
        resultado[1] = (-this.b - discriminante) / (2 * this.a);

        return resultado;
    }

    /** Calcula el resultado de b2 - 4ac y determina si es positivo o no.
     *
     * @return booleano si es positivo o no
     */
    boolean discriminanteEsPositivo() {
        return (Math.pow(this.b,2) - 4 * this.a * this.c) >= 0;
    }
}
