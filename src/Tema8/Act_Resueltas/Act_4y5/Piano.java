package Tema8.Act_Resueltas.Act_4y5;

/* EJERCICIO 8.5
 * Crear la clase Piano heredando de la clase abstracta Instrumento
 */

public class Piano extends Instrumento {
    public Piano() {
        super();
    }

    @Override
    public void interpretar() {
        for (Nota nota: melodia) {
            switch (nota) {
                case DO: System.out.println("do ");
                case RE: System.out.println("re ");
                case MI: System.out.println("mi ");
                case FA: System.out.println("fa ");
                case SOL: System.out.println("sol ");
                case LA: System.out.println("la ");
                case SI: System.out.println("si ");
            }
        }
        System.out.println("");
    }
}
