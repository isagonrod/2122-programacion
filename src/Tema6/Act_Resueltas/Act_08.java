package Tema6.Act_Resueltas;

import java.util.Scanner;

public class Act_08 {
    /* Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan sus frases con
     * << Javalín, javalón >>, para después hacer una pausa más o menos larga (la pausa se representa mediante
     * espacios en blanco o tabuladores) y a continuación expresan el mensaje.
     * Existe un dialecto que no comienza sus frases con la muletilla anterior, pero siempre las terminan con un
     * silencio, más o menos prolongado y la coletilla << javalén, len, len >>.
     *
     * Se pide diseñar un traductor que, en primer lugar, nos diga si la frase introducida está escrita en el
     * idioma de Javalandia (en cualquiera de sus dialectos), y en caso afirmativo, nos muestre solo el mensaje
     * sin muletillas.
     */
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        final String prefijo = "Javalín, javalón";
        final String sufijo = "javalén, len, len";
        String entrada;
        boolean idiomaJavalandia = false;

        System.out.println("Escriba una frase: ");
        entrada = sc.nextLine();

        if (entrada.startsWith(prefijo)) {
            idiomaJavalandia = true;
            entrada = entrada.substring(prefijo.length());
        } else if (entrada.endsWith(sufijo)) {
            idiomaJavalandia = true;
            entrada = entrada.substring(0, entrada.length() - sufijo.length());
        }

        if (idiomaJavalandia) {
            entrada = entrada.strip();
            System.out.println(entrada);
        } else {
            System.out.println("No está escrito en el idioma de Javalandia");
        }
    }
}
