package Tema11.Act_Ampliacion.Act_30;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Jornada implements Comparable, Serializable {
	final private String dni;
	private LocalDate fechaJornada;
	private LocalTime horaEntrada;
	private LocalTime horaSalida;

	public Jornada(String dni) {
		this.dni = dni;
		this.fechaJornada = null;
	}

	public String getDni() {
		return dni;
	}

	public LocalDate getFechaJornada() {
		return this.fechaJornada;
	}

	public void setFechaJornada(String fechaJornada) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaJornada = LocalDate.parse(fechaJornada, f);
	}

	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(String horaEntrada) {
		DateTimeFormatter h = DateTimeFormatter.ofPattern("HH:mm");
		this.horaEntrada = LocalTime.parse(horaEntrada, h);
	}

	public LocalTime getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		DateTimeFormatter h = DateTimeFormatter.ofPattern("HH:mm");
		this.horaSalida = LocalTime.parse(horaSalida, h);
	}

	@Override
	public int compareTo(Object o) {
		return this.dni.compareTo(((Jornada)o).dni);
	}
}
