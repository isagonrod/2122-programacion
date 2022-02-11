package Tema7.Anexo.Act_4;

import Utilidades.Teclado;

public class Persona {
    public static Integer idSocioActual = 1;
    Integer idSocio;
    String nif;
    String nombre;
    Fecha fechaNacimiento;
    Fecha fechaAlta;

    public Persona(String nif, String nombre, Fecha fechaNacimiento) {
        this.idSocio = Persona.idSocioActual;
        this.nif = nif;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaAlta = Fecha.generarFechaActual();
    }

    public static Persona pedirDatosPersona() {
        return new Persona(
                Teclado.getString("NIF: "),
                Teclado.getString("NOMBRE: "),
                new Fecha (
                        Teclado.getNumber("Día de nacimiento: "),
                        Teclado.getNumber("Mes de nacimiento: "),
                        Teclado.getNumber("Año de nacimiento: ")
                )
        );
    }

    public void mostrar() {
        System.out.println("ID " + this.idSocio + "; NOMBRE: " + this.nombre + "; NIF: " + this.nif +
                "; FECHA DE NACIMIENTO: " + this.fechaNacimiento + "; FECHA DE ALTA " + this.fechaAlta);
    }
}
