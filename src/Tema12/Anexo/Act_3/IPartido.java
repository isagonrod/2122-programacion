package Tema12.Anexo.Act_3;

import java.util.Set;

public interface IPartido extends Comparable<IPartido> {
    public Equipo getEquipoLocal();

    public void setEquipoLocal(Equipo equipoLocal);

    public Equipo getEquipoVisitante();

    public void setEquipoVisitante(Equipo equipoVisitante);

    public int getnGolesLocal();

    public void setnGolesLocal(int nGolesLocal);

    public int getnGolesVisitante();

    public void setnGolesVisitante(int nGolesVisitante);

    public int getJornada();

    public void setJornada(int jornada);

    public String toString();
}
