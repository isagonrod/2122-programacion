package Tema8.Act_Resueltas.Act_1a3;

/* ACTIVIDAD 8.1
 * Diseñar la clase Hora, que representa un instante de tiempo compuesto por la hora (de 0 a 23) y los minutos.
 * Dispone de los métodos:
 *      - Hora(hora, minuto), que construye un objeto con los datos pasados como parámetros.
 *      - void inc(), que incrementa la hora en un minuto.
 *      - boolean setMinutos(valor), que asigna un valor, si es válido, a los minutos.
 *          Devuelve true o false según haya sido posible modificar los minutos o no.
 *      - boolean setHora(valor), que asigna un valor, si está comprendido entre 0 y 23, a la hora.
 *          Devuelve true o false según haya sido posible cambiar la hora o no.
 *      - String toString(), que devuelve un String con la representación de la hora.
 */

public class Hora {
    protected int hora, minuto;

    Hora (int hora, int minuto) {
        this.hora = 0;
        this.minuto = 0;
        if (!setHora(hora)) {
            System.out.println("La hora es incorrecta");
        }
        if (!setMinuto(minuto)) {
            System.out.println("Los minutos no son válidos");
        }
    }

    public void inc() {
        minuto++;
        if (minuto > 59) {
            minuto = 0;
            hora++;
            if (hora > 23) {
                hora = 0;
            }
        }
    }

    public boolean setMinuto(int minuto) {
        boolean correcto = false;
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
            correcto = true;
        }
        return correcto;
    }

    public boolean setHora(int hora) {
        boolean correcto = false;
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
            correcto = true;
        }
        return correcto;
    }

    @Override
    public String toString() {
        return hora + ":" + minuto;
    }
}
