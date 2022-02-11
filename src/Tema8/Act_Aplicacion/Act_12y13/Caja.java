package Tema8.Act_Aplicacion.Act_12y13;

/* EJERCICIO 8.12
 * Las empresas de transporte, para evitar daños en los paquetes, embalan todas sus mercancías en cajas con el tamaño
 * adecuado. Una caja se crea expresamente con un ancho, un alto y un fondo y, una vez creada, se mantiene inmutable.
 * Cada caja lleva pegada una etiqueta, de un máximo de 30 caracteres, con información útil como el nombre del
 * destinatario, dirección, etc.
 *
 * Implementa la clase Caja con los siguientes métodos:
 *      - Caja(int ancho, int alto, int fondo, Unidad unidad): que construye una caja con las dimensiones especificadas,
 *          que pueden encontrarse en "cm" (centímetros) o "m" (metros).
 *      - double getVolumen(): que devuelve el volumen de la caja en metros cúbicos.
 *      - void setEtiqueta(String etiqueta): que modifica el valor de la etiqueta de la caja.
 *      - String toString(): que devuelve una cadena con la representación de la caja.
 */

public class Caja {
    int ancho, alto, fondo;
    Unidad unidad;
    String etiqueta;

    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
        this.etiqueta = "";
    }

    double getVolumen() {
        return this.ancho * this.alto * this.fondo;
    }

    void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta.substring(0, Math.min(etiqueta.length(), 30));
    }

    @Override
    public String toString() {
        return "Caja {" + "ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + ", unidad=" + unidad +
                ", etiqueta='" + etiqueta + '\'' + '}';
    }
}
