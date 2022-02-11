package Tema7.Anexo.Act_5;

public class PP5 {
    public static void main (String[] args) {
        Coche coche1 = new Coche("1111AAA");
        Coche coche2 = new Coche("2222BBB");
        Coche coche3 = new Coche("3333CCC");

        coche1.darVelocidad(80);
        coche1.recorrerKilometros(200);
        coche1.mostrarCoche();

        coche2.darVelocidad(90);
        coche2.recorrerKilometros(400);
        coche2.mostrarCoche();

        coche3.darVelocidad(105);
        coche3.recorrerKilometros(560);
        coche3.mostrarCoche();

        Coche.mostrarTotal();
    }
}
