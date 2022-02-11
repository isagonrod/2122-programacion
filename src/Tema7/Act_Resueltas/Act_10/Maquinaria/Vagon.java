package Tema7.Act_Resueltas.Act_10.Maquinaria;

class Vagon {
    int numId;
    int cargaMax;
    int cargaActual;
    String mercancia;

    public Vagon(int numId, int cargaMax, int cargaActual, String mercancia) {
        this.numId = numId;
        this.cargaMax = cargaMax;
        this.cargaActual = cargaActual;
        this.mercancia = mercancia;
    }

    public String toString() {
        return "\n\t\tVagon: " + "numId=" + numId + ", cargaMax=" + cargaMax + ", cargaActual=" + cargaActual +
                ", mercancia='" + mercancia;
    }
}
