package Tema6.Act_Aplicacion;

import java.util.Scanner;

public class Act_15 {
    /* Escribe un programa que lee el título y el contenido de una página web.
     * La aplicación generará por consola un documento HTML donde el título será un encabezado de primer nivel
     * (<h1>) y el resto del contenido será un párrafo (<p>).
     */
    public static void main (String[] args) {
        String head = getString("Introduce el título: ");
        String body = getString("Introduce el contenido: ");

        System.out.println("<!DOCTYPE>");
        System.out.println("<html>\n\t<head>\n\t</head>\n\t<body>");
        System.out.println("\t\t<h1>\n\t\t\t" + head + "\n\t\t</h1>");
        System.out.println("\t\t<p>\n\t\t\t" + body + "\n\t\t</p>");
        System.out.println("\t</body>\n</html>");
    }

    static String getString (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
