package Tema7.Act_Aplicacion.Act_13;

import java.util.Arrays;

public class PP13 {
    public static void main (String[] args) {
        Colores casa = new Colores();
        String[] habitaciones = new String[3];
        habitaciones = casa.elegirColores(habitaciones.length);
        System.out.println("Colores elegidos: " + Arrays.toString(habitaciones));
        casa.insertarColor("chocolate");
        System.out.println(casa);
    }
}
