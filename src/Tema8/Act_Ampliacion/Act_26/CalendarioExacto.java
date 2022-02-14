package Tema8.Act_Ampliacion.Act_26;

/* EJERCICIO 8.26
 * A partir de la clase Calendario, implementada en la Actividad de aplicación 7.15, escribe la clase CalendarioExacto,
 * que determina un instante de tiempo exacto formado por un año, un mes, un día, una hora y un minuto.
 * Implementa los métodos toString(), equals() y aquellos necesarios para manejar la clase.
 */

import Tema7.Act_Aplicacion.Act_15.Calendario;

public class CalendarioExacto extends Calendario {
    int hora, minuto;

    public CalendarioExacto(int year, int month, int day, int hora, int minuto) {
        super(year, month, day);
        this.hora = hora;
        this.minuto = minuto;
    }

    public String toString() {
        return super.toString() + "; a las " + hora + ":" + minuto + " h.";
    }

    public boolean equals(CalendarioExacto otroCalendario) {
        return super.equals(otroCalendario) && this.hora == otroCalendario.hora && this.minuto == otroCalendario.minuto;
    }
}
