package Tema12.Anexo.Act_3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Partido implements IPartido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int nGolesLocal;
    private int nGolesVisitante;
    private int jornada;

    public Partido() {
        this.equipoLocal = null;
        this.equipoVisitante = null;
        this.nGolesLocal = 0;
        this.nGolesVisitante = 0;
        this.jornada = 0;
    }

    @Override
    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    @Override
    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    @Override
    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    @Override
    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    @Override
    public int getnGolesLocal() {
        return nGolesLocal;
    }

    @Override
    public void setnGolesLocal(int nGolesLocal) {
        this.nGolesLocal = nGolesLocal;
    }

    @Override
    public int getnGolesVisitante() {
        return nGolesVisitante;
    }

    @Override
    public void setnGolesVisitante(int nGolesVisitante) {
        this.nGolesVisitante = nGolesVisitante;
    }

    @Override
    public int getJornada() {
        return jornada;
    }

    @Override
    public void setJornada(int jornada) {
        this.jornada = jornada;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "equipoLocal=" + equipoLocal +
                ", equipoVisitante=" + equipoVisitante +
                ", nGolesLocal=" + nGolesLocal +
                ", nGolesVisitante=" + nGolesVisitante +
                ", jornada=" + jornada +
                '}';
    }

    @Override
    public int compareTo(IPartido o) {
        return this.jornada - o.getJornada();
    }
}
