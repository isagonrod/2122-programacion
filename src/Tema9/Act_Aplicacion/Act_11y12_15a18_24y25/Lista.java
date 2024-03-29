package Tema9.Act_Aplicacion.Act_11y12_15a18_24y25;

/* ACTIVIDAD 9.11
 * Implementar la clase Lista para almacenar elementos de tipo String.
 */
/* ACTIVIDAD 9.12
 * Definir las interfaces Cola y Pila para objetos String e implementarlos en la clase Lista definida en la Actividad
 * de aplicación 9.11
 */
/* ACTIVIDAD 9.24
 * Implementar en la clase Lista para elementos Object las funciones sobrecargadas:
 *      - void ordenar(), que ordena la lista con el orden natural de sus elementos.
 *      - void ordenar(Comparator c), que la ordena con el criterio que establezca c. Aquí tendremos que ser muy
 *          cuidadosos con que todos los elementos insertados sean del mismo tipo.
 */
/* ACTIVIDAD 9.25
 * Usar la Lista (actividad de aplicación 9.24) para insertar cadenas de caracteres y ordenarlos por orden alfabético.
 */

import java.util.Arrays;
import java.util.Comparator;

public class Lista implements Cola, Pila {
    protected Object[] tabla;

    public Lista() {
        this.tabla = new Object[0];
    }

	public Object[] getTabla() {
		return tabla;
	}

	public void setTabla(Object[] tabla) {
		this.tabla = tabla;
	}

	public void insertarPrincipio(Object nuevo) {
        if (tabla.length == 0 || tabla[0].getClass().isAssignableFrom(nuevo.getClass())) {
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            System.arraycopy(tabla, 0, tabla,1,tabla.length - 1);
            tabla[0] = nuevo;
        } else {
            System.out.println("Se esperaba insertar: " + tabla[0].getClass() + ". Se ha recibido: " + nuevo.getClass());
        }
    }

    public void insertarFinal(Lista otraLista) {
        int tamIni = tabla.length;
        tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
        System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
    }

    public void insertar(int posicion, Object nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
        tabla[posicion] = nuevo;
    }

    public Object eliminar(int indice) {
        Object eliminado = null;
        if (indice >= 0 && indice < tabla.length) {
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length; i++) {
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }

    public Object get(int indice) {
        Object resultado = null;
        if (indice >= 0 && indice < tabla.length) {
            resultado = tabla[indice];
        }
        return resultado;
    }

    public int buscar(Object claveBusqueda) {
        int indice = -1;
        for (int i = 0; i < tabla.length && indice == -1; i++) {
            if (tabla[i].equals(claveBusqueda)) {
                indice = i;
            }
        }
        return indice;
    }

    public String toString() {
        return Arrays.deepToString(this.tabla);
    }

    @Override
    public void encolar(Object nuevo) {
        if (tabla.length == 0 || tabla[0].getClass().isAssignableFrom(nuevo.getClass())) {
            insertar(tabla.length, nuevo);
        } else {
            System.out.println("Se esperaba encolar: " + tabla[0].getClass() + ". Se ha recibido: " + nuevo.getClass());
        }
    }

    @Override
    public Object desencolar() {
        return eliminar(0);
    }

    @Override
    public void apilar(Object elemento) {
        if (tabla.length == 0 || tabla[0].getClass().isAssignableFrom(elemento.getClass())) {
            insertar(tabla.length, elemento);
        } else {
            System.out.println("Se esperaba apilar: " + tabla[0].getClass() + ". Se ha recibido: " + elemento.getClass());
        }
    }

    @Override
    public Object desapilar() {
        return eliminar(tabla.length - 1);
    }

    public void ordenar() {
        Arrays.sort(this.tabla);
        System.out.println(this);
    }

    public void ordenar(Comparator c) {
        Arrays.sort(this.tabla, c);
        System.out.println(this);
    }

    public Integer getLength() {
        return this.tabla.length;
    }
}
