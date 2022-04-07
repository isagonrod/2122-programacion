package Tema11.Act_Ampliacion.Act_28y29;

import java.util.Comparator;

public class ComparaFamiliares implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		return ((Familiar)o2).edad() - ((Familiar)o1).edad();
	}
}
