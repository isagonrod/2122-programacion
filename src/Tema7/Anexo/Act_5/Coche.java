package Tema7.Anexo.Act_5;

/* -- ENUNCIADO --
 * Crea una clase Coche.
 * Se desea almacenar la matrícula de cada coche (4 dígitos y 3 letras), la velocidad máxima que ha alcanzado y
 * el kilometraje que lleva recorrido.
 * Además, de forma general, se desea conocer cuál es la velocidad máxima de todos los coches y la cantidad total de
 * kilómetros recorridos entre todos. Crea un menú de opciones que permita realizar estas operaciones.
 * Clases: Coche, ConjCoche y Principal.
*/
/* -- MODIFICACIÓN --
 * No hacer clase ConjCoche ni menú de opciones.
 */

public class Coche {
    String matricula;
    int vMax;
    int kilometrajeTotal;
    static int vMaxTotal; //no suma, sino la mayor de todos
    static int kilometrajeGlogal; //suma de todos 'kilometrajeTotal'

    public Coche(String matricula) {
        this.matricula = matricula;
    }

    void recorrerKilometros(int km) {
        this.kilometrajeTotal += km;
        this.kilometrajeGlogal += this.kilometrajeTotal;
    }

    void darVelocidad(int velocidad) {
        if (velocidad > vMax) {
            vMax = velocidad;
        }
        if (vMax > vMaxTotal) {
            vMaxTotal = vMax;
        }
    }

    void mostrarCoche() {
        System.out.println("Coche -> [Matrícula: " + this.matricula + ", Velocidad Máxima: " + vMax + "k/h, Kilometraje "
                + "Total: " + kilometrajeTotal + "km]");
    }

    static void mostrarTotal() {
        System.out.println("Velocidad Máxima Total: " + vMaxTotal + "km/h\nKilometraje Total Global: " + kilometrajeGlogal
                + "km");
    }
}
