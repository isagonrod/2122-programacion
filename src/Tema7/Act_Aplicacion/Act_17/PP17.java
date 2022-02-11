package Tema7.Act_Aplicacion.Act_17;

public class PP17 {
    public static void main (String[] args) {
        String cadena = "Vamos a cifrar este texto";

        System.out.println("--TEXTO CIFRADO--");
        cadena = CifradoCesar.cifrar(cadena, 3);
        System.out.println(cadena);

        System.out.println("\n--TEXTO DESCIFRADO--");
        cadena = CifradoCesar.descifrar(cadena, 3);
        System.out.println(cadena);
    }
}
