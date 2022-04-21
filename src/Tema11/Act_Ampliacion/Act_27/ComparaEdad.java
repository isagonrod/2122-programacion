package Tema11.Act_Ampliacion.Act_27;

import java.util.Comparator;

public class ComparaEdad implements Comparator<Deportista> {
	@Override
	public int compare(Deportista o1, Deportista o2) {
		int resultado;
		resultado = o1.edad() - o2.edad();
		if (resultado == 0) {
			resultado = o1.getNombre().compareToIgnoreCase(o2.getNombre());
		}
		return resultado;
	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		int resultado;
//		resultado = ((Deportista)o1).edad() - ((Deportista)o2).edad();
//		if (resultado == 0) {
//			resultado = ((Deportista)o1).getNombre().compareTo(((Deportista)o2).getNombre());
//		}
//		return resultado;
//	}
}
