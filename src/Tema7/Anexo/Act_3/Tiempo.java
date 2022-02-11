package Tema7.Anexo.Act_3;

/* Crea la clase Tiempo con los métodos suma y resta.
 *
 * Los objetos de la clase Tiempo son intervalos de tiempo y se crean de la siguiente forma:
 *      Tiempo t = new Tiempo (1, 20, 30)
 * donde los intervalos que se le pasan al constructor son las horas, los minutos y los segundos respectivamente.
 *
 * Crea un método mostrar para ver los intervalos de tiempo de la forma 10h 35m 5s.
 * Permite la suma de dos objetos de esta clase: por ejemplo 30m 40s y 35m 20s, el resultado debería ser 1h 6m 0s.
 *
 * Realiza un programa de prueba para comprobar que la clase funciona bien.
 */

public class Tiempo {
    Integer horas, minutos, segundos;

    public Tiempo (int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    static Tiempo sumar(Tiempo t1, Tiempo t2) {
        Tiempo resultado = new Tiempo(0,0,0);

        resultado.segundos = t1.segundos + t2.segundos;
        resultado.minutos = t1.minutos + t2.minutos;
        resultado.horas = t1.horas + t2.horas;

        if (resultado.segundos > 59) {
            resultado.segundos = resultado.segundos - 60;
            resultado.minutos++;
        }
        if (resultado.minutos > 59) {
            resultado.minutos = resultado.minutos - 60;
            resultado.horas++;
        }

        return resultado;
    }

    static Tiempo restar(Tiempo t1, Tiempo t2) {
        Tiempo resultado = new Tiempo(0,0,0);

        resultado.segundos = t1.segundos - t2.segundos;
        resultado.minutos = t1.minutos - t2.minutos;
        resultado.horas = t1.horas - t2.horas;

        if (resultado.segundos < 0) {
            resultado.segundos = resultado.segundos + 60;
            resultado.minutos--;
        }
        if (resultado.minutos < 0) {
            resultado.minutos = resultado.minutos + 60;
            resultado.horas--;
        }

        return resultado;
    }

    public String toString() {
        return this.horas + "h " + this.minutos + "m " + this.segundos + "s";
    }
}
