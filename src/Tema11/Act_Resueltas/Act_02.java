package Tema11.Act_Resueltas;

/* ACTIVIDAD RESUELTA 11.2
 * Escribe como una cadena, en el fichero binario cancioPirata.dat, la siguiente estrofa:
 *      Con diez cañones por banda,
 *      viento en popa a toda vela,
 *      no corre el mar, sino vuela
 *      un velero bergantín.
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Act_02 {
    public static void main (String[] args) {
        String estrofa = "Con diez cañones por banda, \n"
                + "viento en popa a toda vela, \n"
                + "no corta el mar, sino vuela \n"
                + "un velero bergantín.";

        ObjectOutputStream out;

        try {
            out = new ObjectOutputStream(new FileOutputStream("archivos_binary/cancionPirata.dat"));
            out.writeObject(estrofa);
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
