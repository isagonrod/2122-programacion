package Tema11.Práctica;

public class Asignatura implements Comparable {
	private int codigo;
	private String nombre;

	public Asignatura(int cod, String nombre) {
		this.codigo = cod;
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int compareTo(Object o) {
		return this.nombre.compareToIgnoreCase(((Asignatura)o).nombre);
	}
}
