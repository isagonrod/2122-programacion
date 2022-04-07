package Tema11.Act_Ampliacion.Act_30;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class ConjuntoJornadas {
	private Jornada[] tabla;

	public ConjuntoJornadas() {
		this.tabla = new Jornada[0];
	}

	public Jornada[] getTabla() {
		return tabla;
	}

	public void setTabla(Jornada[] tabla) {
		this.tabla = tabla;
	}

	public void altaJornada(Jornada nueva) {
		Jornada[] aux = this.tabla;
		int posicion = Arrays.binarySearch(aux, nueva);

		if (posicion < 0) {
			posicion = Math.abs(posicion) - 1;

			aux = Arrays.copyOf(aux, aux.length + 1);
			System.arraycopy(aux, 0, aux, 0, posicion);
			System.arraycopy(aux, posicion, aux, posicion + 1, aux.length - posicion - 1);

			aux[posicion] = nueva;
			this.tabla = aux;
		}
	}

	public void entrada(String dni, String fecha, String horaEntrada) {
		int posicion = buscar(dni, null);

		if (posicion >= 0) {
			posicion = Math.abs(posicion);
			this.tabla[posicion].setFechaJornada(fecha);
			this.tabla[posicion].setHoraEntrada(horaEntrada);
		}
	}

	public void salida(String dni, String fecha, String horaSalida) {
		int posicion = buscar(dni, fecha);

		if (posicion >= 0) {
			posicion = Math.abs(posicion);
			this.tabla[posicion].setHoraSalida(horaSalida);
		}
	}

	public int buscar(String dni, String fecha) {
		int indice = -1, i;
		LocalDate fechaSolicitada = null;
		if (fecha != null) {
			DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			fechaSolicitada = LocalDate.parse(fecha, f);
		}

		for (i = 0; i < this.tabla.length; i++) {
			if (this.tabla[i].getDni().equals(dni) && (
					(fecha == null && this.tabla[i].getFechaJornada() == null) ||
					(fecha != null && this.tabla[i].getFechaJornada().equals(fechaSolicitada))
			)) {
				indice = i;
			}
		}

		return indice;
	}
}
