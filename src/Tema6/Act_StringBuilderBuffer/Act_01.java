package Tema6.Act_StringBuilderBuffer;

public class Act_01 {
    /* Concatenar un millón de String ("Elefante") a un StringBuilder y a un StringBuffer */

    public static void main (String[] args) {
        StringBuffer sbuffer = new StringBuffer();
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sbuffer.append("Elefante");
        }
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo del StringBuffer: " + (fin - inicio));

        StringBuilder sbuilder = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sbuilder.append("Elefante");
        }
        long end = System.currentTimeMillis();
        System.out.println("Tiempo del StringBuilder: " + (end - start));
    }
}
