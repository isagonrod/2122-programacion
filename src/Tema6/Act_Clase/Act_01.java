package Tema6.Act_Clase;

import java.util.Scanner;

public class Act_01 {
    /* Validar una hora leída con el formato hh:mm:ss */


    public static void main (String[] args) {
        String cadenaHora = getString("Introduce hora con el formato \"hh:mm:ss\"");
        
        if (validarHora(cadenaHora)) {
            System.out.println("La hora introducida es correcta.");
        } else {
            System.out.println("La hora introducida es incorrecta.");
        }
    }

    static String getString (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
    
    static boolean validarHora (String cadenaHora) {
        String[] horaSeparada = cadenaHora.split(":");
        int horas = Integer.parseInt(horaSeparada[0]), minutos = Integer.parseInt(horaSeparada[1]), segundos = Integer.parseInt(horaSeparada[2]);
        
        return (horaSeparada[0].length() == 2 && horas >= 0 && horas <= 23)
                || (horaSeparada[1].length() == 2 && minutos >= 0 && minutos <= 59)
                || (horaSeparada[2].length() == 2 && segundos >= 0 && segundos <= 59);
    }
}
