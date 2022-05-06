package Tema12.Act_Resueltas.Act_16;

public class Academico implements Comparable<Academico> {
    String nombre;
    int aIngreso;

    public Academico(String nombre, int aIngreso) {
        this.nombre = nombre;
        this.aIngreso = aIngreso;
    }

    @Override
    public int compareTo(Academico o) {
        return this.nombre.compareTo(o.nombre);
    }

    public String toString() {
        return this.nombre + " (" + this.aIngreso + ")\n";
    }
}
