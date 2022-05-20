package Tema12.Act_Clase.Act_Mapa_ProfAlum;

/* ACTIVIDAD DE CLASE
 * Menú de opciones:
 *  1) Insertar profesor
 *  2) Insertar alumno (pedir por teclado Profesor y luego los datos del alumno)
 *  3) Listado completo (Profesor + Alumnos ordenados por dni)
 *  4) Listado completo (Profesor + Alumnos ordenador por nota media)
 *  5) Modificar Profesor (pedir dni y cambiar nombre y apellido)
 *  6) Salir
 */

import Utilidades.Teclado;

import java.util.*;

public class Principal_ProfAlum {
    public static void main(String[] args) {
        Map<Profesor, Set<Alumno>> clase = new HashMap<>();
        int opc;

        do {
            menu();
            opc = Teclado.leerOpcion(1, 6);
            switch (opc) {
                case 1 -> {
                    Profesor profesor = new Profesor(Teclado.getString("DNI: "), Teclado.getString("Nombre y apellido: "));
                    clase.put(profesor, new TreeSet<>());
                }
                case 2 -> {
                    Profesor prof = new Profesor(
                            Teclado.getString("DNI del profesor: "),
                            Teclado.getString("Nombre y apellido del profesor: ")
                    );
                    if (clase.containsKey(prof)) {
                        clase.get(prof).add(new Alumno(
                                Teclado.getString("DNI del alumno: "),
                                Teclado.getString("Nombre y apellido del alumno: ")
                        ));
                    } else {
                        System.out.println("El profesor no existe en la base de datos");
                    }
                }
                case 3 -> imprimirMapa(clase);
                case 4 -> {
                    Map<Profesor, Set<Alumno>> aux1 = new HashMap<>();
                    Set<Alumno> aux2;
                    for (Map.Entry<Profesor, Set<Alumno>> entry : clase.entrySet()) {
                        aux2 = new TreeSet<>(new ComparaMedia());
                        aux2.addAll(entry.getValue());
                        aux1.put(entry.getKey(), aux2);
                    }
                    imprimirMapa(aux1);
                }
                case 5 -> {
                    Profesor prof = new Profesor(Teclado.getString("DNI: "), Teclado.getString("Nombre y apellido: "));
                    if (clase.containsKey(prof)) {
                        prof = getKey(prof, clase);
                        prof.setNombreApellido(Teclado.getString("Nuevo nombre y apellido: "));
                    } else {
                        System.out.println("El profesor no existe en la base de datos");
                    }
                }
                case 6 -> System.out.println("¡Adiós!");
            }
        } while (opc != 6);
    }

    static void menu() {
        System.out.println("\n-- MENÚ DE OPCIONES --");
        System.out.println("1. Insertar profesor");
        System.out.println("2. Insertar alumno");
        System.out.println("3. Listado completo con alumnos ordenados por DNI");
        System.out.println("4. Listado completo con alumnos ordenados por nota media");
        System.out.println("5. Modificar datos de profesor");
        System.out.println("6. Salir\n");
    }

    static void imprimirMapa(Map<Profesor, Set<Alumno>> clase) {
        System.out.println("Listado completo de la clase");
        for (Map.Entry<Profesor, Set<Alumno>> entry : clase.entrySet()) {
            System.out.println("\nProfesor " + entry.getKey());
            imprimirSet(entry.getValue());
        }
    }

    static void imprimirSet(Set<Alumno> alumnos) {
        for (Alumno a : alumnos) {
            System.out.println("\t" + a);
        }
    }

    /** Es imposible cambiar la clave de un registro (lo lógico porque podemos cargarnos la lista),
     * hay que recurrir a cogerle las vueltas al mapa para poder efectuar cambios.
     *
     * @param profesor
     * @param clase
     * @return
     */
    public static Profesor getKey(Profesor profesor, Map<Profesor, Set<Alumno>> clase) {
        Profesor result = null;
        for (Profesor entry : clase.keySet()) {
            if (entry.equals(profesor)) {
                result = entry;
            }
        }
        return result;
    }
}
