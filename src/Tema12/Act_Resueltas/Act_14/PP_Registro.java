package Tema12.Act_Resueltas.Act_14;

/* ACTIVIDAD RESUELTA 12.14
 * Implementar una aplicación que simula el registro de las temperaturas, a lo largo de un día, en una estación meteorológica.
 * La aplicación mostrará un menú con las opciones:
 *      1. Nuevo registro (que introduciremos manualmente, aunque se supone que, en el sistema original, estaría controlado por un reloj).
 *      2. Listar registros.
 *      3. Mostrar estadística (con los valores máximo, mínimo y promedio de las temperaturas registradas hasta el momento
 *          desde la primera lectura del día).
 *      4. Salir.
 * Al salir, los datos se grabarán en un fichero binario cuyo nombre estará compuesto por la cadena "registros" concatenada
 * con la fecha del día en el formato "yyyyMMdd" y extensión ".dat".
 * Cada registro constará de la temperatura en grados centígrados y la hora, que se leerá del sistema en el momento de
 * la creación del registro.
 */

import Utilidades.Teclado;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PP_Registro {
    public static void main(String[] args) {
        Set<Registro> temperaturas = new LinkedHashSet<>();
        int opc;
        do {
            menu();
            opc = Teclado.leerOpcion(1, 4);
            switch (opc) {
                case 1 -> {
                    double temperatura = Teclado.getDouble("Introducir temperatura: ");
                    temperaturas.add(new Registro(temperatura));
                }
                case 2 -> {
                    Comparator<Registro> c = new Comparator<Registro>() {
                        @Override
                        public int compare(Registro o1, Registro o2) {
                            return (int)Math.signum(o1.temperatura - o2.temperatura);
                        }
                    };
                    System.out.println("Temperatura máxima: " + Collections.max(temperaturas, c));
                    System.out.println("Temperatura mínima: " + Collections.min(temperaturas, c));
                    double suma = 0;
                    for (Registro t : temperaturas) {
                        suma += t.temperatura;
                    }
                    System.out.println("Temperatura media: " + suma / temperaturas.size());
                }
            }
        } while (opc != 4);

        String nombreArchivo = "registros";
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyyMMdd");
        nombreArchivo += LocalDate.now().format(f);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/Tema12/Act_Resueltas/Act_14/" + nombreArchivo + ".dat"))){
            out.writeObject(temperaturas);
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void menu() {
        System.out.println("-- MENÚ DE OPCIONES --");
        System.out.println("1. Nuevo registro");
        System.out.println("2. Listar registros del día");
        System.out.println("3. Mostrar estadística");
        System.out.println("4. Salir");
    }
}
