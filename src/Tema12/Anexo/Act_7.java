package Tema12.Anexo;

/* ACTIVIDAD 7 DEL ANEXO
 * Implementa un programa que permita manipular el control de acceso de usuarios de un conjunto de empresas; utiliza un
 * Map<String, HashMap<String, String>>.
 * Los nombres de usuario con sus correspondientes contraseñas deben estar almacenados en una estructura de la clase
 * HashMap, cada clave es un nombre de usuario y cada valor es la contraseña correspondiente.
 * El programa ofrecerá tres opciones de menú:
 *  1) Alta de un usuario en una empresa (introducir el nombre de la empresa y luego el nombre y contraseña de usuario)
 *  2) Listado de usuarios de una empresa.
 *  3) Listado completo.
 *  4) Salir.
 */

import Utilidades.Teclado;

import java.util.HashMap;
import java.util.Map;

public class Act_7 {
    public static void main(String[] args) {
        Map<String, HashMap<String, String>> empresas = new HashMap<>();
        HashMap<String, String> nuevoMapa;
        int opc;

        do {
            menu();
            opc = Teclado.leerOpcion(1, 4);
            switch (opc) {
                case 1 -> {
                    String nombreEmpresa = Teclado.getString("Nombre de la empresa: ");
                    if (!empresas.containsKey(nombreEmpresa)) {
                        String user = Teclado.getString("Usuario: ");
                        String password = Teclado.getString("Contraseña: ");
                        nuevoMapa = new HashMap<>();
                        nuevoMapa.put(user, password);
                        empresas.put(nombreEmpresa, nuevoMapa);
                    } else {
                        nuevoMapa = empresas.get(nombreEmpresa);
                        String user = Teclado.getString("Usuario: ");
                        String password = Teclado.getString("Contraseña: ");
                        nuevoMapa.put(user, password);
                    }
                }
                case 2 -> {
                    String listadoEmpresa = Teclado.getString("Empresa a mostrar: ");
                    if (empresas.containsKey(listadoEmpresa)) {
                        System.out.println("Listado de usuarios de la empresa '" + listadoEmpresa + "': ");
                        System.out.println("\t" + empresas.get(listadoEmpresa));
                    }
                }
                case 3 -> imprimirMapa(empresas); //System.out.println("Listado completo: " + empresas.entrySet());
                case 4 -> System.out.println("¡Adiós!");
            }
        } while (opc != 4);
    }

    static void menu() {
        System.out.println("-- MENÚ DE OPCIONES --");
        System.out.println("1. Alta de un usuario en una empresa");
        System.out.println("2. Listado de usuarios de una empresa");
        System.out.println("3. Listado completo");
        System.out.println("4. Salir");
    }

    static void imprimirMapa(Map<String, HashMap<String, String>> empresas) {
        for (Map.Entry<String, HashMap<String, String>> entry : empresas.entrySet()) {
            System.out.println("Empresa " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
