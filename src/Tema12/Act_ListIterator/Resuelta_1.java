package Tema12.Act_ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Resuelta_1 {
    public static void main(String[] args) {
        List<Empleado> c1 = new ArrayList<>();

        insertarPersonas(c1);

        //Recorrido hacia delante
        System.out.println("\n-- Recorrido hacia delante --");
        ListIterator<Empleado> it = c1.listIterator();
        while (it.hasNext()) {
            System.out.print("Índice " + it.nextIndex() + ": ");
            System.out.println(it.next());
        }

        //Recorrido hacia atrás
        System.out.println("\n-- Recorrido hacia atrás --");
        it = c1.listIterator(c1.size());
        while (it.hasPrevious()) {
            System.out.print("Índice " + it.previousIndex() + ": ");
            System.out.println(it.previous());
        }

        //Recorrido hacia delante desde la posición 2
        System.out.println("\n-- Recorrido hacia delante desde la posición 2 --");
        it = c1.listIterator(2);
        while (it.hasNext()) {
            System.out.print("Índice " + it.nextIndex() + ": ");
            System.out.println(it.next());
        }

        //Recorrido hacia atrás desde la posición 2
        System.out.println("\n-- Recorrido hacia atrás desde la posición 2 --");
        it = c1.listIterator(2);
        while (it.hasPrevious()) {
            System.out.print("Índice " + it.previousIndex() + ": ");
            System.out.println(it.previous());
        }
    }

    static void insertarPersonas(List<Empleado> c1) {
        Empleado e1 = new Persona("Pepe", "López Pérez", 25);
        Empleado e2 = new Persona("Lola", "López Aguilar", 23);
        Empleado e3 = new Persona("Pepe", "López Pérez", 21);
        Empleado e4 = new Persona("Antonio", "López Pérez", 25);
        Empleado e5 = new Persona("Alicia", "Sánchez Olmo", 21);

        c1.add(e1);
        c1.add(e2);
        c1.add(e3);
        c1.add(e4);
        c1.add(e5);
    }
}
