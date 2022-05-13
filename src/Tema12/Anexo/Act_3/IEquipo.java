package Tema12.Anexo.Act_3;

import java.util.Set;

public interface IEquipo extends Comparable<IEquipo> {
	public String getNombreEquipo();

	public void setNombreEquipo(String nombreEquipo);

	public int getPuntos();

	public void setPuntos(int puntos);

	public int getPartidosJugados();

	public void setPartidosJugados(int partidosJugados);

	public int getGolesFavor();

	public void setGolesFavor(int golesFavor);

	public int getGolesContra();

	public void setGolesContra(int golesContra);

	public Set<Partido> getPartidosFuera();

	public void setPartidosFuera(Set<Partido> partidosFuera);

	public Set<Partido> getPartidosCasa();

	public void setPartidosCasa(Set<Partido> partidosCasa);

	void addPartidoCasa(Partido nuevo);

	void addPartidoFuera(Partido nuevo);

	void recalculaValores();

	public String toString();
}