package Tema12.Anexo.Act_9;

import Utilidades.Valores;

public class Carta {
    private String valor;
    private Palo palo;

    public Carta(String valor, String palo) {
        this.valor = valor;
        this.palo = Palo.valueOf(palo);
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}
