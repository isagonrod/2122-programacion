package Tema12.Anexo.Act_3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Equipo implements IEquipo {
    private Set<IEquipo> equipo;

    public Equipo() {
        this.equipo = new LinkedHashSet<>();
    }

    public Set<IEquipo> getEquipo() {
        return equipo;
    }

    public void setEquipo(Set<IEquipo> equipo) {
        this.equipo = equipo;
    }

    public String toString() {
        return this.equipo.toString();
    }

    // addPartidoCasa(Partido nuevo) {}

    // addPartidoFuera(Partido nuevo) {}

    //recalculaValores()
}
