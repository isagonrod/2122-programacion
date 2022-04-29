package Tema12.Act_Ampliacion.Act_31;

import java.util.ArrayList;

public class Cola<T> extends ArrayList<T> {

    public Cola(){}

    public void encolar(T nuevo) {
        this.add(nuevo);
    }

    public T desencolar() {
        T elem = null;
        if (this.size() > 0) {
            elem = this.remove(0);
        }
        return elem;
    }

    public String toString() {
        return super.toString();
    }
}
