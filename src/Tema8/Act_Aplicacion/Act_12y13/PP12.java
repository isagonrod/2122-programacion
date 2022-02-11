package Tema8.Act_Aplicacion.Act_12y13;

import Utilidades.Teclado;

public class PP12 {
    public static void main (String[] args) {
        CajaCarton caja1 = new CajaCarton(2,2,2);
        caja1.etiqueta = Teclado.getString("Introduce los datos de la etiqueta: ");
        System.out.println(caja1.toString());
    }

}
