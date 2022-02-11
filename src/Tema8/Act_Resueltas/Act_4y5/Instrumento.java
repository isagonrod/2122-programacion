package Tema8.Act_Resueltas.Act_4y5;

/* EJERCICIO 8.4
 * Crear la clase abstracta Instrumento, que almacena en una tabla las notas musicales de una melodía (dentro de una
 * misma octava).
 * El método add() añade nuevas notas musicales.
 * La clase también dispone del método abstracto interpretar() que, en cada subclase que herede de Instrumento, mostrará
 * por consola las notas musicales según las interprete.
 * Utilizar enumerados para definir las notas musicales.
 */

import java.util.Arrays;

public abstract class Instrumento {
    protected Nota[] melodia;

    public Instrumento() {
        melodia = new Nota[0];
    }

    void add(Nota nota) {
        melodia = Arrays.copyOf(melodia, melodia.length + 1);
        melodia[melodia.length - 1] = nota;
    }

    abstract void interpretar();
}
