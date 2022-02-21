package Proyectos_Menu.Socio;

import Utilidades.Teclado;

public class Principal {
    public static void main (String[] args) {
        ConjuntoSocio asociacion = new ConjuntoSocio();
        int opc;

        do {
            menu();
            opc = Teclado.leerOpcion(1, 9);
            switch (opc) {
                case 1 -> asociacion.altaSocio();
                case 2 -> asociacion.modificarFechaNacimiento(Teclado.getNumber("¿La fecha de nacimiento de qué socio quieres modificar?"));
                case 3 -> System.out.println(asociacion.buscarSocio(Teclado.getNumber("¿A qué socio estás buscando?")));
                case 4 -> asociacion.listadoOrdenadoId();
                case 5 -> asociacion.listadoOrdenadoEdad();
                case 6 -> asociacion.listadoOrdenadoFechaNacimiento();
                case 7 -> asociacion.listadoOrdenadoNombre();
                case 8 -> asociacion.listadoOrdenadoNombreReverse();
                case 9 -> System.out.println("¡Adiós!");
            }
        } while (opc != 9);
    }

    static void menu() {
        System.out.println("--MENÚ DE OPCIONES--");
        System.out.println("1. Nuevo alta de socio");
        System.out.println("2. Modificar la fecha de nacimiento de un socio");
        System.out.println("3. Buscar a un socio por su ID");
        System.out.println("4. Mostrar el listado ordenado de socios por ID");
        System.out.println("5. Mostrar el listado ordenado de socios por EDAD");
        System.out.println("6. Mostrar el listado ordenado de socios por FECHA DE NACIMIENTO");
        System.out.println("7. Mostrar el listado ordenado de socios por NOMBRE (ascendentemente)");
        System.out.println("8. Mostrar el listado ordenado de socios por NOMBRE (descendentemente)");
        System.out.println("9. Salir");
    }
}
