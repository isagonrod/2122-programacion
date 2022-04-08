package Tema11.Act_Ampliacion.Act_32;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Llamada implements Comparable, Serializable {
    private String telefonoDestino;
    private LocalDateTime principio, fin;
    private boolean llamadaSaliente;
    private int zona;
    private final String telefonoCliente;
    private static final int[] tarifaZona = {3,7,10,20,30};

    public Llamada(String telefonoCliente, String telefonoDestino, String principio, String fin) {
        this.telefonoCliente = telefonoCliente;
        this.telefonoDestino = telefonoDestino;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        this.principio = LocalDateTime.parse(principio, f);
        this.fin = LocalDateTime.parse(fin, f);
    }

    public String getTelefonoDestino() {
        return telefonoDestino;
    }

    public void setTelefonoDestino(String telefonoDestino) {
        this.telefonoDestino = telefonoDestino;
    }

    public LocalDateTime getPrincipio() {
        return principio;
    }

    public void setPrincipio(String principio) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        this.principio = LocalDateTime.parse(principio, f);
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public void setFin(String fin) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        this.fin = LocalDateTime.parse(fin, f);
    }

    public boolean isLlamadaSaliente() {
        return llamadaSaliente;
    }

    public void setLlamadaSaliente(boolean llamadaSaliente) {
        this.llamadaSaliente = llamadaSaliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    long duracion() {
        return (principio.until(fin, ChronoUnit.MINUTES));
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
        return "Teléfono titular: " + this.telefonoCliente + " | Teléfono interlocutor: " + this.telefonoDestino +
                " | Fecha y hora de la llamada: " + this.principio + " | Duración: " + this.duracion() + "\n";
    }
}

