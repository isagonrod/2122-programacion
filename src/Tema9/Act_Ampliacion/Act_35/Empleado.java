package Tema9.Act_Ampliacion.Act_35;

public interface Empleado {
    String getDNI();
    String getNombre();
    void setNombre(String nombre);
    int getHorasTrabajadas();
    void setHorasTrabajadas(int num);
    void incrementaHoras(int inc);
}
