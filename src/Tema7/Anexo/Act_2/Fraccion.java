package Tema7.Anexo.Act_2;

/* Crea la clase Fracción.
 * Los atributos serán numerador y denominador.
 * Y sus métodos son:
 *      - invierte: devuelve la fracción invertida.
 *      - simplifica: para simplificar una fracción, se comprueba si numerador y denominador son divisibles entre el
 *          mismo número. En tal caso, los dos se dividen. Se repite el proceso hasta que la fracción que se obtiene
 *          es irreducible (no se puede simplificar más).
 *      - multiplica por un entero: devuelve la fracción multiplicada por un entero.
 *      - divide entre un entero: devuelve la fracción dividida por un entero.
 *      - divide dos fracciones: devuelve la fracción 'resultado'.
 *      - multiplica dos fracciones: devuelve la fracción 'resultado'.
 * Prueba todos los métodos de la clase Fracción.
 */

import Utilidades.Mates;

public class Fraccion {
    Integer numerador;
    Integer denominador;

    public Fraccion () {
        this.numerador = 1;
        this.denominador = 1;
    }

    public Fraccion (Integer numerador, Integer denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    Fraccion invierte() {
        return new Fraccion(this.denominador, this.numerador);
    }

    Fraccion simplifica() {
        Integer divisor = Mates.mcd(this.numerador, this.denominador);
        this.numerador = this.numerador / divisor;
        this.denominador = this.denominador / divisor;
        return this;
    }

    Fraccion multiplica(Integer num) {
        this.numerador = this.numerador * num;
        return this;
    }

    Fraccion divide(Integer num) {
        this.denominador = this.denominador * num;
        return this;
    }

    public static Fraccion divide(Fraccion f1, Fraccion f2) {
        return new Fraccion(f1.numerador * f2.denominador, f1.denominador * f2.numerador);
    }

    public static Fraccion multiplica(Fraccion f1, Fraccion f2) {
        return new Fraccion(f1.numerador * f2.numerador, f1.denominador * f2.denominador);
    }

    public String toString() {
        return this.numerador + " / " + this.denominador;
    }
}
