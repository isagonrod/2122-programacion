package Tema8.Act_Resueltas.Act_1a3;

import Utilidades.Teclado;

public class PP1 {
    public static void main (String[] args) {
        Hora r = new Hora(11,30);
        System.out.println(r);

        for (int i = 0; i <= 61; i++) {
            r.inc();
        }
        System.out.println(r);

        int hora = Teclado.getNumber("Escriba una hora: ");
        boolean cambio = r.setHora(hora);

        if (cambio) {
            System.out.println(r);
        } else {
            System.out.println("La hora no se pudo cambiar");
        }

        HoraExacta horaExacta = new HoraExacta(11,15,23);
        System.out.println(horaExacta);

        for (int i = 1; i <= 61; i++) {
            horaExacta.inc();
        }
        System.out.println(horaExacta);
        int segundos = Teclado.getNumber("Escriba los segundos: ");
        if (horaExacta.setSegundo(segundos)) {
            System.out.println(horaExacta);
        } else {
            System.out.println("No es posible cambiar los segundos");
        }

        HoraExacta a = new HoraExacta(1,2,3);
        HoraExacta b = new HoraExacta(1,2,3);
        HoraExacta c = new HoraExacta(10,20,30);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}
