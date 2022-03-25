package Tema11.Act_Resueltas.Act_09;

/* ACTIVIDAD RESUELTA 11.9
 * Implementar un programa que registra la evolución temporal de la temperatura en una ciudad.
 * La aplicación mostrará un menú que permite añadir nuevos registros de temperatura y mostrar el listado de todos
 * los registros históricos.
 * Cada registro constará de la temperatura en grados centígrados, introducida por teclado, y la fecha y hora,
 * que se leerá del sistema en el momento de la creación del registro.
 */

import Utilidades.Teclado;

import java.io.*;
import java.util.Arrays;

public class Act_09 {
	public static void main (String[] args) {
		Registro[] reg = new Registro[0];
		int opc;
		double temperatura;

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivos_binary/temperaturas.dat"))) {
			reg = (Registro[]) in.readObject();
		}
		catch (FileNotFoundException ex1) {
			System.out.println("Registro vacío");
		}
		catch (IOException | ClassNotFoundException ex2) {
			System.out.println(ex2);
		}

		do {
			menu();
			opc = Teclado.leerOpcion(1,3);
			switch (opc) {
				case 1 -> {
					temperatura = Teclado.getDouble("Introducir temperatura: ");
					Registro nuevo = new Registro(temperatura);
					reg = Arrays.copyOf(reg,reg.length + 1);
					reg[reg.length - 1] = nuevo;
				}
				case 2 -> System.out.println(Arrays.deepToString(reg));
				case 3 -> System.out.println("¡Adiós!");
			}
		} while (opc != 3);

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("archivos_binary/temperaturas.dat"))) {
			out.writeObject(reg);
		}
		catch (IOException ex) {
			System.out.println(ex);
		}
	}

	static void menu() {
		System.out.println("-- MENÚ DE OPCIONES --");
		System.out.println("1. Nuevo registro");
		System.out.println("2. Mostrar historial de registros");
		System.out.println("3. Salir");
	}
}
