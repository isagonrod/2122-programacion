package Tema12.Act_Ampliacion;

/* ACTIVIDAD DE AMPLIACIÓN 12.36
 * Repite la actividad de ampliación 9.32 utilizando una colección para guardar y manipular las Llamadas.
 */

import Tema9.Act_Ampliacion.Act_31a33.ComparaCosteLLamadas;
import Tema9.Act_Ampliacion.Act_31a33.Llamada;
import Tema9.Act_Aplicacion.Act_11y12_15a18_24y25.Lista;
import Utilidades.Fechas;

import java.util.Set;
import java.util.TreeSet;

public class Act_36 {
    public static void main (String[] args) {
        Set<Llamada> conjuntoLlamadas = new TreeSet<>();

        conjuntoLlamadas.add(new Llamada("680701552","676414625",
                Fechas.formatearFechaCompleta("2022-02-23 19:00"),Fechas.formatearFechaCompleta("2022-02-23 19:08"),
                true,0));
        conjuntoLlamadas.add(new Llamada("680701552","676414625",
                Fechas.formatearFechaCompleta("2022-02-23 19:15"),Fechas.formatearFechaCompleta("2022-02-23 19:20"),
                false,0));

        Set<Llamada> llamadasOrdenadas = new TreeSet<>(new ComparaCosteLLamadas());
        llamadasOrdenadas.addAll(conjuntoLlamadas);

        System.out.println(conjuntoLlamadas);
        System.out.println(llamadasOrdenadas);
    }
}
