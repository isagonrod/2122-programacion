package Tema12.Act_Aplicacion.Act_17;

import java.util.ArrayList;

public class Cola<T> {
    ArrayList<T> cola;

    public Cola(){
        this.cola = new ArrayList<>();
    }

    public void encolar(T nuevo) {
        this.cola.add(nuevo);
    }

    public T desencolar() {
        T elem = null;
        if (cola.size() > 0) {
            elem = this.cola.remove(0);
        }
        return elem;
    }

    public String toString() {
        return this.cola.toString();
    }
}
