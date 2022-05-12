package Tema12.Act_ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Resuelta_3 {
    public static void main(String[] args) {
        List<Empleado> c3 = new ArrayList<>();

        Resuelta_1.insertarPersonas(c3);

        //Recorrido hacia delante
        System.out.println("\n-- Lista inicial --");
        ListIterator<Empleado> it = c3.listIterator();
        while(it.hasNext()) {
            System.out.print("Índice " + it.nextIndex() + ": ");
            System.out.println(it.next());
        }

        //Modifica el elemento en la posición 2 (tercera persona)
        System.out.println("\n-- Inserta en la posición 2 (tercera persona) --");
        Empleado eAux = new Persona("Teresa", "Gómez Gómez", 32);
        it = c3.listIterator(2);
        if (it.hasNext()) {
            it.next();
            it.set(eAux);
        }
        it = c3.listIterator();
        while (it.hasNext()) {
            System.out.print("Índice " + it.nextIndex() + ": ");
            System.out.println(it.next());
        }

        //Modifica el elemento en la posición 3 (cuarta persona)
        System.out.println("\n-- Inserta en la posición 3 (cuarta persona) --");
        eAux = new Persona("Teresa", "Gómez Gómez", 32);
        it = c3.listIterator(3);

        if (it.hasNext()) {
            it.next();
            it.set(eAux);
        }

        it = c3.listIterator();
        while (it.hasNext()) {
            System.out.print("Índice " + it.nextIndex() + ": ");
            System.out.println(it.next());
        }
    }
}
