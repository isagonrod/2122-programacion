package Tema8.Act_Aplicacion.Act_14a20;

/* EJERCICIO 8.16
 * Diseña la clase Pila heredando de Lista (ver actividad resuelta 7.13)
 */

public class PilaNueva extends ListaNueva {
    public PilaNueva() {
        super();
    }

    void apilar(Integer elemento) {
        super.insertarFinal(elemento);
    }

    Integer desapilar() {
        return super.eliminar(tabla.length - 1);
    }

    public void mostrar() {
        super.toString();
    }
}
