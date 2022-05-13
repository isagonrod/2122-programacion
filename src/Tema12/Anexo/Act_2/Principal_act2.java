package Tema12.Anexo.Act_2;

/* ACTIVIDAD 2 DEL ANEXO
 * Otra posible implementación es que la Matriz esté compuesta por una Lista de Listas, es decir, el atributo m es una
 * interfaz List implementada mediante la clase ArrayList.
 * Por otra parte, los objetos almacenados en m son también objetos de tipo List.
 * Implementa un constructor y los métodos set y get para esta implementación de Matriz.
 */

import Tema12.Anexo.Act_1.Entero;

public class Principal_act2 {
    public static void main(String[] args) throws Exception {
        Matriz2 matriz1 = new Matriz2(2, 3);

        int[][] tabla = {{1, 2, 3},{4, 5, 6}};
        Matriz2 matriz2 = new Matriz2(2, 3, tabla);

        matriz1.imprime("\n-- MATRIZ 1 --");
        matriz2.imprime("\n-- MATRIZ 2 --");

        matriz1.set(0, 0, new Entero(69));
        matriz1.set(0, 1, new Entero(55));
        matriz1.set(1, 2, new Entero(88));
        matriz1.imprime("\n-- MATRIZ 1 (modificada) --");

        System.out.println("\nElemento de la matriz 2 buscado: " + matriz2.get(1, 1));

        matriz1.suma(matriz1, matriz2);
        matriz1.imprime("\n-- SUMA DE LAS DOS MATRICES --");

        matriz2.espejo();
        matriz2.imprime("\n-- ESPEJO DE LA MATRIZ 2 --");
    }
}
