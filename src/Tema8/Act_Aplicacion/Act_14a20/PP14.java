package Tema8.Act_Aplicacion.Act_14a20;

public class PP14 {
    public static void main (String[] args) {
        ColaNueva cola1 = new ColaNueva();
        ColaDoble cola2 = new ColaDoble();

        cola1.encolar(1);
        cola1.encolar(2);
        cola1.encolar(3);

        cola2.encolarPrincipio(1);
        cola2.encolarPrincipio(2);
        cola2.encolarPrincipio(3);

        System.out.println(cola1.toString());
        System.out.println(cola2.toString());
    }
}
