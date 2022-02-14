package Tema7.Act_Aplicacion.Act_15;

/* Diseña la clase Calendario que representa una fecha concreta (año, mes y día).
 * La clase debe disponer de los métodos:
 *      - Calendario(int año, int mes, int dia): que crea un objeto con los datos pasados como parámetros, siempre y
 *          cuando, la fecha que representen sea correcta.
 *      - void incrementarDia(): que incrementa en un día la fecha del calendario.
 *      - void incrementarMes(): que incrementa en un mes la fecha del calendario.
 *      - void incrementarAño(int cantidad): que incrementa la fecha del calendario en el número de años especificados.
 *          Ten en cuenta que el año 0 no existió.
 *      - void mostrar(): muestra la fecha por consola.
 *      - boolean iguales(Calendario otraFecha): que determina si la fecha invocante y la que se pasa como parámetro
 *          son iguales o distintas.
 * Por simplicidad, solo tendremos en consideración que existen meses con distinto número de días, pero no tendremos en
 * cuenta los años bisiestos.
 */

public class Calendario {
    private final int[] diaMes = {31,28,31,30,31,30,31,31,30,31,30,31};
    private int year, month, day;

    public Calendario (int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;

        if (!compruebaFecha()) {
            System.out.println("Formato de fecha incorrecto");
        }
    }

    private boolean compruebaFecha() {
        boolean fechaValidada;
        int diasMax;

        if (this.year != 0 && this.month >= 1 && this.month <= 12) {
            if (this.month == 2 && this.year % 4 == 0) {
                diasMax = diaMes[1] + 1;
            } else {
                diasMax = diaMes[this.month - 1];
            }

            fechaValidada = this.day >= 1 && this.day <= diasMax;
        } else {
            fechaValidada = false;
        }

        return fechaValidada;
    }

    void incrementarDia() {
        this.day++;
        if (this.day > this.diaMes[this.month - 1]) {
            this.day = 1;
            this.incrementarMes();
        }
    }

    void incrementarMes() {
        month++;
        if (month > 12) {
            month = 1;
            this.incrementarAño(1);
        }
    }

    void incrementarAño(int cantidad) {
        year += cantidad;
        if (year == 0) {
            year = 1;
        }
    }

    public String toString() {
        return "Día " + day + " del mes " + month + " del año " + year;
    }

    public boolean equals(Calendario otraFecha) {
        return this.day == otraFecha.day && this.month == otraFecha.month && this.year == otraFecha.year;
    }
}

//equals método de la clase Object (genérica)
