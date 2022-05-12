package Tema12.Anexo.Act_3;

public class Matriz {
	private ListaEntero[] m;
	private int fila;
	private int columna;

	public Matriz(int nFilas, int nColumnas) {
		this.fila = nFilas;
		this.columna = nColumnas;
		this.m = new ListaEntero[0];
	}

	public Matriz(int nFilas, int nColumnas, int[][] matriz) {
		this.fila = nFilas;
		this.columna = nColumnas;
		//TODO: ¿Cómo inicializo aquí ListaEntero[]m con el int[][] matriz?
	}

	public ListaEntero[] getM() {
		return this.m;
	}

	public void setM(ListaEntero[] m) {
		this.m = m;
	}

	public int getFila() {
		return this.fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return this.columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public void set(int fila, int columna, Entero valor) {

	}
}
