package Tema11.Act_Ampliacion.Act_28;

import java.util.Comparator;

public class ComparaAntigüedad implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		return ((Socio)o2).antigüedad() - ((Socio)o1).antigüedad();
	}
}
