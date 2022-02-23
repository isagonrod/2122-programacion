package Tema9.Act_Ampliacion.Act_35;

/* ACTIVIDAD DE AMPLIACIÓN 9.35
 * Implementar una aplicación para gestionar la información de los empleados y clientes de un banco, teniendo en cuenta
 * que un empleado puede ser, a la vez, cliente del banco.
 * Para ello, crear una única clase Persona que implemente las interfaces Cliente y Empleado.
 * Para simplificar solo se van a tener en cuenta los siguientes atributos:
 *      - Como empleado: número de horas trabajadas en el mes.
 *      - Como cliente: saldo de su cuenta.
 *      - Comunes: DNI (inmutable una vez creado), nombre y dos booleanos que digan si es cliente y/o empleado.
 * Escribir un programa donde se crea un empleado que es cliente y se incrementa su número de horas trabajadas y su
 * saldo como cliente.
 */

public class Persona implements Cliente, Empleado {
    private final String dni;
    private String nombre;
    private double saldo;
    private int horasTrabajadas;
    private boolean esEmpleado, esCliente;

    public Persona(String dni, String nombre, double saldo, int horasTrabajadas, boolean esEmpleado, boolean esCliente) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
        this.horasTrabajadas = horasTrabajadas;
        this.esEmpleado = esEmpleado;
        this.esCliente = esCliente;
    }

    @Override
    public String getDNI() {
        return null;
    }

    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public void setNombre(String nombre) {

    }

    @Override
    public int getHorasTrabajadas() {
        return 0;
    }

    @Override
    public void setHorasTrabajadas(int num) {

    }

    @Override
    public void incrementaHoras(int inc) {

    }

    @Override
    public double getSaldo() {
        return 0;
    }

    @Override
    public void setSaldo(double saldo) {

    }

    @Override
    public void incrementaSaldo(Double inc) {

    }
}
