package Tema7.Act_Resueltas.Act_11a13;

public class PP13 {
    public static void main (String[] args) {
        Pila p = new Pila();
        System.out.println(p.desapilar());
        for (int i = 0; i < 10; i++) {
            p.apilar(i);
        }
        Integer num = p.desapilar();
        while (num != null) {
            System.out.println(num + " ");
            num = p.desapilar();
        }
    }
}
