package Tema12.Anexo.Act_10;

import java.util.ArrayList;
import java.util.List;

public class Novios implements INovios {
    private String codigoBoda;
    private String nombreNovio;
    private String nombreNovia;
    private String domicilio;
    private List<Regalo> regalos;

    public Novios(String codigoBoda, String nombreNovio, String nombreNovia, String domicilio) {
        this.codigoBoda = codigoBoda;
        this.nombreNovio = nombreNovio;
        this.nombreNovia = nombreNovia;
        this.domicilio = domicilio;
        this.regalos = new ArrayList<>();
    }

    public String getCodigoBoda() {
        return codigoBoda;
    }

    public void setCodigoBoda(String codigoBoda) {
        this.codigoBoda = codigoBoda;
    }

    public String getNombreNovio() {
        return nombreNovio;
    }

    public void setNombreNovio(String nombreNovio) {
        this.nombreNovio = nombreNovio;
    }

    public String getNombreNovia() {
        return nombreNovia;
    }

    public void setNombreNovia(String nombreNovia) {
        this.nombreNovia = nombreNovia;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public List<Regalo> getRegalos() {
        return regalos;
    }

    public void setRegalos(List<Regalo> regalos) {
        this.regalos = regalos;
    }

    @Override
    public String toString() {
        return "Novios{" +
                "codigoBoda='" + codigoBoda + '\'' +
                ", nombreNovio='" + nombreNovio + '\'' +
                ", nombreNovia='" + nombreNovia + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", regalos=" + regalos +
                '}';
    }
}
