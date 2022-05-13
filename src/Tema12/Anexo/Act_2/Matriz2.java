package Tema12.Anexo.Act_2;

import Tema12.Anexo.Act_1.Entero;
import Tema12.Anexo.Act_1.ListaEntero;

import java.util.ArrayList;
import java.util.Collections;

public class Matriz2 {
    private ArrayList<Entero> matriz;
    private int fila;
    private int columna;

    public Matriz2(int nFilas, int nColumnas) {
        this.fila = nFilas;
        this.columna = nColumnas;
        this.matriz = new ArrayList<>();

//        for (int i = 0; i < nFilas; i++) {
//            this.m[i] = new ListaEntero();
//            for (int j = 0; j < nColumnas; j++) {
//                this.m[i].getLista().add(new Entero(0));
//            }
//        }
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                this.matriz.add(new Entero(0)); //TODO: Revisar porque no guarda bien los 0
            }
        }
    }

    public Matriz2(int nFilas, int nColumnas, int[][] matriz) {
        this.fila = nFilas;
        this.columna = nColumnas;
        this.matriz = new ArrayList<>(nFilas);

        // TODO: Hacer el constructor metiéndole la matriz de entrada
    }

    public ArrayList<Entero> getMatriz() {
        return matriz;
    }

    public void setMatriz(ArrayList<Entero> matriz) {
        this.matriz = matriz;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public void imprime(String cabecera) {
        System.out.println(cabecera);

        for(Entero lista : this.matriz) {
            System.out.println(lista);
        }
    }

    //public void set(int fila, int columna, Entero valor) {}

    //public Entero get(int fila, int columna) {}

    //public void suma(Matriz m1, Matriz m2) throws Exception {}

    public void espejo() {
        for (Entero e : this.matriz) {
            Collections.reverse(getMatriz()); //TODO: Revisar
        }
    }
}
