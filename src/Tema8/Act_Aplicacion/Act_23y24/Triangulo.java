package Tema8.Act_Aplicacion.Act_23y24;

/* EJERCICIO 8.24
 * Heredando de Poligono, implementa las clases no abstractas Triangulo y Rectangulo.
 */
public class Triangulo extends Poligono {
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        return (super.base * super.altura) / 2;
    }
}
