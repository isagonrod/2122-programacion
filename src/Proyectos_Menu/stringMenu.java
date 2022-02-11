package Proyectos_Menu;

import java.util.Arrays;
import java.util.Scanner;

public class stringMenu {

    public static void main (String[] args) {
        int opcion;
        String editor = "";

        do {
            menu();
            opcion = elegirOpcion();
            switch (opcion) {
                case 1 -> editor = insertarFinal(editor);
                case 2 -> editor = insertarPrincipio(editor);
                case 3 -> editor = insertarDentro(editor);
                case 4 -> editor = eliminar(editor);
                case 5 -> editor = modificar(editor);
                case 6 -> editor = listar(editor);
                case 7 -> editor = ordenar(editor);
                case 8 -> System.out.println("¡ADIÓS!");
            }
        } while (opcion != 8);

    }

    static String getString (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    static int getNumber (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    static void menu () {
        System.out.println("\n -- MENÚ -- ");
        System.out.println("1. Insertar cadena por el final");
        System.out.println("2. Insertar cadena por el principio");
        System.out.println("3. Insertar cadena en una posición concreta");
        System.out.println("4. Eliminar cadena");
        System.out.println("5. Modificar cadena");
        System.out.println("6. Listar");
        System.out.println("7. Ordenar");
        System.out.println("8. Salir\n");
    }

    static int elegirOpcion () {
        int opcionValida;
        do {
            opcionValida = getNumber("Elige una opción del menú: ");
        } while (opcionValida < 1 || opcionValida > 8);
        return opcionValida;
    }

    static String insertarFinal (String editor) {
        String cadena = getString(" -- CADENA -- ");

        editor = editor.concat(" " + cadena).strip();

        System.out.println("\n -- TEXTO -- \n" + editor);

        return editor;
    }

    static String insertarPrincipio (String editor) {
        String cadena = getString(" -- CADENA -- ");

        editor = cadena.concat(" " + editor).strip();

        System.out.println("\n -- TEXTO -- \n" + editor);

        return editor;
    }

    static String insertarDentro (String editor) {
        String cadena = getString(" -- CADENA -- "), parte1, parte2;
        int pos = getNumber("¿En qué posición la quieres introducir?");

        parte1 = editor.substring(0, pos);
        parte2 = editor.substring(pos);

        editor = parte1 + " " + cadena + " " + parte2;
        editor = editor.replace("  "," "); //por si se nos queda doble espacio

        System.out.println("\n -- TEXTO -- \n" + editor);

        return editor;
    }

    static String eliminar (String editor) {
        String cadena = getString("¿Qué parte quieres eliminar?");

        editor = editor.replace(cadena,"");
        editor = editor.replace("  "," "); //por si se nos queda doble espacio

        System.out.println("\n -- TEXTO -- \n" + editor);

        return editor;
    }

    static String modificar (String editor) {
        String cadena = getString("¿Qué parte quieres modificar?");
        String ocurrencia = getString("¿Por qué cadena la quieres cambiar?");

        editor = editor.replace(cadena,ocurrencia);
        System.out.println("\n -- TEXTO MODIFICADO -- \n" + editor);

        return editor;
    }

    static String listar (String editor) {
        System.out.println("\n -- TEXTO LISTADO -- \n" + Arrays.toString(editor.split(" ")));
        return editor;
    }

    static String ordenar (String editor) {
        String[] cad = editor.split(" ");
        String resultado = "";
        Arrays.sort(cad);

        //editor = String.join(" ", cad); //ASI MOLA MAS!!! -- FDO: Miguel
        for (int i = 0; i < cad.length; i++) {
            resultado = resultado.concat(cad[i] + " ");
        }
        editor = resultado.strip();

        System.out.println("\n -- TEXTO ORDENADO -- \n" + editor);

        return editor;
    }
}
