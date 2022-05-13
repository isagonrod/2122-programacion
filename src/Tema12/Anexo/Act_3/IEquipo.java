package Tema12.Anexo.Act_3;

import java.util.Set;

public interface IEquipo {
	String nombreEquipo = null;
	int puntos = 0;
	int partidosJugados = 0;
	int golesFavor = 0;
	int golesContra = 0;
	Set<Partido> partidosFuera = null;
	Set<Partido> partidosCasa = null;

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

	public String toString();

	void addPartidoCasa(Partido nuevo);

	void addPartidoFuera(Partido nuevo);
}