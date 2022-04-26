package Tema12.Act_Resueltas.Act_02;

import java.util.Arrays;
import java.util.Comparator;

public class Contenedor <T> {
    private T[] objetos;

    public Contenedor(T[] objetos) {
        this.objetos = objetos;
    }

    public void insertarAlFinal(T nuevo) {
        this.objetos = Arrays.copyOf(this.objetos, this.objetos.length + 1);
        this.objetos[this.objetos.length - 1] = nuevo;
    }

    void insertarAlPrincipio(T nuevo) {
        this.objetos = Arrays.copyOf(this.objetos, this.objetos.length + 1);
        System.arraycopy(this.objetos, 0, this.objetos, 1, this.objetos.length - 1);
        this.objetos[0] = nuevo;
    }

    T extraerDelFinal() {
        T res = null;
        if (this.objetos.length > 0) {
            res = this.objetos[this.objetos.length - 1];
            this.objetos = Arrays.copyOf(this.objetos, this.objetos.length - 1);
        }
        return res;
    }

    T extraerDelPrincipio() {
        T res = null;
        if (this.objetos.length > 0) {
            res = this.objetos[0];
            this.objetos = Arrays.copyOfRange(this.objetos, 1, this.objetos.length);
        }
        return res;
    }

    public void ordenar() {
        Arrays.sort(this.objetos);
    }

    public String toString() {
        return Arrays.deepToString(this.objetos);
    }

    public void ordenar(Comparator<T> c) {
        Arrays.sort(this.objetos, c);
    }

    public T get (int indice) {
        return this.objetos[indice];
    }
}
