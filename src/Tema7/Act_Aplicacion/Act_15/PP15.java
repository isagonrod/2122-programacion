package Tema7.Act_Aplicacion.Act_15;

public class PP15 {
    public static void main (String[] args){
        Calendario c1 = new Calendario(2019,1,19);
        Calendario c2 = new Calendario(2022,1,27);

        System.out.println("C1 es igual a C2: " + c1.equals(c2));

        c1.incrementarDia();
        c1.incrementarMes();
        c2.incrementarAño(6);

        c1.toString();
        c2.toString();
    }

}
