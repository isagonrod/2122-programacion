package Tema7.Act_Resueltas.Act_07;

public class PP7 {
    public static void main (String[] args) {
        Texto t = new Texto(15);

        t.addPrincipio("HOLA");
        t.addFinal(", ");
        t.addFinal("me");
        t.addFinal(" llamo");
        t.addPrincipio("¡¿");

        t.mostrar();

        System.out.println("Número de vocales: " + t.numVocales());
    }
}
