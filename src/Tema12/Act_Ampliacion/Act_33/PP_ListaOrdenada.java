package Tema12.Act_Ampliacion.Act_33;

/* ACTIVIDAD DE AMPLIACIÓN 12.33
 * Define la clase ListaOrdenada, que almacena una serie de objetos de tipo genérico E, de forma ordenada, pudiéndose
 * repetir.
 * Los elementos se ordenarán según el orden natural de E o bien con el criterio de orden definido en un comparador que
 * se le pasa al constructor.
 */

import java.util.Comparator;

public class PP_ListaOrdenada {
    public static void main(String[] args) {
        ListaOrdenada<String> cadenasNaturales = new ListaOrdenada<>();
        ListaOrdenada<String> cadenasNoNaturales = new ListaOrdenada<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        cadenasNaturales.insertarPrincipio("Patata");
        cadenasNaturales.insertarFinal("Tomates");
        cadenasNaturales.insertarPrincipio("Pepinillo");
        cadenasNaturales.insertarPrincipio("Peras");
        cadenasNaturales.insertarFinal("Melocotones");
        cadenasNaturales.insertarEn(3, "Mandarinas");
        cadenasNaturales.insertarEn(3, "Melocotones");
        cadenasNaturales.insertarEn(1, "Melocotones");
        cadenasNaturales.insertarPrincipio("Melocotones");
        cadenasNaturales.insertarFinal("Manzana");
        cadenasNaturales.insertarPrincipio("Kiwi");

        System.out.println("Orden natural (sin borrar)\n" + cadenasNaturales);

        cadenasNaturales.eliminarTodos("Melocotones");

        System.out.println("Orden natural (con borrado)\n" + cadenasNaturales);

        cadenasNoNaturales.getObjetos().addAll(cadenasNaturales.getObjetos());
        cadenasNoNaturales.insertarFinal("Otra cosa");
        cadenasNoNaturales.insertarFinal("Mas cosas");
        cadenasNoNaturales.insertarFinal("Uy");

        System.out.println("Orden no natural\n" + cadenasNoNaturales);
    }
}
