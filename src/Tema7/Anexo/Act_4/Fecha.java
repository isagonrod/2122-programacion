package Tema7.Anexo.Act_4;

import java.time.LocalDateTime;

public class Fecha {
    Integer dia;
    Integer mes;
    Integer año;

    public Fecha (int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public static Fecha generarFechaActual() {
        LocalDateTime ahora = LocalDateTime.now();
        return new Fecha(ahora.getDayOfMonth(), ahora.getMonthValue(), ahora.getYear());
    }

    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.año;
    }
}
