package Utilidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase para trabajar con fechas.
 */
public class Fechas {
    /**
     * Función que espera un String con formato "yyyy-MM-dd HH:mm" para devolver un<br>
     * objeto de tipo LocalDateTime.
     * @param fechaCompleta - cadena de texto con formato "yyyy-MM-dd HH:mm"
     * @return LocalDateTime - la fecha montada
     */
    public static LocalDateTime formatearFechaCompleta(String fechaCompleta) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return LocalDateTime.parse(fechaCompleta, f);
    }

    /**
     * Función que espera un String con formato "yyyy-MM-dd" y un String con formato<br>
     * "HH:mm" para devolver un objeto de tipo LocalDateTime.
     * @param fecha - cadena de texto con formato "yyyy-MM-dd"
     * @param hora - cadena de texto con formato "HH:mm"
     * @return LocalDateTime - la fecha montada
     */
    public static LocalDateTime formatearFechaHora(String fecha, String hora) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return LocalDateTime.parse(fecha + " " + hora, f);
    }

    /**
     * Función que espera un String de fecha y un formato específico para devolver un<br>
     * objeto de tipo LocalDateTime.
     * @param fecha - cadena de texto con una fecha
     * @param formato - cadena de texto con el formato para la fecha
     * @return LocalDateTime - la fecha montada
     */
    public static LocalDateTime formatearFecha(String fecha, String formato) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern(formato);
        return LocalDateTime.parse(fecha, f);
    }
}
