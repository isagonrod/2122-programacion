package Tema12.Act_Aplicacion.Act_18;

import java.util.ArrayList;

public class Pila<T> {
    ArrayList<T> pila;

    public Pila() {
        this.pila = new ArrayList<>();
    }

    public void apilar(T nuevo) {
        this.pila.add(nuevo);
    }

    public void desapilar() {
        this.pila.remove(this.pila.size() - 1);
    }

    public String toString() {
        return this.pila.toString();
    }
}
