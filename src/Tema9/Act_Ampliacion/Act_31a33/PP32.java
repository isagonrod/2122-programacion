package Tema9.Act_Ampliacion.Act_31a33;

/* ACTIVIDAD DE AMPLIACIÓN 9.32
 * Utilizar la clase Lista para guardar una serie de llamadas.
 * A continuación, ordenarla con el criterio de orden natural y mostrarla por pantalla.
 */

import Tema9.Act_Aplicacion.Act_11y12_15a18_24y25.Lista;
import Utilidades.Fechas;

public class PP32 {
    public static void main (String[] args) {
        Lista listaLlamada = new Lista();

        listaLlamada.encolar(new Llamada("680701552","676414625",
                Fechas.formatearFechaCompleta("2022-02-23 19:00"),Fechas.formatearFechaCompleta("2022-02-23 19:08"),
                true,0));
        listaLlamada.encolar(new Llamada("680701552","676414625",
                Fechas.formatearFechaCompleta("2022-02-23 19:15"),Fechas.formatearFechaCompleta("2022-02-23 19:20"),
                false,0));

        listaLlamada.ordenar();
        listaLlamada.ordenar(new ComparaCosteLLamadas());
    }
}
