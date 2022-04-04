package Tema11.Act_Aplicacion.Act_20;

import Utilidades.Teclado;

import java.util.Arrays;

public class ConjuntoCliente {
	private Cliente[] tabla;

	public ConjuntoCliente() {
		this.tabla = new Cliente[0];
	}

	public Cliente[] getTabla() {
		return tabla;
	}

	public void setTabla(Cliente[] tabla) {
		this.tabla = tabla;
	}

	public Cliente[] insertarCliente(Cliente nuevo) {
		Cliente[] aux = this.tabla;
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

	public int buscar(String id) {
		int indice = -1;
		for (int i = 0; i < this.tabla.length && indice == -1; i++) {
			if (this.tabla[i].getId().compareToIgnoreCase(id) == 0) {
				indice = i;
			}
		}
		return indice;
	}

	public Cliente modificarDatos(String id) {
		Cliente cliente = null;
		int posicion = this.buscar(id);

		if (posicion >= 0) {
			this.tabla[posicion].setNombre(Teclado.getString("Nuevo nombre: "));
			this.tabla[posicion].setTelefono(Teclado.getString("Nuevo teléfono: "));
			cliente = this.tabla[posicion];
		}

		return cliente;
	}

	public Cliente eliminarCliente(String id) {
		Cliente eliminado = null;
		int posicion = this.buscar(id);

		if (posicion >= 0 && posicion < this.tabla.length) {
			eliminado = this.tabla[posicion];
			System.arraycopy(tabla, posicion + 1, tabla, posicion, this.tabla.length - (posicion + 1));
			this.tabla = Arrays.copyOf(this.tabla, this.tabla.length - 1);
		}

		return eliminado;

	}

	public void bajaCliente(String id) {
		this.eliminarCliente(id);
	}

	public void listarClientes() {
		System.out.println(Arrays.toString(getTabla()));
	}
}
