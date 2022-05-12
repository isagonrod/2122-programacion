package Tema12.Anexo.Act_3;

/* ACTIVIDAD 3 DEL ANEXO
 * Utilizando la clase ArrayList de la interfaz List se va a construir una clase que implemente una matriz dinámica.
 * Para ello definamos una clase Matriz con los siguientes atributos:
 *
 * 	a) Un atributo m que es un array de ListaEntero, de forma que m[0] contendrá la primera fila, m[1] la segunda fila y
 * 		así sucesivamente, y dos enteros fil y col que guardan el número de filas y columnas respectivamente.
 * 		Utilizaremos la clase Entero con un atributo de tipo int y una clase ListaEntero con un atributo de tipo
 * 		ArrayList de Entero.
 *
 * 	b) Un método constructor que reciba dos enteros indicando el número de filas y columnas e inicialice la matriz con
 * 		elementos de tipo Entero con valor cero.
 *
 * 	c) Un método constructor que reciba dos enteros con el número de filas y columnas y un array bidimensional de tipo
 * 		int con los valores iniciales de la matriz.
 *
 * 	d) Un método set que reciba una fila, una columna y un Entero y modifique el valor correspondiente a esa fila y
 * 		columna con el argumento Entero. Utilice para ello el método set de la interfaz List.
 *
 * 	e) Un método get que reciba dos argumentos de tipo int y devuelva el Entero que está en la posición indicada.
 *
 * 	f) Un método numFil y numCol que devuelvan respectivamente el número de fila y columnas de la matriz.
 *
 * 	g) Un método imprime que muestre la matriz de manera tradicional, es decir, con una fila en cada línea.
 * 		Además, deberá imprimir una primera línea con el mensaje que se le pase como argumento.
 *
 * 	h) Un método suma que devuelva en el objeto que invoca la suma de las dos matrices que son pasadas por argumento.
 * 		Supóngase que todas las matrices tienen el mismo número de filas y columnas.
 * 		Una vez terminado este método, reescriba el código para que lance dos excepciones distintas para el caso de que
 * 		las dimensiones de las matrices que se suman no sean iguales y para el caso de que la matriz que invoca la suma
 * 		no sea de las dimensiones de los sumandos.
 *
 * 	i) Un método denominado espejo de tal manera que el objeto que invoca se modifique, devolviendo una matriz con su
 * 		imagen especular.
 */

public class Principal {
	public static void main(String[] args) {
		Matriz matriz1 = new Matriz(2, 3);

		int[][] tabla = {{1, 2, 3},{4, 5, 6}};
		Matriz matriz2 = new Matriz(2, 3, tabla);

		matriz1.imprime("-- MATRIZ 1 --");
		matriz2.imprime("-- MATRIZ 2 --");
	}
}
