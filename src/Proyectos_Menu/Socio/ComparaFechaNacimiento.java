package Proyectos_Menu.Socio;

import java.util.Comparator;

public class ComparaFechaNacimiento implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int resultado;
        resultado = ((Socio)o1).fechaNacimiento.compareTo(((Socio)o2).fechaNacimiento);
        if (resultado == 0) {
            resultado = ((Socio)o1).nombre.compareTo(((Socio)o2).nombre);
        }
        return resultado;
    }
}
