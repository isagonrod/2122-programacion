package Tema7.Anexo.Act_3;

public class PP3 {
    public static void main (String[] args) {
        Tiempo t1 = new Tiempo(1, 20, 30);
        Tiempo t2 = new Tiempo(3, 40,44);

        System.out.println(t1);
        System.out.println(t2);

        System.out.println(Tiempo.sumar(t1, t2));
        System.out.println(Tiempo.restar(t2, t1));
    }
}
