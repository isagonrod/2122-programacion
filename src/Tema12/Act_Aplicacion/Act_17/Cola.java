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

    public void desencolar() {
        this.cola.remove(0);
    }

    public String toString() {
        return this.cola.toString();
    }
}
