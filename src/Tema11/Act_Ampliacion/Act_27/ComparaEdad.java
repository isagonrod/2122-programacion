package Tema11.Act_Ampliacion.Act_27;

import java.util.Comparator;

public class ComparaEdad implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int resultado;
		resultado = ((Deportista)o1).edad() - ((Deportista)o2).edad();
		if (resultado == 0) {
			resultado = ((Deportista)o1).getNombre().compareTo(((Deportista)o2).getNombre());
		}
		return resultado;
	}
}
