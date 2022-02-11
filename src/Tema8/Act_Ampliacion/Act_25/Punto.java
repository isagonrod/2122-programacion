package Tema8.Act_Ampliacion.Act_25;

/* EJERCICIO 8.25
 * Define la clase Punto, que tiene como atributos las coordenadas x e y, de tipo entero, que lo sitúan en el plano.
 * Además del constructor, implementa el método double distancia(Punto otroPunto) que devuelve la distancia a otro punto
 * que se le pasa como parámetro.
 * A partir de Punto, por herencia, implementa la clase Punto3D, que representa un punto en tres dimensiones y necesita
 * una coordenada adicional z. Reimplementa el método distancia() para puntos 3D.
 */
public class Punto {
    int x, y;

    public Punto (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distancia (Punto otroPunto) {
        return Math.sqrt(Math.pow(otroPunto.x - this.x, 2) + Math.pow(otroPunto.y - this.y, 2));
    }

    @Override
    public String toString() {
        return "Punto: " + x + ", " + y;
    }
}
