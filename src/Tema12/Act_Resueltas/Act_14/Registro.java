package Tema12.Act_Resueltas.Act_14;

import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Registro implements Serializable {
    LocalTime hora;
    double temperatura;

    public Registro(double temperatura) {
        this.temperatura = temperatura;
        this.hora = LocalTime.now();
    }

    public boolean equal(Object o) {
        return hora.equals(((Registro)o).hora);
    }

    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
        return "Registro {Hora: " + this.hora.format(f) + ", Temperatura: " + this.temperatura + "ºC}\n";
    }
}
