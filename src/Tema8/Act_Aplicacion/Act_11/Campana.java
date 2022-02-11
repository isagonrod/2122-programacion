package Tema8.Act_Aplicacion.Act_11;

import Tema8.Act_Resueltas.Act_4y5.Instrumento;
import Tema8.Act_Resueltas.Act_4y5.Nota;

public class Campana extends Instrumento {
    public Campana() {
        super();
    }

    @Override
    public void interpretar() {
        for (Nota nota: super.melodia) {
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