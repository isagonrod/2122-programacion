package Tema11.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 11.23
 * Implementa el método, Integer[] fusionar(String fichero1, String fichero2), al que se le pasan los nombres de dos
 * ficheros binarios que contienen dos listas ordenadas de objetos Integer, y devuelve una tabla ordenada con todos
 * los elementos de ambos ficheros.
 */

import Tema9.Act_Aplicacion.Act_11y12_15a18_24y25.Lista;

import java.io.*;
import java.util.Arrays;

public class Act_23 {
	public static void main (String[] args) {
//		Integer[] fichero1 = {1, 3, 5, 71, 88, 90};
//		Integer[] fichero2 = {2, 6, 69, 71, 91, 99};
//
//		guardarEnFichero(fichero1, "fichero1");
//		guardarEnFichero(fichero2, "fichero2");

		Integer[] tablaOrdenada = fusionar("fichero1", "fichero2");

		System.out.println(Arrays.toString(tablaOrdenada));
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

	static Integer[] fusionar(String fichero1, String fichero2) {
		Integer num1, num2;
		Lista lista = new Lista();
		ObjectInputStream in1 = null, in2 = null;
		boolean eofNum1 = false, eofNum2 = false;

		try {
			in1 = new ObjectInputStream(new FileInputStream("archivos_binary/" + fichero1 + ".dat"));
			in2 = new ObjectInputStream(new FileInputStream("archivos_binary/" + fichero2 + ".dat"));

			num1 = in1.readInt();
			num2 = in2.readInt();

			while(!eofNum1) {
				if (!eofNum2 && num1 > num2) {
					lista.encolar(num2);

					try {
						num2 = in2.readInt();
					}
					catch (EOFException e) {
						eofNum2 = true;
						System.out.println("EOF en fichero2");
					}

				} else if (!eofNum2 && num1.equals(num2)) {
					lista.encolar(num1);

					try {
						num1 = in1.readInt();
					}
					catch (EOFException e) {
						eofNum1 = true;
						System.out.println("EOF en fichero1");
					}

					try {
						num2 = in2.readInt();
					}
					catch (EOFException e) {
						eofNum2 = true;
						System.out.println("EOF en fichero2");
					}

				} else {
					lista.encolar(num1);

					try {
						num1 = in1.readInt();
					}
					catch (EOFException e) {
						eofNum1 = true;
						System.out.println("EOF en fichero1");
					}
				}
			}

			while(!eofNum2) {
				lista.encolar(num2);

				try {
					num2 = in2.readInt();
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
		return resultado;
	}
}
