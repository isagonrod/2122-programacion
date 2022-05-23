package Tema12.Anexo.Act_10;

/* ACTIVIDAD 10 DEL ANEXO
 * La sección de Listas de Bodas de unos grandes almacenes gestiona la información de sus clientes mediante una lista.
 * Cada elemento de esta lista representa una boda y contiene los datos de la misma, incluyendo una lista con los regalos
 * elegidos por los novios.
 * Las especificaciones de las clases involucradas en el problema son las siguientes:
 *  - Lista de Novios --> Es una lista de objetos de la clase Novios
 *  - Novios:
 *      - Atributos:    String códigoBoda --> código asignado a la boda
 *                      String nombreNovio --> nombre del novio
 *                      String nombreNovia --> nombre de la novia
 *                      String domicilio --> domicilio de envío de los regalos
 *                      List<Regalo> regalos --> lista de regalos
 *      - Operaciones:  func getCodigo() --> dev(String nom)
 *                      func getNombreNovio() --> dev(String nom)
 *                      func getNombreNovia() --> dev(String nom)
 *                      func getDomicilio() --> dev(String d)
 *                      func getListaRegalos() --> dev(ir: Lista de regalos) Lista de regalos
 *  - Regalo:
 *      - Atributos:    Integer codigo --> código del regalo
 *                      String descripcion --> descripción del regalo
 *                      Double precio --> precio del regalo
 *                      Boolean disponible --> true si está disponible, false si ya fue comprado
 *      - Operaciones:  func getCodigo() --> dev(Integer cod)
 *                      func getDescripcion() --> dev(String des)
 *                      func getPrecio() --> dev(Double p)
 *                      func getDisponible() --> dev(Boolean v)
 *
 * Crear las interfaces y clases necesarias para la aplicación que deberá resolver los siguientes puntos.
 * Para ello debe basarse en las interfaces y clases generadas en el ejercicio 6 de este mismo boletín.
 * Los ejercicios 1 a 7 se resolverán en una clase de prueba una vez construidas las clases e interfaces:
 *  - Para tratar bodas y regalos:
 *      - INovios
 *      - Novios
 *      - IRegalos
 *      - Regalos
 *  - Implementando IExpLogica:
 *      - ExpCodigoBoda --> Excepción
 *      - ExpCodigoRegalo --> Excepción
 *      - ExpNombre --> Excepción
 *      - ExpDisponible --> Excepción
 *  - Implementando IExpReal: ExpPrecio --> Excepción
 *  - Implementando Comparator: CompPrecioRegalo
 *  - Implementando IExpReal: ExpValorBodaCondicion --> Esta clase sumará el valor de todos los regalos de una boda que
 *                                                      cumplen una expresión apoyándose en la clase Colecciones y en
 *                                                      ExpPrecio y ExpCierta
 *
 * -- MENÚ DE OPCIONES --
 *  1) Listado de todas las bodas en un formato estándar.
 *  2) Listado de la lista de regalos de una boda dado su número de orden en la lista de bodas.
 *  3) Listado de una boda dado el nombre del novio o de la novia.
 *  4) Informar si un regalo está disponible dado el código de la boda y el regalo.
 *  5) Suma total de regalos de una boda. Implemente este apartado en tres versiones:
 *      a) Con un recorrido basado en dos iteradores anidados.
 *      b) Con un solo iterador y basándose en el método suma (ejercicio 6.4) de la clase Colecciones.
 *      c) Apoyándose en la clase Colecciones (ejercicio 6) y la clase ExpValorBodaCondicion.
 *  6) Suma total de regalos disponibles de una boda. Hay tres soluciones posibles como en el apartado anterior.
 *  7) Lista de regalos disponibles ordenados por precio.
 */

import Utilidades.Teclado;

import java.util.*;

public class Principal_Bodas {
    public static void main(String[] args) {
        List<Novios> bodas = rellenarBodas();
        int opc;

        do {
            menu();
            opc = Teclado.leerOpcion(1, 8);
            switch (opc) {
                case 1 -> System.out.println(bodas);
                case 2 -> System.out.println(bodas.get(Teclado.getNumber("Introducir número de la boda en la lista: ")).getRegalos());
                case 3 -> listarRegalosSegunNombreNovios(bodas);
                case 4 -> informarDisponibilidadRegaloSegunCodigos(bodas);
                case 5 -> {
					System.out.print("Suma total de regalos: ");
					sumarRegalosDeBoda(bodas, opc, false);
				}
                case 6 -> {
					System.out.print("Suma total de regalos disponibles: ");
					sumarRegalosDeBoda(bodas, opc, true);
				}
                case 7 -> listarRegalosDisponiblesPorPrecio(bodas);
                case 8 -> System.out.println("¡Adiós!");
            }
        } while (opc != 8);
    }

