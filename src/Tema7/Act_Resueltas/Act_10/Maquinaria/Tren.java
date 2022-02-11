package Tema7.Act_Resueltas.Act_10.Maquinaria;

import Tema7.Act_Resueltas.Act_10.Personal.Maquinista;

import java.util.Arrays;

public class Tren {
    Locomotora locomotora;
    Vagon[] vagones;
    Maquinista responsable;
    private int numVagones;

    public Tren(Locomotora locomotora, Maquinista responsable) {
        this.locomotora = locomotora;
        this.responsable = responsable;
        vagones = new Vagon[5];
        numVagones = 0;
    }

    public void enganchaVagon(int cargaMax, int cargaActual, String mercancia) {
        if (numVagones >= 5) {
            System.out.println("El tren no admite más vagones");
        } else {
            Vagon v = new Vagon(numVagones, cargaMax, cargaActual, mercancia);
            vagones[numVagones] = v;
            numVagones++;
        }
    }

    public String toString() {
        return "Tren: " +
                "\n\tlocomotora=" + locomotora +
                "\n\tresponsable=" + responsable +
                "\n\tnumVagones=" + numVagones +
                "\n\tvagones=" + Arrays.toString(vagones);
    }
}
