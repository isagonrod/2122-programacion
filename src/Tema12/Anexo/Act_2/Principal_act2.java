package Tema12.Anexo.Act_2;

/* ACTIVIDAD 2 DEL ANEXO
 * Otra posible implementación es que la Matriz esté compuesta por una Lista de Listas, es decir, el atributo m es una
 * interfaz List implementada mediante la clase ArrayList.
 * Por otra parte, los objetos almacenados en m son también objetos de tipo List.
 * Implementa un constructor y los métodos set y get para esta implementación de Matriz.
 */

public class Principal_act2 {
    public static void main(String[] args) {
        Matriz2 m1 = new Matriz2(2, 3);
        m1.imprime("\n-- Matriz original --");
    }
}
