package Tema13.Act_Resueltas;

import Tema13.Act_Resueltas.Act_1.Cliente;
import Tema13.Act_Resueltas.Act_1.Saludo;

import java.util.ArrayList;
import java.util.List;

public class PrincipalResuelta_13_2 {
    public static void main(String[] args) {
        Cliente[] grupoClientes = {
                new Cliente("111", "Marta", "12/02/2000"),
                new Cliente("115", "Jorge", "16/03/1999"),
                new Cliente("112", "Carlos", "01/10/2002"),
                new Cliente("211", "Ana", "07/12/2001")
        };
        System.out.println(saludarGrupo(grupoClientes, c -> "¡Buenos días " + c.nombre + "!\n"));
    }

    static <T> List<String> saludarGrupo(T[] grupo, Saludo<T> saludo) {
        List<String> res = new ArrayList<>();
        for (T e : grupo) {
            res.add(saludo.saludar(e));
        }
        return res;
    }
}
