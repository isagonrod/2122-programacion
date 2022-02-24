package Tema9.Act_Ampliacion.Act_35;

public class PP35 {
    public static void main (String[] args) {
        Persona empleado = new Persona("11111111A","Pepe Peña",50.43,100,true,true);

        System.out.println(empleado);

        empleado.incrementaSaldo(2500.00);
        empleado.incrementaHoras(250);
        System.out.println(empleado);
    }
}
