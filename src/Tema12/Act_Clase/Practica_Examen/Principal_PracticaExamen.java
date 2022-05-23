package Tema12.Act_Clase.Practica_Examen;

/* ACTIVIDAD PARA PRACTICAR ANTES DEL EXAMEN
 * Construya las siguientes clases:
 * 	- Persona que almacene nombre, apellidos y edad y a partir de ella una clase Empleado que añada puesto, fecha de
 * 		ingreso y sueldo.
 * 	- Fecha simple para usarla en las clases anteriores.
 * 	- Una colección de empleado en un programa de prueba (main).
 *
 * Realice las siguientes consultas en la colección de empleados:
 * 	1. Listado de todos los empleados.
 * 	2. Todos los empleados a partir de una edad.
 * 	3. Selecciona los empleados que ingresaron antes de una fecha.
 * 	4. Suma los sueldos de todos los empleados.
 * 	5. Suma los sueldos de todos los empleados que ingresaron antes de una fecha.
 */

import Utilidades.Teclado;

import java.util.Set;
import java.util.TreeSet;

public class Principal_PracticaExamen {
	public static void main(String[] args) {
		Set<Empleado> empleados = new TreeSet<>();
		rellenarConjunto(empleados);
		int opc;

		do {
			menu();
			opc = Teclado.leerOpcion(1, 6);
			switch (opc) {
				case 1 -> {
					for (Empleado e : empleados) {
						System.out.println(e);
					}
				}
				case 2 -> {
					int edad = Teclado.getNumber("Edad de los empleados (límite superior): ");
				}
				case 6 -> System.out.println("¡Adiós!");
			}
		} while (opc != 6);
	}

	static void menu() {
		System.out.println("\n-- MENÚ DE OPCIONES --");
		System.out.println("1. Listado de todos los empleados");
		System.out.println("2. Listado de todos los empleados a partir de una edad");
		System.out.println("3. Listado de todos los empleados que ingresaron antes de una fecha");
		System.out.println("4. Suma de los sueldos de todos los empleados");
		System.out.println("5. Suma de los sueldos de todos los empleados que ingresaron antes de una fecha");
		System.out.println("6. Salir");
	}

	static void rellenarConjunto(Set<Empleado> conjunto) {
		conjunto.add(new Empleado("Miguel Ángel", "Ruiz Sánchez", new Fecha(23, 12, 1986),
				"Programador backend PHP", new Fecha(23, 5, 2022), 3800.00));
		conjunto.add(new Empleado("Isabel María", "González Rodríguez", new Fecha(10, 12, 1985),
				"Profesora-Bibliotecaria", new Fecha(1, 1, 2020), 550.48));
		conjunto.add(new Empleado("Francisco Javier", "González Rodríguez", new Fecha(16, 6, 1995),
				"Programador fronted", new Fecha(10, 7, 2020), 1100.20));
	}
}
