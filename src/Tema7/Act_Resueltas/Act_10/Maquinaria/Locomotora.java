package Tema7.Act_Resueltas.Act_10.Maquinaria;

import Tema7.Act_Resueltas.Act_10.Personal.Mecanico;

public class Locomotora {
    String matricula;
    int potencia;
    int añoFabricacion;
    Mecanico mec;

    public Locomotora(String matricula, int potencia, int añoFabricacion, Mecanico mec) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.añoFabricacion = añoFabricacion;
        this.mec = mec;
    }

    public String toString() {
        return "Locomotora: " + "matricula='" + matricula + ", potencia=" + potencia +
                ", añoFabricacion=" + añoFabricacion + ", mec=" + mec;
    }
}
