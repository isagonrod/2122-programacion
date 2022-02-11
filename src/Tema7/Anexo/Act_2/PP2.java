package Tema7.Anexo.Act_2;

public class PP2 {
    public static void main (String[] args) {
        Fraccion f1 = new Fraccion(5, 10);
        Fraccion f2 = new Fraccion(8, 4);

        System.out.println(f1);
        System.out.println(f2);

        f1.simplifica();
        System.out.println(f1);

        System.out.println(Fraccion.divide(f1, f2));
    }
}
