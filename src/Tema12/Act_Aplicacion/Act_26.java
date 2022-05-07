package Tema12.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 12.26
 * Un centro educativo necesita distribuir de forma aleatoria a los alumnos de un curso entre los grupos disponibles
 * para ese curso. Diseña la función
 * 		List<List<String>> repartoAlumnos (List<String> lista, int numGrupos)
 * que devuelve una lista de listas, cada una de las cuales corresponde a un grupo.
 * Cada nombre de la lista de alumnos se asigna a uno de los grupos.
 */

import Utilidades.Valores;

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

		System.out.println(repartoAlumnos(alumnos, 3));
	}

	static List<List<String>> repartoAlumnos(List<String> lista, int numGrupos) {
		List<List<String>> cursos = new ArrayList<>();

		for (int i = 0; i < numGrupos; i++) { //inicializamos los grupos
			cursos.add(new ArrayList<>());
		}

		for (String alumno : lista) { //decidimos a qué grupo va cada alumno
			int numLista;
			boolean seguir = true;
			List<String> grupoElegido;

			do {
				numLista = Valores.generarAleatorio(0, numGrupos); //decidimos a qué grupo ir
				grupoElegido = cursos.get(numLista);
				if (grupoElegido.size() < lista.size() / numGrupos) { //intentamos equilibrar el tamaño de los grupos
					grupoElegido.add(alumno);
					seguir = false;
				}
			} while (seguir);
		}

		return cursos;
	}
}
