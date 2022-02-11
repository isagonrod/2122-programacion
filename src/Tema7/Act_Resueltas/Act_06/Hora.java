package Tema7.Act_Resueltas.Act_06;

/* Escribir un programa que lea por teclado una hora cualquiera y un número n que representa una cantidad en segundos.
 * El programa mostrará la hora introducida y las n siguientes, que se diferencian en un segundo.
 * Para ello hemos de diseñar previamente la clase Hora que dispone de los atributos hora, minuto y segundo.
 * Los valores de los atributos se controlarán mediante métodos get/set.
 */

public class Hora {
    private byte hora;
    private byte minuto;
    private byte segundo;

    public byte getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (0 <= hora && hora <= 23) {
            this.hora = (byte) hora;
        } else {
            this.hora = 0;
        }
    }

    public byte getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (0 <= minuto && minuto <= 59) {
            this.minuto = (byte) minuto;
        } else {
            this.minuto = 0;
        }
    }

    public byte getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (0 <= segundo && segundo <= 59) {
            this.segundo = (byte) segundo;
        } else {
            this.segundo = 0;
        }
    }

    public void incrementaSegundo() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }
}
