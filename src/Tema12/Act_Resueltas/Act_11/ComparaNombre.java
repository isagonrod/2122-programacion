package Tema12.Act_Resueltas.Act_11;

import java.util.Comparator;

public class ComparaNombre implements Comparator<Socio> {
	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.nombre.compareToIgnoreCase(o2.nombre);
	}
}
