package Tema12.Anexo.Act_10;

import java.util.ArrayList;
import java.util.List;

public class ListaNovios {
    private List<Novios> listaNovios;

    public ListaNovios() {
        this.listaNovios = new ArrayList<>();
    }

    public List<Novios> getListaNovios() {
        return listaNovios;
    }

    public void setListaNovios(List<Novios> listaNovios) {
        this.listaNovios = listaNovios;
    }

    @Override
    public String toString() {
        return "ListaNovios{" +
                "listaNovios=" + listaNovios +
                '}';
    }
}
