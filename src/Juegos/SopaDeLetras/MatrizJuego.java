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
            for (int j = 0; j < this.juego[i].length; j++) {
                cadena += this.juego[i][j] + "\s\s";
            }
            cadena += "\n";
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

    boolean colocarPalabra(String palabra, int orientacion, int x, int y) {
        int tamaño = palabra.length(), i, huecos = 0;

        if (orientacion == 1 && x + tamaño < juego[0].length) { //horizontal
            for (i = x; i < x + tamaño; i++) {
                if (juego[y][i] == 0 || juego[y][i] == palabra.charAt(i - x)) {
                    huecos++;
                }
            }
        }
        else if (orientacion == 2 && y + tamaño < juego.length) { //vertical
            for (i = y; i < y + tamaño; i++) {
                if (juego[i][x] == 0 || juego[i][x] == palabra.charAt(i - y)) {
                    huecos++;
                }
            }
        }

        //solo asignamos los huecos cuando sabemos que cabe bien la palabra
        if (huecos == tamaño && orientacion == 1) { //horizontal
            for (i = x; i < x + tamaño; i++) {
                juego[y][i] = palabra.charAt(i - x);
            }
        }
        else if (huecos == tamaño && orientacion == 2) { //vertical
            for (i = y; i < y + tamaño; i++) {
                juego[i][x] = palabra.charAt(i - y);
            }
        }

        return huecos == tamaño;
    }

    public void guardarEnFichero() {
        BufferedWriter out = null;

        try {
            out = new BufferedWriter(new FileWriter("src/Juegos/SopaDeLetras/tablero.txt"));
            out.write(this.toString());
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (out != null) {
                try {
                    out.close();
                }
                catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }

    /** Método para generar un número entero aleatorio dado un mínimo y un máximo.
     *
     * @param valorMin - valor mínimo que puede tomar el aleatorio
     * @param valorMax - valor máximo que puede tomar el aleatorio
     * @return int - el entero generado
     */
    public static int generarAleatorio(int valorMin, int valorMax) {
        return (int)(Math.random() * (valorMax - valorMin) + valorMin);
    }

    /** Método para generar un carácter aleatorio dando un mínimo y un máximo.<br>
     * Usar mínimo=97 y máximo=122 para que se generen letras minúsculas.
     *
     * @param valorMin - valor mínimo que puede tomar el aleatorio
     * @param valorMax - valor máximo que puede tomar el aleatorio
     * @return char - el carácter generado
     */
    public static char generarAleatorio(char valorMin, char valorMax) {
        return (char)(Math.random() * (valorMax - valorMin) + valorMin);
    }
}

