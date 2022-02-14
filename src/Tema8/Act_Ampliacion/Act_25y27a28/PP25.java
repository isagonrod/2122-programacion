package Tema8.Act_Ampliacion.Act_25y27a28;

public class PP25 {
    public static void main (String[] args) {
        Punto punto1 = new Punto(1,3);
        Punto punto2 = new Punto(2,4);
        Punto3D punto3Da = new Punto3D(1,3,5);
        Punto3D punto3Db = new Punto3D(2,4,6);

        System.out.println("La distancia entre punto1 y punto2 es de " + punto1.distancia(punto2));
        System.out.println("La distancia entre punto3Da y punto3Db es de " + punto3Da.distancia(punto3Db));

        Suceso suceso1 = new Suceso(2,4,6,69,"Pasó un perro");
        Suceso suceso2 = new Suceso(3,6,9,22,"Cagó un pájaro");

        System.out.println(suceso1.toString());
        System.out.println(suceso2.toString());
    }
}
