package Tema12.Anexo.Act_1;

import java.util.Collections;

public class Matriz {
	private ListaEntero[] m;
	private int fila;
	private int columna;

	/** Un método constructor que reciba dos enteros indicando el número de filas y columnas e inicialice la matriz con
	 * 	elementos de tipo Entero con valor cero.
	 *
	 * @param nFilas
	 * @param nColumnas
	 */
	public Matriz(int nFilas, int nColumnas) {
		this.fila = nFilas;
		this.columna = nColumnas;
		this.m = new ListaEntero[nFilas];

		for (int i = 0; i < nFilas; i++) {
			this.m[i] = new ListaEntero();
			for (int j = 0; j < nColumnas; j++) {
				this.m[i].getLista().add(new Entero(0));
			}
		}
	}

	/** Un método constructor que reciba dos enteros con el número de filas y columnas y un array bidimensional de tipo
	 * 	int con los valores iniciales de la matriz.
	 *
	 * @param nFilas
	 * @param nColumnas
	 * @param matriz
	 */
	public Matriz(int nFilas, int nColumnas, int[][] matriz) {
		this.fila = nFilas;
		this.columna = nColumnas;
		this.m = new ListaEntero[nFilas];

		for (int i = 0; i < nFilas; i++) {
			this.m[i] = new ListaEntero();
			for (int j = 0; j < nColumnas; j++) {
				this.m[i].getLista().add(new Entero(matriz[i][j]));
			}
		}
	}

	public ListaEntero[] getM() {
		return this.m;
	}

	public void setM(ListaEntero[] m) {
		this.m = m;
	}

	/** Un método numFil que devuelva el número de fila de la matriz.
	 *
	 * @return
	 */
	public int getFila() {
		return this.fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	/** Un método numCol que devuelva el número de columna de la matriz.
	 *
	 * @return
	 */
	public int getColumna() {
		return this.columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	/** Un método set que reciba una fila, una columna y un Entero y modifique el valor correspondiente a esa fila y
	 *  columna con el argumento Entero. Utilice para ello el método set de la interfaz List.
	 *
	 * @param fila
	 * @param columna
	 * @param valor
	 */
	public void set(int fila, int columna, Entero valor) {
		this.m[fila].getLista().set(columna, valor);
	}

	/** Un método get que reciba dos argumentos de tipo int y devuelva el Entero que está en la posición indicada.
	 *
	 * @param fila
	 * @param columna
	 * @return
	 */
	public Entero get(int fila, int columna) {
		return this.m[fila].getLista().get(columna);
	}

	/** Un método imprime que muestre la matriz de manera tradicional, es decir, con una fila en cada línea.
	 *  Además, deberá imprimir una primera línea con el mensaje que se le pase como argumento.
	 *
	 * @param cabecera
	 */
	public void imprime(String cabecera) {
		System.out.println(cabecera);

		for(ListaEntero lista : this.m) {
			System.out.println(lista.getLista());
		}
	}

	/** Un método suma que devuelva en el objeto que invoca la suma de las dos matrices que son pasadas por argumento.
	 * 	Supóngase que todas las matrices tienen el mismo número de filas y columnas.
	 * 	Una vez terminado este método, reescriba el código para que lance dos excepciones distintas para el caso de que
	 * 	las dimensiones de las matrices que se suman no sean iguales y para el caso de que la matriz que invoca la suma
	 * 	no sea de las dimensiones de los sumandos. */
	public void suma(Matriz m1, Matriz m2) throws Exception {
		if (m1.fila != m2.fila) {
			throw new NumFilaException("Las filas de los sumandos no son iguales");
		} else if (m1.columna != m2.columna) {
			throw new NumColException("Las columnas de los sumandos no son iguales");
		} else if (this.fila != m1.fila) {
			throw new NumFilaException("Las filas del objeto actual no son iguales a las de los sumandos");
		} else if (this.columna != m1.columna) {
			throw new NumColException("Las columnas del objeto actual no son iguales a las de los sumandos");
		} else {
			for (int i = 0; i < this.fila; i++) {
				for (int j = 0; j < this.columna; j++) {
					Entero nuevoEntero = new Entero(m1.m[i].getLista().get(j).getNum() + m2.m[i].getLista().get(j).getNum());
					this.m[i].getLista().set(j, nuevoEntero);
				}
			}
		}
	}


	/** Un método denominado espejo de tal manera que el objeto que invoca se modifique, devolviendo una matriz con su
	 * 	imagen especular. */
	public void espejo() {
		for (ListaEntero lista : this.m) {
			Collections.reverse(lista.getLista());
		}
	}
}
