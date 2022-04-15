package Tema11.Práctica;

public class NumAlumCalif {
	private int nSuspensos;
	private int nAprobados;
	private int nNotables;
	private int nSobresalientes;

	public NumAlumCalif() {
		this.nSuspensos = 0;
		this.nAprobados = 0;
		this.nNotables = 0;
		this.nSobresalientes = 0;
	}

	public int getnSuspensos() {
		return nSuspensos;
	}

	public void setnSuspensos(int nSuspensos) {
		this.nSuspensos = nSuspensos;
	}

	public int getnAprobados() {
		return nAprobados;
	}

	public void setnAprobados(int nAprobados) {
		this.nAprobados = nAprobados;
	}

	public int getnNotables() {
		return nNotables;
	}

	public void setnNotables(int nNotables) {
		this.nNotables = nNotables;
	}

	public int getnSobresalientes() {
		return nSobresalientes;
	}

	public void setnSobresalientes(int nSobresalientes) {
		this.nSobresalientes = nSobresalientes;
	}

	public void addSuspenso() {
		this.nSuspensos++;
	}

	public void addAprobado() {
		this.nAprobados++;
	}

	public void addNotable() {
		this.nNotables++;
	}

	public void addSobresaliente() {
		this.nSobresalientes++;
	}

	@Override
	public String toString() {
		return "Suspensos: " + nSuspensos +
				"\nAprobados: " + nAprobados +
				"\nNotables: " + nNotables +
				"\nSobresalientes: " + nSobresalientes;
	}
}
