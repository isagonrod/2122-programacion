package Tema8.Act_Resueltas.Act_4y5;

public class PP5 {
    public static void main (String[] args) {
        Nota[] cancion = {Nota.DO, Nota.SI, Nota.SOL, Nota.RE, Nota.FA};
        Piano p = new Piano();
        for (Nota nota: cancion) {
            p.add(nota);
        }
        p.interpretar();
    }
}
