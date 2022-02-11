package Tema7.Act_Aplicacion.Act_13;

/* En el momento de decorar una casa, una habitación o cualquier objeto, se plantea el problema de elegir la paleta de
 * colores que vamos a utilizar en nuestra decoración.
 * Existe una solución, algo atrevida, que consiste en utilizar colores al azar.
 *
 * Diseña la clase Colores, que alberga por defecto una serie de colores (mediante una cadena), aunque es posible
 * añadir tantos como necesitemos.
 * La clase tendrá un método que devuelve una tabla con los n colores que necesitemos elegidos al azar sin repeticiones.
 */

import Utilidades.Valores;
import Utilidades.Vectores;
import java.util.Arrays;

public class Colores {
    //0, 1, 2, 3, 4, 5, 6, 7, 8
    String[] colores = {"azul", "rojo", "amarillo", "verde", "morado", "naranja", "blanco", "negro", "marrón"};

    public String toString() {
        return "Colores: " + Arrays.toString(colores);
    }

    /** Método que devuelve un nuevo array con una composición aleatoria de colores.
     *
     * @param numColor - cantidad de colores a sacar
     * @return String[] - array con los colores elegidos
     */
    String[] elegirColores(int numColor) {
        String[] coloresElegidos = new String[numColor];
        Vectores.rellenarVector(coloresElegidos, 'a', 'z', 4); //temporal para que no explote la búsqueda
        String color;
        boolean colorNoRepetido;

        for (int i = 0; i < numColor; i++) {
            colorNoRepetido = false;

            while (!colorNoRepetido){
                color = this.colores[Valores.generarAleatorio(0, this.colores.length - 1)];
                if (Vectores.buscarEnVector(coloresElegidos, color) < 0) {
                    coloresElegidos[i] = color;
                    colorNoRepetido = true;
                }
            }
        }
        return coloresElegidos;
    }

    /** Método que busca si existe el color, y si no existe lo inserta en colores[].
     *
     * @param color - cadena de texto del color a insertar
     */
    void insertarColor(String color) {
        if (Vectores.buscarEnVector(this.colores, color) < 0) {
            this.colores = Arrays.copyOf(colores, this.colores.length + 1);
            this.colores[colores.length - 1] = color;
        }
    }
}
