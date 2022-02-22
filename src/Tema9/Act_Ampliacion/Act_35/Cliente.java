package Tema9.Act_Ampliacion.Act_35;

public interface Cliente {
    String getDNI();
    String getNombre();
    void setNombre(String nombre);
    double getSaldo();
    void setSaldo(double saldo);
    void incrementaSaldo(Double inc);
}
