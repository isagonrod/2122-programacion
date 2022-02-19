package Proyectos_Menu.Socio;

import Utilidades.Teclado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class ConjuntoSocio {
    Socio[] asociacion;

    public ConjuntoSocio() {
        this.asociacion = new Socio[0];
    }

    void altaSocio() {
        asociacion = Arrays.copyOf(asociacion, asociacion.length + 1);
        this.asociacion[this.asociacion.length - 1] = Socio.pedirDatosSocio();
        Socio.idSocioActual++;
    }

    boolean modificarFechaNacimiento(int idSocio) {
        boolean fechaModificada = false;
        int objetivo = this.buscarPosicionSocio(idSocio);

        if (objetivo != -1) {
            DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            this.asociacion[objetivo].fechaNacimiento = LocalDate.parse(Teclado.getString("Nueva fecha de nacimiento: "), f);
        }
        return fechaModificada;
    }

    Socio buscarSocio(int numSocio) {
        Socio resultado = null;
        int objetivo = this.buscarPosicionSocio(numSocio);

        if (objetivo != -1) {
            resultado = this.asociacion[objetivo];
        }
        return resultado;
    }

    int buscarPosicionSocio(int numSocio) {
        int indice = -1, i;

        for (i = 0; i < this.asociacion.length; i++) {
            if (this.asociacion[i].idSocio == numSocio) {
                indice = i;
            }
        }
        return indice;
    }

    void listadoOrdenadoId() {
        Arrays.sort(this.asociacion);
        System.out.println(Arrays.toString(this.asociacion));
    }

    void listadoOrdenadoEdad() {
        Arrays.sort(this.asociacion, new ComparaEdad());
        System.out.println(Arrays.toString(asociacion));
    }
}
