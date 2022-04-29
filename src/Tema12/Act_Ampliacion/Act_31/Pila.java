package Tema12.Act_Ampliacion.Act_31;

import java.util.ArrayList;

public class Pila<T> extends ArrayList<T> {

    public Pila() {}

    public void apilar(T nuevo) {
        this.add(nuevo);
    }

    public T desapilar() {
        T elem = null;
        if (this.size() > 0) {
            elem = this.remove(this.size() - 1);
        }
        return elem;
    }

    public String toString() {
        return super.toString();
    }
}
