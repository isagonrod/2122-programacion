package Tema9.Act_Ampliacion.Act_28a30;

/* ACTIVIDAD DE AMPLIACIÓN 9.29
 * Usar la clase Lista de elementos Object para almacenar una serie de jornadas de empleados como las de la actividad
 * de ampliación 9.28.
 * Una vez insertadas, ordenar la lista y mostrar por pantalla sus elementos.
 */

import Tema9.Act_Aplicacion.Act_11y12_15a18_24y25.Lista;
import Utilidades.Fechas;

public class PP29 {
    public static void main (String[] args) {
        Lista jornadas = new Lista();

        jornadas.encolar(new Jornada(
                "11111111A",
                Fechas.formatearFechaCompleta("2022-02-22 08:15"),
                Fechas.formatearFechaCompleta("2022-02-22 10:30")
        ));
        jornadas.encolar(new Jornada("22222222B",Fechas.formatearFechaCompleta("2022-02-21 08:15"),
                Fechas.formatearFechaCompleta("2022-02-21 10:15")));

        System.out.println("JORNADA ORDENADA (orden natural)");
        jornadas.ordenar();
        System.out.println("\nJORNADA ORDENADA (por minutos trabajados)");
        jornadas.ordenar(new ComparaJornadas());
    }
}
