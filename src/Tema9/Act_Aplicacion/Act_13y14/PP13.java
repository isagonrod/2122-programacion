package Tema9.Act_Aplicacion.Act_13y14;

public class PP13 {
    public static void main (String[] args) {
        ConjuntoFutbolistas tabla = new ConjuntoFutbolistas();

        tabla.insertar(new Futbolista("11111111A", "León Gómez", 23, 15));
        tabla.insertar(new Futbolista("22222222B", "Fran Pérez", 20, 0));
        tabla.insertar(new Futbolista("33333333C", "Fernando Porres", 19, 11));
        tabla.insertar(new Futbolista("44444444D", "Pablo Ruiz", 21, 20));
        tabla.insertar(new Futbolista("55555555E", "Abelino Gil", 20, 1));

        tabla.ordenarDni();
        tabla.ordenarNombre();
        tabla.ordenarEdad();
    }
}
