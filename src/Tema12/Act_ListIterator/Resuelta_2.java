package Tema12.Act_ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Resuelta_2 {
    public static void main(String[] args) {
        List<Empleado> c2 = new ArrayList<>();

        Resuelta_1.insertarPersonas(c2);

        System.out.println("\n-- Lista Inicial --");
        ListIterator<Empleado> it = c2.listIterator();
        while (it.hasNext()) {
            System.out.print("Índice " + it.nextIndex() + ": ");
            System.out.println(it.next());
        }

        //Insertar al principio
        System.out.println("\n-- Inserta al principio --");
        Empleado eAux = new Persona("Luis", "González Martínez", 30);
        it = c2.listIterator();
        it.add(eAux);

        it = c2.listIterator();
        while (it.hasNext()) {
            System.out.print("Índice " + it.nextIndex() + ": ");
            System.out.println(it.next());
        }

        //Inserta en la posición 2 (tercera persona)
        System.out.println("\n-- Inserta en la posición 2 (tercera persona) --");
        eAux = new Persona("Teresa", "Gómez Gómez", 32);
        it = c2.listIterator(2);
        it.add(eAux);

        it = c2.listIterator();
        while (it.hasNext()) {
            System.out.print("Índice " + it.nextIndex() + ": ");
            System.out.println(it.next());
        }

        //Inserta al final
        System.out.println("\n-- Inserta al final --");
        eAux = new Persona("Esperanza", "Domínguez Luque", 21);
        it = c2.listIterator(c2.size());
        it.add(eAux);

        it = c2.listIterator();
        while (it.hasNext()) {
            System.out.print("Índice " + it.nextIndex() + ": ");
            System.out.println(it.next());
        }
    }
}
