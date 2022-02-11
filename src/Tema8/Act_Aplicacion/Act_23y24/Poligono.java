package Tema8.Act_Aplicacion.Act_23y24;

/* EJERCICIO 8.23
 * Implementa la clase abstracta Poligono, con los atributos base y altura, de tipo doble
 * y el método abstracto double area().
 */
public abstract class Poligono {
    public double base, altura;

    public Poligono(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public abstract double area();
}
