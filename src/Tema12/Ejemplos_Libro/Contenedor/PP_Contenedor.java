package Tema12.Ejemplos_Libro.Contenedor;

public class PP_Contenedor {
    public static void main(String[] args) {
        Contenedor<Integer> c = new Contenedor<>();
        c.guardar(5);
        Integer n = c.extraer();
        System.out.println(n);
    }
}
