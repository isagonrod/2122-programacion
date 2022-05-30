package Tema13.Act_Resueltas.Act_3;

import Tema13.Act_Resueltas.Act_1.Cliente;

import java.util.Comparator;

public class Principal_13_3 {
    public static void main(String[] args) {
        Cliente[] grupoClientes = {
                new Cliente("111", "Marta", "12/02/2000"),
                new Cliente("115", "Jorge", "16/03/1999"),
                new Cliente("112", "Carlos", "01/10/2002"),
                new Cliente("211", "Ana", "07/12/2001"),
                new Cliente("666", "Isa", "10/12/1985")
        };
        System.out.println(maximo(grupoClientes, (a,b) -> a.edad() - b.edad()));
    }

    static <T> T maximo(T[] tabla, Comparator<T> c) {
        T max = tabla[0];
        for (T e : tabla) {
            if (c.compare(e, max) > 0) {
                max = e;
            }
        }
        return max;
    }
}
