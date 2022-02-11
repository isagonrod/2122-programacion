package Tema8.Act_Aplicacion.Act_12y13;

/* EJERCICIO 8.13
 * La empresa de mensajería BiciExpress, que reparte en bicicleta, para disminuir el peso que transportan sus empleados
 * solo utiliza cajas de cartón.
 * El volumen de estas se calcula como el 80% del volumen real, con el fin de evitar que se deformen y se rompan.
 * Otra característica de las cajas de cartón es que sus medidas siempre están en centímetros.
 * Por último, la empresa, para controlar costes, necesita saber cuál es la superficie total de cartón utilizado para
 * construir todas las cajas.
 *
 * Escribe la clase CajaCarton heredando de la clase Caja.
 */

public class CajaCarton extends Caja {
    int largo;

    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo, Unidad.CM);
        this.largo = 0;
    }

    double getArea() {
        return 2 * ((ancho * alto) + (ancho * largo) + (ancho * fondo));
    }

    double getVolumen() {
        return 0.8 * (this.ancho * this.alto * this.fondo);
    }
}
