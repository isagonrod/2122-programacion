package Tema6.Act_StringBuilderBuffer;

public class Act_03 {
    /* Concatenar un número grande de cadenas de caracteres, por ejemplo 100000, y vamos a medir el tiempo que se emplea
     * en hacerlo.
     * Lo vamos a realizar primero utilizando la clase String. A continuación utilizando la clase StringBuilder y finalmente
     * lo vamos a hacer utilizando StringBuilder pero asignando inicialmente memoria para la longitud final de la cadena
     * resultante.
     */

    public static void main (String[] args) {
        String s = "cadena";
        long t1, t2;
        int n = 100000;

        System.out.println("Concatenar " + n + " cadenas con String: ");
        t1 = System.currentTimeMillis();
        concatenar(s,n);
        t2 = System.currentTimeMillis();
        System.out.println((t2-t1) + " milisegundos");

        System.out.println("Concatenar " + n + " cadenas con StringBuilder: ");
        t1 = System.currentTimeMillis();
        concatenar1(s,n);
        t2 = System.currentTimeMillis();
        System.out.println((t2 - t1) + " milisegundos");

        System.out.println("Concatenar " + n + " cadenas con StringBuilder Optimizado: ");
        t1 = System.currentTimeMillis();
        concatenar2(s,n);
        t2 = System.currentTimeMillis();
        System.out.println((t2 - t1) + " milisegundos");
    }

    static String concatenar (String s, int n) {
        String resultado = s;
        for (int i = 0; i < n; i++) {
            resultado = resultado + s;
        }
        return resultado;
    }

    static String concatenar1 (String s, int n) {
        StringBuilder resultado = new StringBuilder(s);
        for (int i = 0; i < n; i++) {
            resultado.append(s);
        }
        return resultado.toString();
    }

    static String concatenar2 (String s, int n) {
        StringBuilder resultado = new StringBuilder(s.length() * n);
        for (int i = 0; i < n; i++) {
            resultado.append(s);
        }
        return resultado.toString();
    }
}
