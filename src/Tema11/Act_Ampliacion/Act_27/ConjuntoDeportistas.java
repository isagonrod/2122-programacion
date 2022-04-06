package Tema11.Act_Ampliacion.Act_27;

import Utilidades.Teclado;

import java.time.LocalDate;
import java.util.Arrays;

public class ConjuntoDeportistas {
	private Deportista[] tabla;

	public ConjuntoDeportistas() {
		this.tabla = new Deportista[0];
	}

	public Deportista[] getTabla() {
		return tabla;
	}

	public void setTabla(Deportista[] tabla) {
		this.tabla = tabla;
	}

	public Deportista[] altaDeportista(Deportista nuevo) {
		Deportista[] aux = this.tabla;
		int posicion = Arrays.binarySearch(aux, nuevo);

		if (posicion < 0) {
			posicion = Math.abs(posicion) - 1;

			aux = Arrays.copyOf(aux, aux.length + 1);
			System.arraycopy(aux, 0, aux, 0, posicion);
			System.arraycopy(aux, posicion, aux, posicion + 1, aux.length - posicion - 1);

			aux[posicion] = nuevo;

			this.tabla = aux;
		}

		return this.tabla;
	}

	public int buscarPosicionDeportista(int dni) {
		int indice = -1, i;

		for (i = 0; i < this.tabla.length; i++) {
			if (this.tabla[i].getDni() == dni) {
				indice = i;
			}
		}

		return indice;
	}

	public Deportista buscarDeportista(int dni) {
		Deportista resultado = null;
		int objetivo = this.buscarPosicionDeportista(dni);

		if (objetivo != -1) {
			resultado = this.tabla[objetivo];
		}

		return resultado;
	}

	public Deportista bajaDeportista(int dni) {
		Deportista eliminado = null;
		int posicion = this.buscarPosicionDeportista(dni);

		if (posicion >= 0 && posicion < this.tabla.length) {
			eliminado = this.tabla[posicion];
			System.arraycopy(this.tabla, posicion + 1, this.tabla, posicion, this.tabla.length - (posicion + 1));
			this.tabla = Arrays.copyOf(this.tabla, this.tabla.length - 1);
		}

		return eliminado;
	}

	public Deportista modificarDatosDeportista(int dni) {
		Deportista modificado = null;
		int posicion = this.buscarPosicionDeportista(dni);

		if (posicion >= 0 && posicion < this.tabla.length) {
			modificado = this.tabla[posicion];
			modificado.setNombre(Teclado.getString("Nuevo nombre: "));
			modificado.setFechaNacimiento(Teclado.getString("Nueva fecha de nacimiento: "));
			modificado.setDeporte(Deporte.valueOf(Teclado.getString("Nuevo deporte: ")));
		}
		return modificado;
	}

	public void listadoOrdenadoNombre() {
		Arrays.sort(this.tabla);
		System.out.println(Arrays.deepToString(this.tabla));
	}

	public void listadoOrdenadoEdad() {
		Arrays.sort(this.tabla, new ComparaEdad());
		System.out.println(Arrays.deepToString(this.tabla));
	}
}
