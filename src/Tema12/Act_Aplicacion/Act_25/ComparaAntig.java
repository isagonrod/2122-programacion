package Tema12.Act_Aplicacion.Act_25;

import java.util.Comparator;

public class ComparaAntig implements Comparator<Socio_Apodo> {
	@Override
	public int compare(Socio_Apodo o1, Socio_Apodo o2) {
		return o2.antigüedad() - o1.antigüedad();
	}
}
