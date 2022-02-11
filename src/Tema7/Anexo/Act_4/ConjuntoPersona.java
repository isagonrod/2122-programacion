package Tema7.Anexo.Act_4;

import Utilidades.Teclado;
import java.util.Arrays;

public class ConjuntoPersona {

    private Persona[] asociacion;

    public ConjuntoPersona() {
        this.asociacion = new Persona[0];
    }

    void altaSocio() {
        asociacion = Arrays.copyOf(asociacion, asociacion.length + 1);
        this.asociacion[this.asociacion.length - 1] = Persona.pedirDatosPersona();
        Persona.idSocioActual++;
    }

    boolean modificarFechaNacimiento(Integer idSocio) {
        boolean fechaModificada = false;
        Integer objetivo = this.buscarPersona(idSocio);

        if (objetivo != -1) {
            this.asociacion[objetivo].fechaNacimiento = new Fecha(
                    Teclado.getNumber("Día de nacimiento: "),
                    Teclado.getNumber("Mes de nacimiento: "),
                    Teclado.getNumber("Año de nacimiento: ")
            );
            fechaModificada = true;
        }

        return fechaModificada;
    }

    void listadoCompleto() {
        for (int i = 0; i < this.asociacion.length; i++) {
            this.asociacion[i].mostrar();
        }
    }

    void listadoOrdenadoNombre() {
        for (int i = 0; i < this.asociacion.length; i++) {
            for (int j = 0; j < this.asociacion.length; j++) {
                if (this.asociacion[i].nombre.compareToIgnoreCase(this.asociacion[j].nombre) < 0 ) {
                    Persona aux = this.asociacion[i];
                    this.asociacion[i] = this.asociacion[j];
                    this.asociacion[j] = aux;
                }
            }
        }
        this.listadoCompleto();
    }

    void listadoOrdenaFecha() {
        Persona aux;
        for (int i = 0; i < this.asociacion.length; i++) {
            for (int j = 0; j < this. asociacion.length; j++) {
                if (this.asociacion[i].fechaNacimiento.año.compareTo(this.asociacion[j].fechaNacimiento.año) < 0 ||
                        this.asociacion[i].fechaNacimiento.mes.compareTo(this.asociacion[j].fechaNacimiento.mes) < 0 ||
                        this.asociacion[i].fechaNacimiento.dia.compareTo(this.asociacion[j].fechaNacimiento.dia) < 0) {
                    aux = this.asociacion[i];
                    this.asociacion[i] = this.asociacion[j];
                    this.asociacion[j] = aux;
                }
            }
        }
        this.listadoCompleto();
    }

    Integer buscarPersona(Integer numSocio) {
        int indice = -1;

        for (int i = 0; i < this.asociacion.length; i++) {
            if (this.asociacion[i].idSocio.compareTo(numSocio) == 0) {
                indice = i;
            }
        }

        return indice;
    }
}
