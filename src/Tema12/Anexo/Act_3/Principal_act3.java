package Tema12.Anexo.Act_3;

/* ACTIVIDAD 3 DEL ANEXO
 * Se pretende implementar un sencillo programa en Java para gestionar la Liga de Fútbol.
 * Para ello se dispone de las interfaces IPartido e IEquipo, que son implementadas por las clases Partido y Equipo
 * respectivamente.
 * Cada partido de la liga se almacena en un objeto de tipo IPartido que contiene los nombres de los equipos (local y
 * visitante), los goles de cada uno y la jornada en la que se jugó.
 * Por otra parte, cada equipo se modela mediante un objeto de tipo IEquipo, que almacena la siguiente información:
 * nombre (nombre del equipo), puntos (puntos acumulados), partidosJugados (total de partidos jugados), golesFavor (total
 * de goles marcados), golesContra (total de goles encajados), partidosFuera (conjunto de IPartidos jugados como visitante)
 * y partidosCasa (conjunto de IPartidos jugados como local).
 * Respecto a los métodos, además de los observadores (métodos getter/setter y demás), tenemos los métodos
 * añadePartidoCasa(...) y añadePartidoFuera(...) que insertan un partido en los conjuntos partidosFuera y partidosCasa.
 * Sin embargo, estos dos métodos no modifican el resto de datos, es decir, que la información almacenada en los
 * conjuntos partidosFuera y partidosCasa no siempre es coherente con el resto de atributos.
 * Se pide:
 *  a) Implementar el comparador ComparadorPuntosYGoles de manera que podamos ordenar una colección de equipos (IEquipo)
 *      de forma descendente por puntos.
 *      En caso de que dos equipos tengan los mismos puntos, se ordena también de forma descendente según la diferencia
 *      entre los goles a favor y los goles en contra.
 *  b) Implementa el método recalculaValores(), teniendo en cuenta que cada partido ganado suma 3 puntos, cada partido
 *      empatado suma 1 punto y cada partido perdido no suma puntos.
 *      Se supone que todos los partidos almacenados en los conjuntos son correctos.
 */

public class Principal_act3 {
	public static void main(String[] args) {
		Equipo e1 = new Equipo();
		Equipo e2 = new Equipo();
		Equipo e3 = new Equipo();
		Equipo e4 = new Equipo();

		e1.setNombreEquipo("Real Betis Balompié");
		e2.setNombreEquipo("Sevilla F.C.");
		e3.setNombreEquipo("Cádiz C.F.");
		e4.setNombreEquipo("Granada C.F.");

		Partido partido1 = new Partido();
		partido1.setEquipoLocal(e3);
		partido1.setEquipoVisitante(e1);
		partido1.setnGolesLocal(1);
		partido1.setnGolesVisitante(2);
		partido1.setJornada(1);

		e1.addPartidoFuera(partido1);
		e3.addPartidoCasa(partido1);

		Partido partido2 = new Partido();
		partido2.setEquipoLocal(e2);
		partido2.setEquipoVisitante(e4);
		partido2.setnGolesLocal(3);
		partido2.setnGolesVisitante(0);
		partido2.setJornada(1);

		e2.addPartidoCasa(partido2);
		e4.addPartidoFuera(partido2);

		Partido partido3 = new Partido();
		partido3.setEquipoLocal(e1);
		partido3.setEquipoVisitante(e2);
		partido3.setnGolesLocal(3);
		partido3.setnGolesVisitante(0);
		partido3.setJornada(2);

		e1.addPartidoCasa(partido3);
		e2.addPartidoFuera(partido3);

		Partido partido4 = new Partido();
		partido4.setEquipoLocal(e3);
		partido4.setEquipoVisitante(e4);
		partido4.setnGolesLocal(0);
		partido4.setnGolesVisitante(0);
		partido4.setJornada(2);

		e3.addPartidoCasa(partido4);
		e4.addPartidoFuera(partido4);

		Partido partido5 = new Partido();
		partido5.setEquipoLocal(e1);
		partido5.setEquipoVisitante(e4);
		partido5.setnGolesLocal(4);
		partido5.setnGolesVisitante(1);
		partido5.setJornada(3);

		e1.addPartidoCasa(partido5);
		e4.addPartidoFuera(partido5);

		Partido partido6 = new Partido();
		partido6.setEquipoLocal(e2);
		partido6.setEquipoVisitante(e3);
		partido6.setnGolesLocal(3);
		partido6.setnGolesVisitante(3);
		partido6.setJornada(3);

		e2.addPartidoCasa(partido6);
		e3.addPartidoFuera(partido6);

		e1.recalculaValores();
		e2.recalculaValores();
		e3.recalculaValores();
		e4.recalculaValores();

		System.out.println("\n-- RESULTADOS DE LA LIGA --\n");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
	}
}
