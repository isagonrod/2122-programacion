package Tema11.Act_Ampliacion.Act_28y29;

import Utilidades.Teclado;

import java.util.Arrays;

public class ConjuntoSocio {
	private Socio[] tabla;

	public ConjuntoSocio() {
		this.tabla = new Socio[0];
	}

	public Socio[] getTabla() {
		return tabla;
	}

	public void setTabla(Socio[] tabla) {
		this.tabla = tabla;
	}

	public String toString() {
		return Arrays.deepToString(this.tabla);
	}

	public Socio[] altaSocio(Socio nuevo) {
		Socio[] aux = this.tabla;
		int posicion = Arrays.binarySearch(aux, nuevo);

		if (nuevo.getFamiliares() == null) {
			nuevo.setFamiliares(new Familiar[0]);
		}

		if (posicion < 0) {
			posicion = Math.abs(posicion) - 1;

			aux = Arrays.copyOf(aux, aux.length + 1);
			System.arraycopy(aux, 0, aux, 0, posicion);
			System.arraycopy(aux, posicion, aux, posicion + 1, aux.length - posicion - 1);

			aux[posicion] = nuevo;

			this.tabla = aux;
		}
		Socio.numSocioActual++;

		return this.tabla;
	}

	public int buscarPosicionSocio(int numSocio) {
		int indice = -1, i;

		for (i = 0; i < this.tabla.length; i++) {
			if (this.tabla[i].getNumSocio() == numSocio) {
				indice = i;
			}
		}

		return indice;
	}

	public void pedirDatosFamiliar(int numSocio, int cantidadFamiliares) {
		int posicion = this.buscarPosicionSocio(numSocio), i;

		if (posicion >= 0) {
			for (i = 0; i < cantidadFamiliares; i++) {
				this.tabla[posicion].altaFamiliar(
				new Familiar(
						Teclado.getString("DNI: "),
						Teclado.getString("Nombre completo: "),
						Teclado.getString("Fecha de nacimiento: ")));
			}
		}
		else {
			System.out.println("Error: Socio no encontrado\n");
		}
	}

	public Socio bajaSocio(int numSocio) {
		Socio eliminado = null;
		int posicion = this.buscarPosicionSocio(numSocio);

		if (posicion >= 0 && posicion < this.tabla.length) {
			eliminado = this.tabla[posicion];
			System.arraycopy(this.tabla, posicion + 1, this.tabla, posicion, this.tabla.length - (posicion + 1));
			this.tabla = Arrays.copyOf(this.tabla, this.tabla.length - 1);
		}

		return eliminado;
	}

	public Socio modificarDatosSocio(int numSocio) {
		Socio modificado = null;
		int posicion = this.buscarPosicionSocio(numSocio);

		if (posicion >= 0 && posicion < this.tabla.length) {
			modificado = this.tabla[posicion];
			modificado.setNombre(Teclado.getString("Nuevo nombre: "));
			modificado.setFechaNacimiento(Teclado.getString("Nueva fecha de nacimiento: "));
			modificado.setFechaAlta(Teclado.getString("Nueva fecha de alta: "));
			modificado.setTelefono(Teclado.getNumber("Nuevo teléfono: "));
			modificado.setEmail(Teclado.getString("Nuevo correo electrónico: "));
		}
		return modificado;
	}

	public void listadoOrdenadoNombre() {
		Arrays.sort(this.tabla);
		System.out.println(Arrays.deepToString(this.tabla));
	}

	public void listadoOrdenadoAntigüedad() {
		Arrays.sort(this.tabla, new ComparaAntigüedad());
		System.out.println(Arrays.deepToString(this.tabla));
	}

	public void listadoConFamiliares() {
		for (Socio s : this.tabla) {
			Arrays.sort(s.getFamiliares(), new ComparaFamiliares());
			System.out.println(s);
			System.out.println(Arrays.deepToString(s.getFamiliares()));
			System.out.println("-----------------");
		}
	}
}
