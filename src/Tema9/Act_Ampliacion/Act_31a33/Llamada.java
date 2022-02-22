package Tema9.Act_Ampliacion.Act_31a33;

/* ACTIVIDAD DE AMPLIACIÓN 9.31
 * En una compañía de telecomunicaciones se desean registrar los datos de todas las llamadas de sus clientes.
 * Implementar la clase Llamada, que guardará los siguientes datos: número de teléfono del cliente, número del
 * interlocutor, atributo booleano que indique si la llamada es saliente, fecha y hora del inicio de la llamada y del fin,
 * atributo enumerado que indique la zona del interlocutor (suponer cinco zonas con tarifas distintas) y tabla de
 * constantes con las tarifas de las zonas en céntimos de euro/minuto.
 * En la clase se establecerá un orden natural compuesto basado en el número del teléfono del cliente como primer
 * criterio y en la fecha y hora de inicio como segundo criterio.
 * Asimismo, se implementará un método que devuelva la duración en minutos de la llamada y otro que calcule su coste,
 * si es saliente.
 * Por último, implementar el método toString(), que muestre los dos números de teléfono, la fecha y hora del inicio,
 * la duración y el coste.
 */
/* ACTIVIDAD DE AMPLIACIÓN 9.32
 * Utilizar la clase Lista para guardar una serie de llamadas.
 * A continuación, ordenarla con el criterio de orden natural y mostrarla por pantalla.
 */
/* ACTIVIDAD DE AMPLIACIÓN 9.33
 * Implementar una clase comparadora que ordene las llamadas por coste.
 * Usarla para ordenar la lista de la actividad de ampliación 9.32 y mostrar el resultado por pantalla.
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Llamada implements Comparable {
    String telefonoDestino;
    LocalDateTime principio, fin;
    boolean llamadaSaliente;
    int zona;
    final String telefonoCliente;
    static final int[] tarifaZona = {3,7,10,20,30};

    public Llamada(String telefonoCliente, String telefonoDestino, LocalDateTime principio, LocalDateTime fin,
                   boolean llamadaSaliente, int zona) {
        this.telefonoCliente = telefonoCliente;
        this.telefonoDestino = telefonoDestino;
        this.principio = principio;
        this.fin = fin;
        this.llamadaSaliente = llamadaSaliente;
        this.zona = zona;
    }

    long duracion() {
        return (principio.until(fin, ChronoUnit.MINUTES));
    }

    double costeLlamada() { // TODO: en Euros : multiplicar la duración por el coste de la zona
        return duracion() * tarifaZona[zona - 1];
    }

    @Override
    public int compareTo(Object o) {
        int resultado = this.telefonoCliente.compareTo(((Llamada)o).telefonoCliente);
        if (resultado == 0) {
            resultado = this.principio.compareTo(((Llamada)o).principio);
        }
        return resultado;
    }

    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.getDefault());
        return "";
    }
}
