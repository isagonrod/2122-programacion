package Tema8.Act_Resueltas.Act_1a3;

/* ACTIVIDAD 8.2
 * A partir de la clase Hora implementar la clase HoraExacta, que incluye en la hora los segundos.
 * Además de los métodos heredados de Hora, dispondrá de:
 *      - HoraExacta(hora, minuto, segundo), que construye un objeto con los datos pasados como parámetros.
 *      - setSegundo(valor), que asigna, si está comprendido entre 0 y 59, el valor indicado a los segundos.
 *      - inc(), que incrementa la hora en un segundo.
 */
/* ACTIVIDAD 8.3
 * Añadir a la clase HoraExacta un método que compare si dos horas (la invocante y otra pasada como parámetro
 * de entrada al método) son iguales o distintas.
 */

public class HoraExacta extends Hora {
    protected int segundo;

    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        if (!setSegundo(segundo)) {
            System.out.println("Segundos incorrectos");
        }
    }

    public boolean setSegundo(int segundo) {
        boolean correcto = false;
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
            correcto = true;
        }
        return correcto;
    }

    @Override
    public void inc() {
        segundo++;
        if (segundo > 59) {
            segundo = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += ":" + segundo;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        HoraExacta otroReloj = (HoraExacta) o;
        boolean iguales;
        if (this.hora == otroReloj.hora && this.minuto == otroReloj.minuto && this.segundo == otroReloj.segundo) {
            iguales = true;
        } else {
            iguales = false;
        }
        return iguales;
    }
}
