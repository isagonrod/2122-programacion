package Tema12.Anexo.Act_3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Partido implements IPartido {
    private Set<IPartido> partido;

    public Partido() {
        this.partido = new LinkedHashSet<>();
    }

    public Set<IPartido> getPartido() {
        return partido;
    }

    public void setPartido(Set<IPartido> partido) {
        this.partido = partido;
    }

    public String toString() {
        return this.partido.toString();
    }
}
