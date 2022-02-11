package Tema6.Act_Aplicacion;

import java.util.Scanner;

public class Act_13 {
    /* El preprocesador del lenguaje C elimina los comentarios (barra-asterisco) del código fuente antes de compilar.
     * Diseña un programa que lea por teclado una sentencia en C, y elimine los comentarios.
     */
    public static void main (String[] args) {
        String sentencia = getString("Introduce sentencia en C: ");
        String resultado = sentencia;
        int inicioRecorte = resultado.indexOf("/*"), finRecorte = resultado.indexOf("*/");

        while (inicioRecorte != -1) { //mientras haya algún comentario en el resultado, seguir
            resultado = resultado.substring(0, inicioRecorte) + resultado.substring(finRecorte + 2, resultado.length());

            inicioRecorte = resultado.indexOf("/*");
            finRecorte = resultado.indexOf("*/");
        }

        System.out.println("La cadena ha quedado como: " + resultado);
    }

    static String getString (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
