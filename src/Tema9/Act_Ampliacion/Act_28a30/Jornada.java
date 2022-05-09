package Tema9.Act_Ampliacion.Act_28a30;

/* ACTIVIDAD DE AMPLIACIÓN 9.28
 * Implementar la clase Jornada, cuyos objetos son los datos de cada día de trabajo de los empleados de una empresa.
 * En ella se identificará al trabajador por su DNI y figurarán la fecha y las horas de entrada y salida del trabajo
 * de cada jornada.
 * Un método computará el número de minutos trabajados en la jornada.
 * El criterio de orden natural de las jornadas será el de los DNI, y para igual DNI, el de la fecha de la jornada,
 * con objeto de que aparezcan consecutivas todas las jornadas de cada trabajador.
 * Asimismo implementar el método toString() que muestre el DNI del empleado, la fecha y la duración en minutos de las
 * jornadas.
 */

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Jornada implements Comparable, Serializable {
    String dni;
    LocalDateTime fechaEntrada, fechaSalida;

    public Jornada(String dni) {
        this.dni = dni;
    }

    public Jornada(String dni, LocalDateTime fechaEntrada, LocalDateTime fechaSalida) {
        this.dni = dni;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public int tiempoTrabajado() {
        return (int)fechaEntrada.until(fechaSalida, ChronoUnit.MINUTES);
    }

    @Override
    public int compareTo(Object o) {
        int resultado;
        resultado = this.dni.compareTo(((Jornada)o).dni);
        if (resultado == 0) {
            resultado = this.fechaEntrada.compareTo(((Jornada)o).fechaEntrada);
        }
        return resultado;
    }

    public String toString() {
        return "DNI: " + this.dni + " | Fecha: " + this.fechaEntrada + " | Duración de jornada: " + tiempoTrabajado() + "min\n";
    }
}
