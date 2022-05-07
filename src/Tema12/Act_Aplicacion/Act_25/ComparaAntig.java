package Tema12.Act_Aplicacion.Act_25;

import java.util.Comparator;

public class ComparaAntig implements Comparator<SocioApodo> {
	@Override
	public int compare(SocioApodo o1, SocioApodo o2) {
		return o2.antigüedad() - o1.antigüedad();
	}
}