    static void sumarRegalosDeBoda(List<Novios> bodas, int opc, boolean soloDisponibles) {
		Integer resultado = 0;
		Iterator<Novios> it1 = bodas.iterator();
		Iterator<Regalo> it2;

		while(it1.hasNext()) {
			it2 = it1.next().getRegalos().iterator();
			while (it2.hasNext()) {
				Regalo regalo = it2.next();
				if (!soloDisponibles || regalo.getDisponible()) {
					resultado++;
				}
			}
		}

		System.out.println("Hay " + resultado + " regalos");
    }

    static void listarRegalosDisponiblesPorPrecio(List<Novios> bodas) {
        Set<Regalo> regalosDisponibles = new TreeSet<>(new CompPrecioRegalo());

        for(Novios novios : bodas) {
            for (Regalo regalo : novios.getRegalos()) {
                if (regalo.getDisponible()) {
                    regalosDisponibles.add(regalo);
                }
            }
        }

        System.out.println(regalosDisponibles);
    }

    static void informarDisponibilidadRegaloSegunCodigos(List<Novios> bodas) {
        String codigoBoda = Teclado.getString("Introducir código de la boda: ");
        Integer codigoRegalo = Teclado.getNumber("Introducir código del regalo: ");
        for(Novios novios : bodas) {
            if (novios.getCodigoBoda().compareTo(codigoBoda) == 0) {
                for (Regalo regalo : novios.getRegalos()) {
                    if (regalo.getCodigo().equals(codigoRegalo)) {
                        System.out.println("El regalo " + codigoRegalo + (regalo.getDisponible() ? "SI" : "NO") + " está disponible.");
                    }
                }
            }
        }
    }

    static void listarRegalosSegunNombreNovios(List<Novios> bodas) {
        String nombre = Teclado.getString("Introducir nombre de alguno de los novios: ");
        for(Novios novios : bodas) {
            if (novios.getNombreNovio().compareTo(nombre) == 0 || novios.getNombreNovia().compareTo(nombre) == 0) {
                System.out.println(novios.getRegalos());
            }
        }
    }

    static List<Novios> rellenarBodas() {
        List<Novios> bodas = new ArrayList<>();

        bodas.add(new Novios("Boda_1", "Ramiro Gómez", "Verónica Sánchez", "Sevilla"));
        bodas.get(0).getRegalos().add(new Regalo(1, "Vajilla completa", 200.0, true));
        bodas.get(0).getRegalos().add(new Regalo(2, "Aspiradora sin cables", 150.95, true));
        bodas.get(0).getRegalos().add(new Regalo(3, "Robot de cocina", 500.0, true));
        bodas.get(0).getRegalos().add(new Regalo(4, "Cubertería de 113 piezas", 999.99, true));

		bodas.add(new Novios("Boda_2", "Leonardo Cabriani", "Emma Limone", "Praga"));
        bodas.get(1).getRegalos().add(new Regalo(5, "Smart TV 100 pulgadas", 3000.84, true));
        bodas.get(1).getRegalos().add(new Regalo(6, "Sofá chaise longue de 5 plazas", 1500.00, false));
        bodas.get(1).getRegalos().add(new Regalo(7, "Juego de toallas de algodón", 150.66, false));
        bodas.get(1).getRegalos().add(new Regalo(8, "Lavadora", 95.30, true));
		bodas.get(1).getRegalos().add(new Regalo(9, "Secadora", 116.58, false));

        return bodas;
    }

    static void menu() {
        System.out.println("\n-- MENÚ DE OPCIONES --");
        System.out.println("1. Listado de todas las bodas en un formato estándar");
        System.out.println("2. Listado de la lista de regalos de una boda dado su número de orden en la lista de bodas");
        System.out.println("3. Listado de una boda dado el nombre del novio o de la novia");
        System.out.println("4. Informar si un regalo está disponible dado el código de la boda y el regalo");
        System.out.println("5. Suma total de regalos de una boda");
        System.out.println("6. Suma total de regalos disponibles de una boda");
        System.out.println("7. Lista de regalos disponibles ordenados por precio");
        System.out.println("8. Salir\n");
    }
}
