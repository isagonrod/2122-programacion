package Tema12.Act_Resueltas.Act_03;

import Tema12.Act_Propuestas.Act_02.Cola;

import java.util.Arrays;

public class Contenedor<T> implements Pila<T>, Cola<T> {

	private T[] objetos;

	public Contenedor(T[] objetos) {
		this.objetos = objetos;
	}
	@Override
	public void apilar(T nuevo) {
		this.objetos = Arrays.copyOf(this.objetos, this.objetos.length + 1);
		System.arraycopy(this.objetos, 0, this.objetos, 1, this.objetos.length - 1);
		this.objetos[0] = nuevo;
	}

	@Override
	public T desapilar() {
		T res = null;
		if (this.objetos.length > 0) {
			res = this.objetos[0];
			this.objetos = Arrays.copyOfRange(this.objetos, 1, this.objetos.length);
		}
		return res;
	}

	@Override
	public void encolar(T nuevo) {
		this.objetos = Arrays.copyOf(this.objetos, this.objetos.length + 1);
		this.objetos[this.objetos.length - 1] = nuevo;
	}

	@Override
	public T desencolar() {
		return this.desapilar();
	}
}
