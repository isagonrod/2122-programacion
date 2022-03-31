package Tema11.Act_Aplicacion.Act_20;

import java.lang.reflect.Array;
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
		int posicion;

		this.tabla = Arrays.copyOf(this.tabla,this.tabla.length + 1);
		posicion = Arrays.binarySearch(this.tabla, nuevo.getId());

		System.arraycopy(this.tabla,0,this.tabla,0,posicion);
		System.arraycopy(this.tabla,posicion,this.tabla,posicion + 1,this.tabla.length - posicion);

		tabla[posicion] = nuevo;

		return this.tabla;
	}
}
