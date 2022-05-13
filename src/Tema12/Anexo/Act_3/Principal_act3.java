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
 *  b) Implementa el método recalculaValores(), teniendo en cuenta que cad partido ganado suma 3 puntos, cada partido
 *      empatado suma 1 punto y cada partido perdido no suma puntos.
 *      Se supone que todos los partidos almacenados en los conjuntos son correctos.
 */

public class Principal_act3 {
	public static void main(String[] args) {

	}
}
