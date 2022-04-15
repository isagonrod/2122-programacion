package Tema11.Práctica;

import java.util.Arrays;

public class ConjuntoAlumnos {
	private Alumno[] lista;

	public ConjuntoAlumnos() {
		this.lista = new Alumno[0];
	}

	public Alumno[] getLista() {
		return lista;
	}

	public void setLista(Alumno[] lista) {
		this.lista = lista;
	}

	public String toString() {
		return Arrays.toString(this.lista);
	}

	public Alumno[] insertarAlumno(Alumno nuevo) {
		Alumno[] aux = this.lista;
		int pos = Arrays.binarySearch(aux, nuevo);

		if (pos < 0) {
			pos = Math.abs(pos) - 1;
			aux = Arrays.copyOf(aux, aux.length + 1);
			System.arraycopy(aux, 0, aux, 0, pos);
			System.arraycopy(aux, pos, aux, pos + 1, aux.length - pos - 1);
			aux[pos] = nuevo;
			this.lista = aux;
		}
		return this.lista;
	}
}
