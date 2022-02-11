package Tema7.Act_Resueltas.Act_06;

import java.util.Scanner;

public class PP6 {
    public static void main (String[] args) {
        Hora h = new Hora();

        byte valor = getNumber("Hora: ");
        h.setHora(valor);

        valor = getNumber("Minutos: ");
        h.setMinuto(valor);

        valor = getNumber("Segundos: ");
        h.setSegundo(valor);

        int numSeg = getNumber("¿Cuántos segundos quieres mostrar?");

        for (int i = 0; i <= numSeg; i++) {
            System.out.println(String.format("%02d", h.getHora()) + ":" + String.format("%02d", h.getMinuto())  + ":" + String.format("%02d", h.getSegundo()));
            h.incrementaSegundo();
        }
    }

    static byte getNumber (String message) {
        Scanner sc = new Scanner (System.in);
        System.out.println(message);
        return sc.nextByte();
    }
}
