package Tema7.Act_Resueltas.Act_08;

public class PP8 {
    public static void main (String[] args) {
        SintonizadorFM a, b;

        a = new SintonizadorFM(107);
        a.up();
        a.up();
        a.up();
        a.up();
        a.display();

        b = new SintonizadorFM(80.5);
        b.down();
        b.down();
        b.down();
        b.display();

        a = new SintonizadorFM(200);
        a.display();
    }
}
