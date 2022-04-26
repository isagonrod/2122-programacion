package Tema12.Act_Resueltas.Act_11;

import java.util.Comparator;

public class ComparaAntiguedad implements Comparator<Socio> {
	@Override
	public int compare(Socio o1, Socio o2) {
		return o2.antiguedad() - o1.antiguedad();
	}
}
