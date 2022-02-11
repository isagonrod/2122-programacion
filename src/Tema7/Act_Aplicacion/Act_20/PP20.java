package Tema7.Act_Aplicacion.Act_20;

public class PP20 {
    public static void main(String[] args) {
        ColaLista cola = new ColaLista();

        cola.encolar(69);
        cola.encolar(86);
        cola.encolar(23);
        cola.encolar(85);
        cola.encolar(10);

        cola.mostrar();

        System.out.println("Desencolando: " + cola.descolar());
        System.out.println("Desencolando: " + cola.descolar());

        cola.mostrar();
    }
}
