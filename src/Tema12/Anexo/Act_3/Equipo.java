package Tema12.Anexo.Act_3;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Equipo implements IEquipo {
	private String nombreEquipo;
	private int puntos;
	private int partidosJugados;
	private int golesFavor;
	private int golesContra;
	private Set<Partido> partidosFuera;
	private Set<Partido> partidosCasa;

    public Equipo() {
		this.nombreEquipo = null;
		this.puntos = 0;
		this.partidosJugados = 0;
		this.golesFavor = 0;
		this.golesContra = 0;
		this.partidosFuera = new TreeSet<>();
		this.partidosCasa = new TreeSet<>();
    }

	@Override
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	@Override
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	@Override
	public int getPuntos() {
		return puntos;
	}

	@Override
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public int getPartidosJugados() {
		return partidosJugados;
	}

	@Override
	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}

	@Override
	public int getGolesFavor() {
		return golesFavor;
	}

	@Override
	public void setGolesFavor(int golesFavor) {
		this.golesFavor = golesFavor;
	}

	@Override
	public int getGolesContra() {
		return golesContra;
	}

	@Override
	public void setGolesContra(int golesContra) {
		this.golesContra = golesContra;
	}

	@Override
	public Set<Partido> getPartidosFuera() {
		return partidosFuera;
	}

	@Override
	public void setPartidosFuera(Set<Partido> partidosFuera) {
		this.partidosFuera = partidosFuera;
	}

	@Override
	public Set<Partido> getPartidosCasa() {
		return partidosCasa;
	}

	@Override
	public void setPartidosCasa(Set<Partido> partidosCasa) {
		this.partidosCasa = partidosCasa;
	}

	@Override
	public void addPartidoCasa(Partido nuevo) {
		this.partidosCasa.add(nuevo);
	}

	@Override
	public void addPartidoFuera(Partido nuevo) {
		this.partidosFuera.add(nuevo);
	}

	@Override
	public void recalculaValores() {
		for (IPartido partido : this.partidosFuera) {
			this.partidosJugados++;
			this.golesFavor += partido.getnGolesVisitante();
			this.golesContra += partido.getnGolesLocal();

			if (partido.getnGolesVisitante() > partido.getnGolesLocal()) {
				this.puntos += 3;
			} else if (partido.getnGolesVisitante() == partido.getnGolesLocal()) {
				this.puntos += 1;
			}
		}
		for (IPartido partido : this.partidosCasa) {
			this.partidosJugados++;
			this.golesFavor += partido.getnGolesLocal();
			this.golesContra += partido.getnGolesVisitante();

			if (partido.getnGolesLocal() > partido.getnGolesVisitante()) {
				this.puntos += 3;
			} else if (partido.getnGolesLocal() == partido.getnGolesVisitante()) {
				this.puntos += 1;
			}
		}
	}

	@Override
	public String toString() {
		return "Equipo{" +
				"nombreEquipo='" + nombreEquipo + '\'' +
				", puntos=" + puntos +
				", partidosJugados=" + partidosJugados +
				", golesFavor=" + golesFavor +
				", golesContra=" + golesContra +
				", partidosFuera=" + partidosFuera +
				", partidosCasa=" + partidosCasa +
				'}';
	}

	@Override
	public int compareTo(IEquipo o) {
		return o.getPuntos() - this.puntos;
	}
}
