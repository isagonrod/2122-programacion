package Tema12.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 12.26
 * Un centro educativo necesita distribuir de forma aleatoria a los alumnos de un curso entre los grupos disponibles
 * para ese curso. Diseña la función
 * 		List<List<String>> repartoAlumnos (List<String> lista, int numGrupos)
 * que devuelve una lista de listas, cada una de las cuales corresponde a un grupo.
 * Cada nombre de la lista de alumnos se asigna a uno de los grupos.
 */

import java.util.ArrayList;
import java.util.List;

public class Act_26 {
	public static void main(String[] args) {
		List<String> alumnos = new ArrayList<>();

		alumnos.add("Miguel Sánchez");
		alumnos.add("Isabel González");
		alumnos.add("Sara Palma");
		alumnos.add("Daniel Ruiz");
		alumnos.add("Francisco Rodríguez");
		alumnos.add("Antonio Ojeda");
		alumnos.add("María Vázquez");
		alumnos.add("Patricia Ramírez");
		alumnos.add("Jose Villanueva");
		alumnos.add("Marta Pérez");
		alumnos.add("Jaime Navarro");
		alumnos.add("Myriam Perea");
	}

	static List<List<String>> repartoAlumnos(List<String> lista, int numGrupos) {
		return null;
	}
}
