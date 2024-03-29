package Tema11.Práctica;
/* PRÁCTICA DEL TEMA 11: LISTADO DE CALIFICACIONES ORDENADO ALFABÉTICAMENTE SEGÚN EL NOMBRE DE LA ASIGNATURA
 *
 * Procesar los siguientes ficheros para obtener el listado resumen del número de alumnos que obtuvieron una determinada
 * calificación por asignatura.
 *
 * LISTADO:
 * Resumen de calificaciones por asignaturas, ord nombre asignatura
 *  Nombre Asignatura   Cód     Sus    Apr     Not     Sob
 *      String          int     int    int     int     int
 *
 * FICHEROS DISPONIBLES:
 *  - asignaturas.txt
 *      código (mayor que cero) y nombre de asignatura. Cada código es distinto y representa de forma única a una asignatura.
 *  - alumnos.dat
 *      nombre, dni y cinco pares de: código de asignatura y su calificación. Cada alumno cursa 5 asignaturas.
 */

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
//		ConjuntoAlumnos listaAlumnos = new ConjuntoAlumnos();
//
//		CalificacionAsignatura[] notas1 = {
//			new CalificacionAsignatura(1, 5.5),
//			new CalificacionAsignatura(2, 6.75),
//			new CalificacionAsignatura(3, 6.0),
//			new CalificacionAsignatura(6, 7.0),
//			new CalificacionAsignatura(4, 8.25)
//		};
//		CalificacionAsignatura[] notas2 = {
//			new CalificacionAsignatura(5, 4.5),
//			new CalificacionAsignatura(7, 8.4),
//			new CalificacionAsignatura(8, 5),
//			new CalificacionAsignatura(1, 5),
//			new CalificacionAsignatura(9, 9)
//		};
//		CalificacionAsignatura[] notas3 = {
//			new CalificacionAsignatura(10, 8.5),
//			new CalificacionAsignatura(7, 7),
//			new CalificacionAsignatura(1, 5.5),
//			new CalificacionAsignatura(4, 6.75),
//			new CalificacionAsignatura(6, 6)
//		};
//		CalificacionAsignatura[] notas4 = {
//			new CalificacionAsignatura(12, 6),
//			new CalificacionAsignatura(11, 5),
//			new CalificacionAsignatura(1, 7.5),
//			new CalificacionAsignatura(5, 8.9),
//			new CalificacionAsignatura(6, 4.1)
//		};
//
//		listaAlumnos.insertarAlumno(new Alumno("Ana Mena", "12345678A", notas1));
//		listaAlumnos.insertarAlumno(new Alumno("Juan Peña", "28763540B", notas2));
//		listaAlumnos.insertarAlumno(new Alumno("Miguel Ruiz", "84623014C", notas3));
//		listaAlumnos.insertarAlumno(new Alumno("Paula Martínez", "90175633D", notas4));
//
//		guardarFicheroBinario(listaAlumnos);

        ConjuntoAlumnos tablaAlumnosNotas = cargarFicheroBinario();
        Asignatura[] tablaNombreAsignaturas = cargarFicheroTexto();
        NumAlumCalif[] tablaCalif = new NumAlumCalif[12];

        for (int i = 0; i < tablaCalif.length; i++) {
            tablaCalif[i] = new NumAlumCalif();
        }

        procesarCalificaciones(tablaAlumnosNotas, tablaCalif);
        imprimirCalificaciones(tablaCalif, tablaNombreAsignaturas);
    }

    private static void procesarCalificaciones(ConjuntoAlumnos tablaAlumnosNotas, NumAlumCalif[] tablaCalif) {
        for (Alumno a : tablaAlumnosNotas.getLista()) {
            for (CalificacionAsignatura ca : a.getNotas()) {
                if (ca.getCalificacion() >= 9) {
                    tablaCalif[ca.getCodigo() - 1].addSobresaliente();
                }
                else if (ca.getCalificacion() >= 7 && ca.getCalificacion() < 9) {
                    tablaCalif[ca.getCodigo() - 1].addNotable();
                }
                else if (ca.getCalificacion() >= 5 && ca.getCalificacion() < 7) {
                    tablaCalif[ca.getCodigo() - 1].addAprobado();
                }
                else {
                    tablaCalif[ca.getCodigo() - 1].addSuspenso();
                }
            }
        }
    }

    private static void imprimirCalificaciones(NumAlumCalif[] tablaCalif, Asignatura[] tablaNombreAsignaturas) {
        for (Asignatura a : tablaNombreAsignaturas) {
            System.out.print("\n" + a.getNombre() + " (código " + a.getCodigo() + ") -> ");
            System.out.print(tablaCalif[a.getCodigo() - 1]);
        }
    }

    private static Asignatura[] cargarFicheroTexto() {
        FileInputStream in;
        Scanner sc;
        Asignatura[] asignaturas = new Asignatura[0];

        try {
            in = new FileInputStream("src/Tema11/Práctica/asignaturas.txt");
            sc = new Scanner(in);

            while (sc.hasNextLine()) {
                String[] linea = sc.nextLine().split("\s\s\s");
                asignaturas = Arrays.copyOf(asignaturas, asignaturas.length + 1);
                asignaturas[asignaturas.length - 1] = new Asignatura(Integer.parseInt(linea[0]), linea[1]);
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        Arrays.sort(asignaturas);
        return asignaturas;
    }

    private static ConjuntoAlumnos cargarFicheroBinario() {
        ConjuntoAlumnos alumnos = new ConjuntoAlumnos();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/Tema11/Práctica/alumnos.dat"))) {
            while (true) {
                alumnos.insertarAlumno((Alumno) in.readObject());
            }
        }
        catch (EOFException ex) {
            System.out.println("Fin de fichero");
        }
        catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return alumnos;
    }

    private static void guardarFicheroBinario(ConjuntoAlumnos lista) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/Tema11/Práctica/alumnos.dat"))) {
            for (Object elemento : lista.getLista()) {
                out.writeObject(elemento);
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
