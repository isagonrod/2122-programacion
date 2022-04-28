package Tema12.Act_Aplicacion.Act_20;

import Tema12.Act_Aplicacion.Act_17.Cola;

public class Supercola<T> {
    Cola cola1;
    Cola cola2;

    public Supercola() {
        this.cola1 = new Cola<>();
        this.cola2 = new Cola<>();
    }

    public void encolar(Object nuevo, Integer objetivo) {
        if (objetivo == 1) {
            cola1.encolar(nuevo);
        }
        else if (objetivo == 2) {
            cola2.encolar(nuevo);
        }
    }

    public Object desencolar(Integer objetivo) {
        Object resultado = null;

        if (objetivo == 1) {
            resultado = cola1.desencolar();
            if (resultado == null) {
                resultado = cola2.desencolar();
            }
        }
        else if (objetivo == 2) {
            resultado = cola2.desencolar();
            if (resultado == null) {
                resultado = cola1.desencolar();
            }
        }

        return resultado;
    }

    public String toString() {
        return "\nCola 1: " + cola1 +
                "\nCola 2: " + cola2;
    }
}
