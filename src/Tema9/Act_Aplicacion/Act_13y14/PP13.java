package Tema9.Act_Aplicacion.Act_13y14;

public class PP13 {
    public static void main (String[] args) {
        ConjuntoFutbolistas tabla = new ConjuntoFutbolistas();

        tabla.insertar(new Futbolista("039082349", "Puto", 69, 999999));
        tabla.insertar(new Futbolista("039083838", "Fracasao", 20, 0));
        tabla.insertar(new Futbolista("928920111", "Capullo", 50, 154));
        tabla.insertar(new Futbolista("119298282", "Subnormal", 31, 200));
        tabla.insertar(new Futbolista("229838120", "Ana", 90, -1));

        tabla.muestra();

        tabla.ordenarNombre();

        tabla.muestra();

        tabla.ordenarEdad();

        tabla.muestra();

        tabla.ordenarDni();

        tabla.muestra();
    }
}
