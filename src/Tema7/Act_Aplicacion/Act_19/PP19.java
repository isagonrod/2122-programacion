package Tema7.Act_Aplicacion.Act_19;

public class PP19 {
    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.apilar(69);
        pila.apilar(86);
        pila.apilar(23);
        pila.apilar(85);
        pila.apilar(10);

        System.out.println(pila);

        System.out.println("Desapilando: " + pila.desapilar());
        System.out.println("Desapilando: " + pila.desapilar());

        System.out.println(pila);
    }
}
