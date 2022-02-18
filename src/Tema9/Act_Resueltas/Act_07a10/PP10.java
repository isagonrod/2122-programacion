package Tema9.Act_Resueltas.Act_07a10;

import java.util.Arrays;

public class PP10 {
    public static void main (String[] args) {
        Socio[] lista = {
                new Socio(1,"Pepe Pérez","01-01-2021"),
                new Socio(2,"Marta Martínez","02-02-2002"),
                new Socio(3,"Juana Putón","02-02-2005"),
                new Socio(4,"Marica Ramirez","02-02-1998"),
                new Socio(5,"Bollera Del Campo","02-01-2002")
        };

        System.out.println(Arrays.toString(lista));
        Arrays.sort(lista);
        System.out.println(Arrays.toString(lista));
    }
}
