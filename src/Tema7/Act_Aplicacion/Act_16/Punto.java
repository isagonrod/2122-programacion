package Tema7.Act_Aplicacion.Act_16;

/* Escribe la clase Punto que representa un punto en el plano (con un componente x y un componente y), con los métodos:
 *      - Punto(double x, double y): construye un objeto con los datos pasados como parámetros.
 *      - void desplazaX(double dx): incrementa el componente x en la cantidad dx.
 *      - void desplazaY(double dy): incrementa el componente y en la cantidad dy.
 *      - void desplaza(double dx, double dy): desplaza ambos componentes según las cantidades dx (en el eje x) y
 *          dy (en el componente y).
 *      - double distanciaEuclidea(Punto otro): calcula y devuelve la distancia euclídea entre el punto invocante y
 *          el punto otro.
 *      - void muestra(): muestra por consola la información relativa al punto.
 */

public class Punto {
    double x, y;

    Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Punto {" + "x=" + x + ", y=" + y + "}";
    }

    void desplazaX(double dx) {
        x += dx;
    }

    void desplazaY(double dy) {
        y += dy;
    }

    void desplaza(double dx, double dy) {
        x += dx;
        y += dy;
    }

    double distanciaEuclidea(Punto otro) {
        // calculo: de (p1,p2) = raiz (x2 - x1)² + (y2 - y1)²
        double resultado;
        resultado = Math.sqrt((Math.pow(otro.x - this.x, 2)) + (Math.pow(otro.y - this.y, 2)));
        return resultado;
    }

    void muestra() {
        System.out.println(this);
    }
}
