package Tema12.Anexo.Act_10;

/* ACTIVIDAD 10
 * Alumnos ordenados por dni
 */

import Utilidades.Teclado;

import java.util.*;

public class Principal_10 {
    public static void main(String[] args) {
        Map<Profesor, Set<Alumno>> clase = new HashMap<>();
        Set<Alumno> alumno;
        int opc;

        do {
            menu();
            opc = Teclado.leerOpcion(1, 6);
            switch (opc) {
                case 1 -> {
                    Profesor profesor = new Profesor(Teclado.getString("DNI: "), Teclado.getString("Nombre y apellido: "));
                    clase.put(profesor, new TreeSet<>());
                }
                case 2 -> { // TODO: No funciona
                    Profesor prof = new Profesor(
                            Teclado.getString("DNI del profesor: "),
                            Teclado.getString("Nombre y apellido del profesor: ")
                    );
                    if (clase.containsKey(prof)) {
                        alumno = new TreeSet<>();
                        alumno.add(new Alumno(
                                Teclado.getString("DNI del alumno: "),
                                Teclado.getString("Nombre y apellido del alumno: ")
                        ));
                        clase.put(prof, alumno);
                    } else {
                        System.out.println("El profesor no existe en la base de datos");
                    }
                }
                case 3 -> imprimirMapa(clase);
                case 4 -> {
                    Set<Alumno> alumnos = new TreeSet<>(new ComparaMedia());
                    clase.put((Profesor)clase.keySet(), alumnos);
                    imprimirMapa(clase);
                }
                case 5 -> {
                    Profesor prof = new Profesor(Teclado.getString("DNI: "));
                    if (clase.containsKey(prof)) {
                        prof.setNombreApellido(Teclado.getString("Nuevo nombre y apellido: "));
                    }
                }
                case 6 -> System.out.println("¡Adiós!");
            }
        } while (opc != 6);
    }

    static void menu() {
        System.out.println("-- MENÚ DE OPCIONES --");
        System.out.println("1. Insertar profesor");
        System.out.println("2. Insertar alumno");
        System.out.println("3. Listado completo con alumnos ordenados por DNI");
        System.out.println("4. Listado completo con alumnos ordenador por nota media");
        System.out.println("5. Modificar datos de profesor");
        System.out.println("6. Salir");
    }

    static void imprimirMapa(Map<Profesor, Set<Alumno>> clase) {
        System.out.println("Listado completo de la clase");
        for (Map.Entry<Profesor, Set<Alumno>> entry : clase.entrySet()) {
            System.out.println("\nProfesor " + entry.getKey() + ":\n\t" + entry.getValue());
        }
    }
}
