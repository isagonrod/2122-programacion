package Tema12.Ejemplos_Libro.Contenedor;

public class Contenedor <T> {
    private T objeto;

    public Contenedor() {

    }

    void guardar(T nuevo) {
        this.objeto = nuevo;
    }

    T extraer() {
        T res = this.objeto;
        this.objeto = null;
        return res;
    }
}
