package Tema12.Anexo.Act_3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Partido implements IPartido {
    Equipo equipoLocal = null;
    Equipo equipoVisitante = null;
    int nGolesLocal = 0;
    int nGolesVisitante = 0;
    int jornada = 0;
    private Set<IPartido> partido;

    public Partido() {
        this.partido = new LinkedHashSet<>();
    }

    @Override
    public Set<IPartido> getPartido() {
        return partido;
    }

    @Override
    public void setPartido(Set<IPartido> partido) {
        this.partido = partido;
    }

    @Override
    public String toString() {
        return this.partido.toString();
    }
}
