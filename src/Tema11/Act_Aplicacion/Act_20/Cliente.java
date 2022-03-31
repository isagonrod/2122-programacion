package Tema11.Act_Aplicacion.Act_20;

public class Cliente implements Comparable {
	private String id;
	private String nombre;
	private String telefono;

	public Cliente(String id, String nombre, String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String toString() {
		return "ID: " + this.id + " | Nombre: " + this.nombre + " | Teléfono: " + this.telefono + "\n";
	}

	@Override
	public int compareTo(Object o) {
		return this.id.compareToIgnoreCase(((Cliente)o).id);
	}
}
