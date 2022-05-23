package Tema12.Act_Clase.Practica_Examen;

import java.util.Comparator;

public class ComparaEdad implements Comparator<Persona> {
	@Override
	public int compare(Persona o1, Persona o2) {
		return o2.edad() - o1.edad();
	}
}
