package Tema7.Act_Resueltas.Act_10;

/* Hemos recibido el encargo de un cliente para definir los paquetes y las clases necesarias (solo implementar los
 * atributos y los constructores) para gestionar una empresa ferroviaria, en la que se distinguen dos grandes grupos:
 * el personal y la maquinaria.
 * En el primero se ubican los empleados de la empresa, que se clasifican en tres grupos: los maquinistas, los mecánicos
 * y los jefes de estación. De cada uno de ellos es necesario guardar:
 *      - Maquinistas: su nombre, DNI, sueldo y el rango que tienen adquirido.
 *      - Mecánicos: su nombre, teléfono (para contactar en caso de urgencia) y en qué especialidad desarrollan su
 *          trabajo (esta puede ser: frenos, hidráulica, electricidad o motor).
 *      - Jefes de estación: su nombre, DNI y la fecha en la que fue nombrado jefe de estación.
 * En la parte de maquinaria podemos encontrar trenes, locomotoras y vagones. De cada uno de ellos hay que considerar:
 *      - Vagones: tienen un número que los identifica, una carga máxima (en kilos), la carga actual y el tipo de
 *          mercancía con el que están cargados.
 *      - Locomotoras: disponen de una matrícula (que las identifica), la potencia de sus motores y una antigüedad
 *          (año de fabricación). Además, cada locomotora tiene asignado un mecánico que se encarga de su mantenimiento.
 *      - Trenes: están formados por una locomotora y un máximo de 5 vagones. Cada tren tiene asignado un maquinista
 *          que es responsable de él.
 * Todas las clases que corresponden al personal (Maquinista, Mecanico y JefeEstacion) serán de uso público.
 * Entre las clases relativas a la maquinaria, solo será posible construir, desde clases externas, objetos de tipo
 * Tren y de tipo Locomotora.
 * La clase Vagon será solo visible por sus clases vecinas.
 */

import Tema7.Act_Resueltas.Act_10.Maquinaria.Locomotora;
import Tema7.Act_Resueltas.Act_10.Maquinaria.Tren;
import Tema7.Act_Resueltas.Act_10.Personal.Especialidad;
import Tema7.Act_Resueltas.Act_10.Personal.JefeEstacion;
import Tema7.Act_Resueltas.Act_10.Personal.Maquinista;
import Tema7.Act_Resueltas.Act_10.Personal.Mecanico;

import java.util.Date;

public class PP10 {
    public static void main (String[] args) {
        Mecanico mec1 = new Mecanico("Capullo", "000000000", Especialidad.ELECTRICIDAD.name());
        Maquinista maq1 = new Maquinista("Otro capullo", "111111111", 80000, "Tonto listo");
        JefeEstacion je1 = new JefeEstacion("Mas capullo", "222222222", new Date());

        Locomotora loco1 = new Locomotora("aa000", 80,1986, mec1);
        Tren tren1 = new Tren(loco1, maq1);
        tren1.enganchaVagon(4000, 2500, "Pollas de goma");
        tren1.enganchaVagon(4000, 800, "Chochos de goma");
        tren1.enganchaVagon(4000, 3500, "Culos de mentira");

        System.out.println(tren1.toString());
        System.out.println(mec1.toString());
        System.out.println(je1.toString());
    }
}
