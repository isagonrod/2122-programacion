package Tema12.Anexo.Act_3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Equipo implements IEquipo {
    private Set<IEquipo> equipo;

    public Equipo() {
        this.equipo = new LinkedHashSet<>();
    }

    public Set<IEquipo> getEquipo() {
        return equipo;
    }

    public void setEquipo(Set<IEquipo> equipo) {
        this.equipo = equipo;
    }

	@Override
	public String getNombreEquipo() {
		return null;
	}

	@Override
	public void setNombreEquipo(String nombreEquipo) {

	}

	@Override
	public int getPuntos() {
		return 0;
	}

	@Override
	public void setPuntos(int puntos) {

	}

	@Override
	public int getPartidosJugados() {
		return 0;
	}

	@Override
	public void setPartidosJugados(int partidosJugados) {

	}

	@Override
	public int getGolesFavor() {
		return 0;
	}

	@Override
	public void setGolesFavor(int golesFavor) {

	}

	@Override
	public int getGolesContra() {
		return 0;
	}

	@Override
	public void setGolesContra(int golesContra) {

	}

	@Override
	public Set<Partido> getPartidosFuera() {
		return null;
	}

	@Override
	public void setPartidosFuera(Set<Partido> partidosFuera) {

	}

	@Override
	public Set<Partido> getPartidosCasa() {
		return null;
	}

	@Override
	public void setPartidosCasa(Set<Partido> partidosCasa) {

	}

	public String toString() {
        return this.equipo.toString();
    }

	@Override
	public void addPartidoCasa(Partido nuevo) {

	}

	@Override
	public void addPartidoFuera(Partido nuevo) {

	}

    //recalculaValores()
}
