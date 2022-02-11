package Tema7.Act_Aplicacion.Act_16;

public class PP16 {
    public static void main (String[] args){
        Punto p1 = new Punto(2,3);
        Punto p2 = new Punto(4, 7);

        p1.desplazaX(1);
        p1.desplazaY(5);

        p2.desplaza(3,9);

        p1.muestra();
        p2.muestra();

        System.out.println("\nLa distancia euclídea es de: " + p1.distanciaEuclidea(p2));
    }
}
