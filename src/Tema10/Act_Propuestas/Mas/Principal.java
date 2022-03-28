package Tema10.Act_Propuestas.Mas;

/* EJERCICIO DE PRÁCTICA PARA EL EXAMEN
 * Se tienen varios ficheros (de lectura), y en cada fichero se tiene un conjunto de nombres.
 * Después de cada nombre hay un número.
 * Hay que crear un fichero de salida en el que habrá una línea para cada uno de los nombres, en el caso de que haya uno
 * repetido, hay que sumar la cantidad que tengan dejando el nombre igual y todos los números (en la misma línea).
 */

public class Principal {
	public static void main (String[] args) {
		ConjuntoNombreNumero conjunto = new ConjuntoNombreNumero();

		conjunto.leerFichero("nombres1");
		conjunto.mostrarTabla();

		conjunto.leerFichero("nombres2");
		conjunto.mostrarTabla();

		conjunto.escribirFichero();
	}
}
