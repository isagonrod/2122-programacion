package Tema12.Anexo.Act_3;

import java.util.Set;

public interface IEquipo {
    String nombreEquipo = null;
    int puntos = 0;
    int partidosJugados = 0;
    int golesFavor = 0;
    int golesContra = 0;
    Set<Partido> partidosFuera = null;
    Set<Partido> partidosCasa = null;
}
