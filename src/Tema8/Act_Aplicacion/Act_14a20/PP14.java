package Tema8.Act_Aplicacion.Act_14a20;

public class PP14 {
    public static void main (String[] args) {
        ColaNueva cola = new ColaNueva();
        PilaNueva pila = new PilaNueva();

        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);

        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);

        System.out.println(cola.toString());
        System.out.println(pila.toString());
    }
}
