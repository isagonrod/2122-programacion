package Tema11.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 11.24
 * Implementa el método, void fusionar (String ficheroBase, String ficheroNuevo), que añade a ficheroBase los elementos
 * de ficheroNuevo, ambos ordenados.
 * Al final, ficheroBase contiene la lista ordenada de todos los elementos de ambos ficheros.
 */

import Tema9.Act_Aplicacion.Act_11y12_15a18_24y25.Lista;

import java.io.*;

public class Act_24 {
	public static void main (String[] args) {
//		Integer[] ficheroBase = {1, 3, 5, 71, 88, 90};
//		Integer[] ficheroNuevo = {2, 6, 69, 71, 91, 99};
//
//		guardarEnFichero(ficheroBase, "ficheroBase");
//		guardarEnFichero(ficheroNuevo, "ficheroNuevo");

		fusionar("ficheroBase", "ficheroNuevo");
	}

	static void guardarEnFichero(Integer[] tabla, String nombreFichero) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("archivos_binary/" + nombreFichero + ".dat"))) {
			for (Integer num : tabla) {
				out.writeInt(num);
			}
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	static void fusionar(String fichero1, String fichero2) {
		Integer numB, numN;
		Lista lista = new Lista();
		ObjectInputStream in1 = null, in2 = null;
		boolean eofNum1 = false, eofNum2 = false;

		try {
			in1 = new ObjectInputStream(new FileInputStream("archivos_binary/" + fichero1 + ".dat"));
			in2 = new ObjectInputStream(new FileInputStream("archivos_binary/" + fichero2 + ".dat"));

			numB = in1.readInt();
			numN = in2.readInt();

			while(!eofNum1) {
				if (!eofNum2 && numB > numN) {
					lista.encolar(numN);

					try {
						numN = in2.readInt();
					}
					catch (EOFException e) {
						eofNum2 = true;
						System.out.println("EOF en fichero2");
					}

				} else if (!eofNum2 && numB.equals(numN)) {
					lista.encolar(numB);

					try {
						numB = in1.readInt();
					}
					catch (EOFException e) {
						eofNum1 = true;
						System.out.println("EOF en fichero1");
					}

					try {
						numN = in2.readInt();
					}
					catch (EOFException e) {
						eofNum2 = true;
						System.out.println("EOF en fichero2");
					}

				} else {
					lista.encolar(numB);

					try {
						numB = in1.readInt();
					}
					catch (EOFException e) {
						eofNum1 = true;
						System.out.println("EOF en fichero1");
					}
				}
			}

			while(!eofNum2) {
				lista.encolar(numN);

				try {
					numN = in2.readInt();
				}
				catch (EOFException e) {
					eofNum2 = true;
					System.out.println("EOF en fichero2");
				}
			}
		}
		catch (IOException e) {
			System.out.println("Falta un fichero");
		}
		finally {
			if (in1 != null) {
				try {
					in1.close();
				}
				catch (IOException ex) {
					System.out.println(ex.getMessage());
				}
				if (in2 != null) {
					try {
						in2.close();
					}
					catch (IOException ex) {
						System.out.println(ex.getMessage());
					}
				}
			}
		}

		Integer[] resultado = new Integer[lista.getLength()];
		System.arraycopy(lista.getTabla(), 0, resultado, 0, lista.getLength());

		guardarEnFichero(resultado, "ficheroBase");
	}
}
