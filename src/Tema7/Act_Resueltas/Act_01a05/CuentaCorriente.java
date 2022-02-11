package Tema7.Act_Resueltas.Act_01a05;

/* ACTIVIDAD RESUELTA 7.1.
 * Diseñar la clase CuentaCorriente, que almacena los datos: DNI y nombre del titular, así como el saldo.
 * Las operaciones típicas con una cuenta corriente son:
 *      - Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.
 *      - Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente.
 *      - Ingresar dinero: se incrementa el saldo.
 *      - Mostrar información: muestra la información disponible de la cuenta corriente.
 */
/* ACTIVIDAD RESUELTA 7.2.
 * En la clase CuentaCorriente sobrecargar los constructores para poder crear objetos.
 *      - Con el DNI del titular de la cuenta y un saldo inicial.
 *      - Con el DNI, nombre y el saldo inicial.
 * Escribir un programa que compruebe el funcionamiento de los métodos.
 */
/* ACTIVIDAD RESUELTA 7.3.
 * Modificar la visibilidad de la clase CuentaCorriente para que sea visible desde clases externas y la visibilidad
 * de sus atributos para que:
 *      - saldo no sea visible para cualquier clase
 *      - nombre sea público para cualquier clase
 *      - dni solo sea visible para clases vecinas
 * Realizar un programa para comprobar la visibilidad de los atributos.
 */
/* ACTIVIDAD RESUELTA 7.4.
 * Todas las cuentas corrientes con las que se va a trabajar pertenecen al mismo banco.
 * Añadir un atributo que almacene el nombre del banco (que es único) en la clase CuentaCorriente.
 * Diseñar un método que permita recuperar y modificar el nombre del banco (al que pertenecen todas las cuentas corrientes).
 */
/* ACTIVIDAD RESUELTA 7.5.
 * Existen gestores que administran las cuentas bancarias y atienden a sus propietarios.
 * Cada cuenta, en caso de tenerlo, cuenta con un único gestor. Diseña la clase Gestor de la que interesa guardar
 * su nombre, teléfono y el importe máximo autorizado con el que pueden operar.
 * Con respecto a los gestores, existen las siguientes restricciones:
 *      - Un gestor tendrá siempre un nombre y un teléfono.
 *      - Si no se asigna, el importe máximo autorizado por operación será de 10.000 euros.
 *      - Un gestor, una vez asignado, no podrá cambiar su número de teléfono. Y se podrá consultar siempre.
 * El nombre será público y el importe máximo solo será visible por clases vecinas.
 * Modificar la clase CuentaCorriente para que pueda disponer de un objeto Gestor. Escribir los métodos necesarios.
 */

public class CuentaCorriente {
    String dni;
    public String nombre;
    private double saldo;
    static private String nombreBanco = "International Java Bank";
    Gestor gestor;

    CuentaCorriente (String dni, String nombre, Gestor gestor) {
        this(dni, nombre, 0);
        this.gestor = gestor;
    }

    CuentaCorriente (String dni, String nombre) {
        this(dni, nombre, 0);
        this.gestor = gestor;
    }

    CuentaCorriente (String dni, double saldo) {
        this(dni, "Sin Nombre", saldo);
        this.nombre = nombre;
    }

    CuentaCorriente (String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public static String getNombreBanco() {
        return nombreBanco;
    }

    public static void setNombreBanco(String nombreBanco) {
        CuentaCorriente.nombreBanco = nombreBanco;
    }

    void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    boolean egreso (double cantidad) {
        boolean operacionPosible = false;
        if (saldo >= cantidad) {
            saldo -= cantidad;
            operacionPosible = true;
        } else {
            System.out.println("No hay dinero suficiente");
        }
        return (operacionPosible);
    }

    void ingreso (double cantidad) {
        saldo += cantidad;
    }

    void mostrarInfo () {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
        System.out.println("Banco: " + nombreBanco);

        if (gestor == null) {
            System.out.println("Cuenta sin gestor");
        } else {
            System.out.println("Información del gestor");
            gestor.mostrarInfo();
        }
    }
}
