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
 *      - ExpCodigoBoda
 *      - ExpCodigoRegalo
 *      - ExpNombre
 *      - ExpDisponible
 *  - Implementando IExpReal: ExpPrecio
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

public class Principal_Bodas {
    public static void main(String[] args) {

    }

    static void menu() {
        System.out.println("\n-- MENÚ DE OPCIONES --");
        System.out.println("1. Listado de todas las bodas en un formato estándar");
        System.out.println("2. Listado de la lista de regalos de una boda dado su número de orden en la lista de bodas");
        System.out.println("3. Listado de una boda dado el nombre del novio o de la novia");
        System.out.println("4. Informar si un regalo está disponible dado el código de la boda y el regalo");
        System.out.println("5. Suma total de regalos de una boda");
        System.out.println("\t5.1. Con un recorrido basado en dos iteradores anidados");
        System.out.println("\t5.2. Con un solo iterador y basándose en el método suma de la clase Colecciones");
        System.out.println("\t5.3. Apoyándose en la clase Colecciones y la clase ExpValorBodaCondicion");
        System.out.println("6. Suma total de regalos disponibles de una boda");
        System.out.println("\t6.1. Con un recorrido basado en dos iteradores anidados");
        System.out.println("\t6.2. Con un solo iterador y basándose en el método suma de la clase Colecciones");
        System.out.println("\t6.3. Apoyándose en la clase Colecciones y la clase ExpValorBodaCondicion");
        System.out.println("7. Lista de regalos disponibles ordenados por precio");
        System.out.println("8. Salir");
    }
}
