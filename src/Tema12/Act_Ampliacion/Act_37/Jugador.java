package Tema12.Act_Ampliacion.Act_37;

public class Jugador {
    private String dni;
    private String nombre;
    private PosicionJugador posicion;
    private double estatura;

    public Jugador(String dni, String nombre, PosicionJugador posicion, double estatura) {
        this.dni = dni;
        this.nombre = nombre;
        this.posicion = posicion;
        this.estatura = estatura;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PosicionJugador getPosicion() {
        return posicion;
    }

    public void setPosicion(PosicionJugador posicion) {
        this.posicion = posicion;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String toString() {
        return "Nombre: " + this.nombre + " | DNI: " + this.dni + " | Posición: " + this.posicion +
                " | Estatura: " + this.estatura + " m\n";
    }
}
