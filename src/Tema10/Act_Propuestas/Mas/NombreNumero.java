package Tema10.Act_Propuestas.Mas;

import java.util.Arrays;

public class NombreNumero implements Comparable<NombreNumero> {
    String nombre;
    int[] numero;

    public NombreNumero(String nombre, int[] numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

	@Override
	public String toString() {
		return this.nombre + ", " + Arrays.toString(this.numero);
	}

	@Override
	public int compareTo(NombreNumero o) {
		return this.nombre.compareTo(o.nombre);
	}
}
