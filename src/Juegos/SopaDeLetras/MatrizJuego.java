package Juegos.SopaDeLetras;

public class MatrizJuego {
    char[][] juego;

    public MatrizJuego () {
        this.juego = new char[15][15];
    }

    String elegirTematica() {
        String tematica = "";
        switch (tematica) {
            case "animales" -> tematica = "";
            case "planetas" -> tematica = "";
            case "personajes" -> tematica = "";
            case "juegos" -> tematica = "";
            case "materiales" -> tematica = "";
        }
        return tematica;
    }
}
