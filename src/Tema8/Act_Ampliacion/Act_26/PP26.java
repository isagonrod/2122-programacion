package Tema8.Act_Ampliacion.Act_26;

public class PP26 {
    public static void main (String[] args) {
        CalendarioExacto calendarioExacto1 = new CalendarioExacto(2019,1,19,14,0);
        CalendarioExacto calendarioExacto2 = new CalendarioExacto(2022,2,14,9,36);
        CalendarioExacto calendarioExacto3 = new CalendarioExacto(2022,2,14,9,36);

        System.out.println(calendarioExacto1.toString());
        System.out.println(calendarioExacto2.toString());

        System.out.println("\n¿Son iguales la fecha1 y la fecha2? " +  calendarioExacto1.equals(calendarioExacto2));
        System.out.println("¿Son iguales la fecha2 y la fecha3? " + calendarioExacto2.equals(calendarioExacto3));
    }
}
