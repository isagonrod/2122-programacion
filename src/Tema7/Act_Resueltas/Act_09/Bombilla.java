package Tema7.Act_Resueltas.Act_09;

/* Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda encender o apagar individualmente.
 * Para ello, hacer una clase Bombilla con una variable privada que indique si está encendida o apagada, así como
 * un método que nos diga el estado de una bombilla concreta.
 * Además, queremos poner un interruptor general, de forma que si este se apaga, todas las bombillas quedan apagadas.
 * Cuando el interruptor general se activa, las bombillas vuelven a estar encendidas o apagadas, según estuvieran antes.
 * Cada bombilla se enciende y se apaga individualmente, per solo responde que está encendida si su interruptor
 * particular está activado y además hay luz general.
 */

public class Bombilla {
    public static boolean interruptorGeneral = true;
    private boolean interruptor;

    public Bombilla() {
        interruptor = false;
    }

    public void enciende() {
        interruptor = true;
    }

    public void apaga() {
        interruptor = false;
    }

    public boolean estado() {
        return interruptorGeneral && interruptor;
    }

    public String muestraEstado() {
        return estado() ? "Encendida" : "Apagada";
    }
}
