package Tema11.Act_Resueltas.Act_09;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Registro implements Serializable {
	double temperatura;
	LocalDateTime fechaYhora;

	public Registro(double temperatura) {
		this.temperatura = temperatura;
		fechaYhora = LocalDateTime.now();
	}

	@Override
	public String toString() {
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.getDefault());
		return "Registro { temperatura = " + temperatura + ", fecha y hora = " + f.format(fechaYhora) + " }\n";
	}
}
