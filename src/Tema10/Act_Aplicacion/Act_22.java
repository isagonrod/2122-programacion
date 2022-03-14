package Tema10.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 10.22
 * Crea con un editor de texto el fichero deportistas.txt, donde se recogen los datos de un grupo de deportistas,
 * uno en cada línea.
 * Aparecerá el nombre completo, seguido de la edad, el peso y la estatura.
 * La primera línea será el encabezamiento con los nombres de los campos.
 *
 * Implementa un programa donde se cree un flujo de texto de entrada, a partir del cual, usando un objeto Scanner,
 * se leerán los datos de los deportistas, que se mostrarán por pantalla.
 * Al final aparecerán los valores medios de la edad, el peso y la estatura.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Act_22 {
    public static void main (String[] args) {
        FileInputStream jugadores;
        String nombre;
        int edad, nLineas = 0;
        double peso, estatura, mediaEdad = 0, mediaPeso = 0, mediaEstatura = 0;

        try {
            jugadores = new FileInputStream("archivos_txt/deportistas.txt");
            Scanner sc = new Scanner(jugadores);

            sc.nextLine();
            while (sc.hasNext()) {
                nLineas++;
                nombre = "";

                do {
                    nombre += sc.next() + " ";
                } while (!sc.hasNextInt());

                nombre = nombre.trim(); //para quitar el espacio que sobra del do-while
                edad = sc.nextInt();
                peso = sc.nextDouble();
                estatura = sc.nextDouble();

                mediaEdad += edad;
                mediaPeso += peso;
                mediaEstatura += estatura;

                System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | Peso: " + peso + " | Estatura: "
                        + estatura);
            }

            mediaEdad /= nLineas;
            mediaPeso /= nLineas;
            mediaEstatura /= nLineas;

            System.out.println("\nMedia de edad: " + mediaEdad + " | Media de peso: " + mediaPeso +
                    " | Media de estatura: " + mediaEstatura);
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
