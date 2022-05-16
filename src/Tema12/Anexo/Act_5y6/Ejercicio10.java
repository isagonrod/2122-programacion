package Tema12.Anexo.Act_5y6;

import Utilidades.Teclado;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio10 {
    private Set<String> cadenas;

    public Ejercicio10() {
        this.cadenas = new TreeSet<>();
    }

    public Set<String> getCadenas() {
        return this.cadenas;
    }

    public void setCadenas(Set<String> cadenas) {
        this.cadenas = cadenas;
    }

    public String toString() {
        return this.cadenas.toString();
    }

    @Override
    public boolean equals(Object o) {
        Ejercicio10 that = (Ejercicio10) o;
        return cadenas.equals(that.cadenas);
    }

    void addPalabra(Set<String> conjunto) {
        conjunto.add(Teclado.getString("Nueva palabra: "));
    }

    void mostrarSubconjunto(String palabra1, String palabra2) {
        Iterator<String> it = this.cadenas.iterator();
        while (it.hasNext()) {
            if (it.next().equals(palabra1)) {
                if (palabra1.length() < palabra2.length()) {
                    System.out.println(it.next());
                    it.next();
                }
                else {
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    void mayoresOigualesQue(Set<String> conjunto) {
        String palabra = Teclado.getString("Palabra: ");
        Iterator<String> it = conjunto.iterator();
        while (it.hasNext()) {
            if (palabra.length() <= it.next().length()) {
                System.out.println(it.next());
                it.next();
            } else {
                it.next();
            }
        }
    }

    void menoresQue(Set<String> conjunto) {
        String palabra = Teclado.getString("Palabra: ");
        Iterator<String> it = conjunto.iterator();
        while (it.hasNext()) {
            if (palabra.length() > it.next().length()) {
                System.out.println(it.next());
                it.next();
            } else {
                it.next();
            }
        }
    }
}
