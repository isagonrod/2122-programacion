package Tema12.Act_Ampliacion.Act_37;

/* ACTIVIDAD DE AMPLIACIÓN 12.37
 * Queremos gestionar la plantilla de un equipo de fútbol, en la que a cada jugador se le asigna un dorsal que no puede
 * estar repetido.
 * Para ello vamos a crear una estructura de tipo Map cuyas entradas corresponden a los jugadores, con el dorsal como
 * clave y un objeto de la clase Jugador como valor.
 * De cada jugador se guarda el DNI, el nombre, la posición en el campo -para simplificar, los jugadores pueden ser
 * porteros, defensas, centrocampistas y delanteros- y su estatura.
 * Define la clase Jugador y un enumerado para la posición en el campo, e implementa los siguientes métodos estáticos:
 *      - static void altaJugador(Map<Integer,Jugador> plantilla, Integer dorsal), que añade una entrada al mapa con el
 *          dorsal pasado como parámetro y el jugador creado dentro del método, introduciendo sus datos por consola.
 *      - static Jugador eliminarJugador(Map<Integer,Jugador> plantilla, Integer dorsal), que elimina la entrada
 *          correspondiente al jugador cuyo dorsal se pasa como parámetro. Dicho dorsal desaparece del mapa hasta que
 *          se asigne a otro jugador por medio de un alta. El método devuelve el jugador eliminado.
 *      - static void mostrar(Map<Integer,Jugador> plantilla), que muestra una lista de los dorsales con los nombres
 *          de los jugadores correspondientes.
 *      - static void mostrar(Map<Integer,Jugador> plantilla, String posicion), que muestra una lista de los jugadores
 *          que comparten una misma posicion. Por ejemplo, todos los defensas o todos los delanteros.
 *      - static boolean editarJugador(Map<Integer,Jugador> plantilla, Integer dorsal), que permite modificar los datos
 *          de un jugador, excepto su dorsal y su DNI. Devuelve true si el dorsal existe y false en caso contrario.
 */

import Utilidades.Teclado;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PP_Plantilla {
    public static void main(String[] args) {
        Map<Integer, Jugador> plantilla = new TreeMap<>();
        int opc;

        do {
            menu();
            opc = Teclado.leerOpcion(1, 6);
            switch (opc) {
                case 1 -> altaJugador(plantilla, Teclado.getNumber("Dorsal: "));
                case 2 -> eliminarJugador(plantilla, Teclado.getNumber("Dorsal: "));
                case 3 -> mostrar(plantilla);
                case 4 -> mostrar(plantilla, Teclado.getString("Posición a mostrar: "));
                case 5 -> editarJugador(plantilla, Teclado.getNumber("Dorsal del jugador a modificar: "));
                case 6 -> System.out.println("¡Adiós!");
            }
        } while (opc != 6);
    }

    static void menu() {
        System.out.println("-- MENÚ DE OPCIONES --");
        System.out.println("1. Alta jugador");
        System.out.println("2. Baja jugador");
        System.out.println("3. Mostrar plantilla");
        System.out.println("4. Mostrar jugadores según posición");
        System.out.println("5. Modificar jugador");
        System.out.println("6. Salir");
    }

    public static void altaJugador(Map<Integer,Jugador> plantilla, Integer dorsal) {
        plantilla.put(dorsal, new Jugador(Teclado.getString("DNI: "), Teclado.getString("Nombre: "),
                PosicionJugador.valueOf(Teclado.getString("Posición: ")), Teclado.getDouble("Estatura: ")));
    }

    public static Jugador eliminarJugador(Map<Integer,Jugador> plantilla, Integer dorsal) {
        Jugador eliminado = plantilla.remove(dorsal);
        return eliminado;
    }

    public static void mostrar(Map<Integer,Jugador> plantilla) {
        System.out.println("PLANTILLA COMPLETA:\n" + plantilla);
    }

    public static void mostrar(Map<Integer,Jugador> plantilla, String posicion) { // TODO: Corregir
        System.out.println("PLANTILLA POR LA POSICIÓN DE " + posicion.toUpperCase() +":\n");
        Set<Map.Entry<Integer, Jugador>> jugadores = plantilla.entrySet();
        for (Map.Entry<Integer, Jugador> jugador : jugadores) {
            if (jugador.getValue().getPosicion().equals(PosicionJugador.valueOf(posicion))) {
                System.out.println(jugador);
            }
        }
    }

    public static boolean editarJugador(Map<Integer,Jugador> plantilla, Integer dorsal) {
        boolean modificado = false;
        if (plantilla.containsKey(dorsal)) {
            Jugador j = plantilla.get(dorsal);
            j.setNombre(Teclado.getString("Nombre: "));
            j.setPosicion(PosicionJugador.valueOf(Teclado.getString("Posición: ")));
            j.setEstatura(Teclado.getDouble("Estatura: "));
            modificado = true;
        }
        return modificado;
    }

}
