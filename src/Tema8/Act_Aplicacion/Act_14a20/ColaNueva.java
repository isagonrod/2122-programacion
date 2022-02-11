package Tema8.Act_Aplicacion.Act_14a20;

/* EJERCICIO 8.17
 * Escribe la clase Cola heredando de Lista (ver actividad final 7.18)
 */

import java.util.Arrays;

public class ColaNueva extends ListaNueva {
    public ColaNueva() {
        super();
    }

    void encolar(Integer elemento) {
        super.insertarFinal(elemento);
    }

    Integer desencolar() {
        return super.eliminar(tabla[0]);
    }

    public String toString() {
        return "Cola: " + Arrays.toString(tabla);
    }
}
