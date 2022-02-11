package Tema8.Act_Aplicacion.Act_23y24;


public class Rectangulo extends Poligono {
    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        return (super.base * super.altura);
    }
}
