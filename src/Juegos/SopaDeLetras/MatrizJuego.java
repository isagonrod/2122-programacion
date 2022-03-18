package Juegos.SopaDeLetras;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class MatrizJuego {
    private char[][] juego;

    public MatrizJuego () {
        this.juego = new char[15][15];
    }

    public char[][] getJuego() {
        return juego;
    }

    public void setJuego(char[][] juego) {
        this.juego = juego;
    }

    public String toString() {
        String cadena = "";

        for (int i = 0; i < this.juego.length; i++) {
            cadena += Arrays.toString(juego[i]) + "\n";
        }

        return cadena;
    }

    public void rellenarTablero(String contenido) {
        String[] palabras = contenido.split("\\n");
        int orientacion, x, y;

        for (int i = 0; i < palabras.length; i++) {
            do {
                //generar orientacion (1 horizontal, 2 vertical)
                orientacion = generarAleatorio(1, 20) < 10 ? 1 : 2;

                //generar posicion (coordenadas x,y)
                x = generarAleatorio(1, 15) - 1;
                y = generarAleatorio(1, 15) - 1;

                //colocar si es posible o repetir los random
            } while(!colocarPalabra(palabras[i], orientacion, x, y));
        }

        //rellenar huecos vacíos tras colocar palabras
        for (int i = 0; i < this.juego.length; i++) {
            for (int j = 0; j < this.juego[i].length; j++) {
                if (this.juego[i][j] == 0) {
                    this.juego[i][j] = generarAleatorio('a','z');
                }
            }
        }
    }
}

