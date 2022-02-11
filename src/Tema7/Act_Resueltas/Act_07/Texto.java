package Tema7.Act_Resueltas.Act_07;

/* Diseñar la clase Texto que gestiona una cadena de caracteres con algunas características:
 *      - La cadena de caracteres tendrá una longitud máxima que se especifica en el constructor.
 *      - Permite añadir un carácter al principio o al final, siempre y cuando no se exceda la longitud máxima, es decir,
 *          exista espacio disponible.
 *      - Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y cuando no se rebase el
 *          tamaño máximo establecido.
 *      - Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.
 *      - Cada objeto de tipo Texto tiene que conocer la fecha en la que se creó, así como la fecha y hora de la última
 *          modificación efectuada.
 *      - Deberá existir un método que muestre la información que gestiona cada texto.
 */

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Texto {
    private String cadena;
    LocalDate creacion;
    LocalDateTime ultimaModificacion;
    private final int LONGITUD_MAX;
    static final String VOCALES = "aeiouáéíóúü";

    public Texto (int longitudMax) {
        cadena = "";
        this.LONGITUD_MAX = longitudMax;
        creacion = LocalDate.now();
        ultimaModificacion = null;
    }

    public void addFinal (char c) {
        if (LONGITUD_MAX > cadena.length() + 1) {
            cadena = cadena + c;
            ultimaModificacion = LocalDateTime.now();
        }
    }

    public void addFinal (String c) {
        if (LONGITUD_MAX >= cadena.length() + c.length()) {
            cadena = cadena + c;
            ultimaModificacion = LocalDateTime.now();
        }
    }

    public void addPrincipio (char c) {
        if (LONGITUD_MAX > cadena.length() + 1) {
            cadena = c + cadena;
            ultimaModificacion = LocalDateTime.now();
        }
    }

    public void addPrincipio (String c) {
        if (LONGITUD_MAX >= cadena.length() + c.length()) {
            cadena = c + cadena;
            ultimaModificacion = LocalDateTime.now();
        }
    }

    public void mostrar () {
        System.out.println("Texto creado el " + creacion);
        System.out.println("Última modificación: " + ultimaModificacion);
        System.out.println(cadena);
    }

    public int numVocales () {
        int voc = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (esVocal(cadena.charAt(i))) {
                voc++;
            }
        }
        return (voc);
    }

    private boolean esVocal (char c) {
        boolean vocal = false;
        c = Character.toLowerCase(c);
        if (VOCALES.indexOf(c) != -1) {
            vocal = true;
        }
        return (vocal);
    }
}