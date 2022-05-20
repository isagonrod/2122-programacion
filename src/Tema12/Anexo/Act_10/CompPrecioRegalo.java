package Tema12.Anexo.Act_10;

import java.util.Comparator;

public class CompPrecioRegalo implements Comparator<Regalo> {
    @Override
    public int compare(Regalo o1, Regalo o2) {
        return (int)(o1.getPrecio() - o2.getPrecio());
    }
}
