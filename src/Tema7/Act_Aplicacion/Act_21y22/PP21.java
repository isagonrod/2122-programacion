package Tema7.Act_Aplicacion.Act_21y22;

import Utilidades.Teclado;

public class PP21 {
    public static void main (String[] args) {
        ConjuntoLista conjunto = new ConjuntoLista();
        ConjuntoLista conjunto2 = new ConjuntoLista();
        int opc;

        do {
            menu();
            opc = Teclado.leerOpcion(1, 11);
            switch (opc) {
                case 1 -> conjunto.insertar(Teclado.getNumber("Introduce un nuevo elemento: "));
                case 2 -> {
                    conjunto2 = new ConjuntoLista(Teclado.getIntegerArray("Introduce un nuevo elemento en la tabla 2: ", -1));
                    conjunto.insertar(conjunto2);
                }
                case 3 -> conjunto.eliminarElemento(Teclado.getNumber("¿Qué elemento quieres eliminar?"));
                case 4 -> {
                    conjunto2 = new ConjuntoLista(Teclado.getIntegerArray("¿Qué elementos quieres eliminar? ", -1));
                    conjunto.eliminarConjunto(conjunto2);
                }
                case 5 -> System.out.println("¿Existe el elemento? " + conjunto.pertenece(Teclado.getNumber("¿Qué elemento quieres comprobar?")));
                case 6 -> conjunto.muestra();
                case 7 -> System.out.println("¿Se incluye c1 en c2? " + ConjuntoLista.incluido(conjunto, conjunto2));
                case 8 -> ConjuntoLista.union(conjunto, conjunto2).muestra();
                case 9 -> ConjuntoLista.interseccion(conjunto, conjunto2).muestra();
                case 10 -> ConjuntoLista.diferencia(conjunto, conjunto2).muestra();
                case 11 -> System.out.println("¡Adiós!");
            }
        } while (opc != 11);
    }

    static void menu() {
        System.out.println("-- MENÚ DE OPCIONES --");
        System.out.println("1. Insertar nuevo elemento.");
        System.out.println("2. Insertar nuevo conjunto.");
        System.out.println("3. Eliminar elemento.");
        System.out.println("4. Eliminar conjunto.");
        System.out.println("5. ¿Pertenece?");
        System.out.println("6. Mostrar.");
        System.out.println("7. ¿Está incluido el primer conjunto en el segundo?");
        System.out.println("8. Unir dos conjuntos.");
        System.out.println("9. Intersección entre dos conjuntos.");
        System.out.println("10. Diferencia entre dos conjuntos.");
        System.out.println("11. Salir.");
    }
}
