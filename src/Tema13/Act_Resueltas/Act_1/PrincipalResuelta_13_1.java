package Tema13.Act_Resueltas.Act_1;

public class PrincipalResuelta_13_1 {
    public static void main(String[] args) {
        Saludo<String> saludoNombre = s -> "¡Hola " + s + "!";
        System.out.println(saludoNombre.saludar("Claudia"));
        System.out.println(saludoNombre.saludar("Ana"));

        Saludo<Cliente> saludoClie = c -> "¡Buenos días " + c.nombre + "!\n";
        System.out.println(saludoClie.saludar(new Cliente("111", "Marta", "12/02/2000")));
    }
}
