package Tema7.Act_Aplicacion.Act_14;

import Utilidades.Teclado;

public class PP14 {
    public static void main (String[] args) {
        Cambio cash = new Cambio(Double.valueOf(Teclado.getString("Introducir una cantidad: ")));
        cash.calcularCambio();
    }
}
