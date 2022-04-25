package Tema12.Act_Propuestas.Act_05;

/* ACTIVIDAD PROPUESTA 12.5
 * A partir de conjuntoClientes del ejemplo, crea otro conjunto con los mismos elementos ordenados por edad y otro con
 * los clientes ordenados por nombre.
 */

import java.util.Collection;
import java.util.TreeSet;

public class PP_ConjuntoClientes {
    public static void main(String[] args) {
        Collection<Cliente> conjuntoClientes = new TreeSet<>();
        Collection<Cliente> conjuntoEdad = new TreeSet<>(new ComparaEdad());
        Collection<Cliente> conjuntoNombre = new TreeSet<>(new ComparaNombre());

        conjuntoClientes.add(new Cliente(111,"Marta", "12/02/2000"));
        conjuntoClientes.add(new Cliente(115, "Jorge", "16/03/1999"));
        conjuntoClientes.add(new Cliente(112, "Carlos", "01/10/2002"));

        System.out.println("Conjunto de clientes ordenados por DNI: " + conjuntoClientes);

		conjuntoEdad.addAll(conjuntoClientes);
		System.out.println("\nConjunto de clientes ordenados por EDAD: " + conjuntoEdad);

		conjuntoNombre.addAll(conjuntoClientes);
		System.out.println("\nConjunto de clientes ordenador por NOMBRE: " + conjuntoNombre);
    }
}
