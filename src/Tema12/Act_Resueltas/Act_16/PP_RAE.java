package Tema12.Act_Resueltas.Act_16;

/* ACTIVIDAD RESUELTA 12.16
 * Los miembros de la Real Academia de la Lengua ocupan sillones con las letras del abecedario español, minúsculas y
 * mayúsculas (en la práctica, las letras v, w, x, y, z, Ñ, W, Y nunca se ocupan, pero nosotros no lo tendremos en cuenta).
 * Cuando un sillón queda vacante, se nombra un nuevo académico para ocuparlo.
 *
 * Implementa la clase Académico, cuyos atributos son el nombre y el año de ingreso.
 * El criterio de ordenación natural será por nombres.
 *
 * Implementar un programa donde se crean cinco objetos Académico, que se insertan en un mapa en el que la clave es la
 * letra del sillón que ocupan, y el valor un objeto de la clase Académico.
 * Para ello implementar el método estático:
 *      static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra)
 * donde se lleva a cabo la inserción después de comprobar que el carácter pasado como parámetro es una letra del
 * abecedario.
 *
 * Hacer diversos listados de los académicos:
 *  - Primero sin letra, por orden de nombre y de año de ingreso
 *  - Después con letra, por orden de letra (clave), nombre y fecha de ingreso
 * Debemos recordar que, en código Unicode, las mayúsculas van antes que las minúsculas.
 */

import Utilidades.Teclado;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PP_RAE {
    public static void main(String[] args) {
        Map<Character, Academico> academia = new TreeMap<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Letra: ");
            Character letra = new Scanner(System.in).next().charAt(0);
            nuevoAcademico(academia, new Academico(Teclado.getString("Nombre: "), Teclado.getNumber("Año de ingreso: ")), letra);
        }

        System.out.println("Orden por letra: " + academia);
    }

    static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra) {
        boolean insertado = false;
        if ((letra >= 'A' && letra <= 'Z') || (letra >= 'a' && letra <= 'z') || letra == 'ñ' || letra == 'Ñ') {
            academia.put(letra, nuevo);
            insertado = true;
        } else {
            System.out.println("Letra no válida");
        }
        return insertado;
    }
}
