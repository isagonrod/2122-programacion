package Tema9.Act_Propuestas.Act_02;

/* ACTIVIDAD 9.2
 * Implementa la interfaz ColaDoble en la clase Lista de enteros.
 */

import Tema9.Act_Resueltas.Act_01a04.Cola;

public interface ColaDoble extends Cola {
    void encolarCabeza(Integer nuevo);
    Integer desencolarFinal();
}
