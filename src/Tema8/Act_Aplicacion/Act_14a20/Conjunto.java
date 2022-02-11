package Tema8.Act_Aplicacion.Act_14a20;

/* EJERCICIO 8.19
 * Un conjunto es un objeto similar a las listas, capaz de guardar valores de un tipo determinado, con la diferencia de
 * que sus elementos no pueden estar repetidos. Escribe la clase Conjunto para enteros heredando de Lista y
 * reimplementando los métodos de inserción para evitar las repeticiones.
 */
/* EJERCICIO 8.20
 * Implementa el método equals() en la clase Conjunto. Dos conjuntos se consideran iguales si tienen los mismos
 * elementos, no importa en qué orden.
 */
public class Conjunto extends ListaNueva {
    @Override
    public void insertarPrincipio(Integer nuevo) {
        if (this.buscar(nuevo) == -1) {
            super.insertarPrincipio(nuevo);
        }
    }

    @Override
    public void insertarFinal(Integer nuevo) {
        if (this.buscar(nuevo) == -1) {
            super.insertarFinal(nuevo);
        }
    }

    @Override
    public void insertarFinal(ListaNueva otraLista) {
        //???
    }

    @Override
    public void insertar(int posicion, Integer nuevo) {
        if (this.buscar(nuevo) == -1) {
            super.insertar(posicion, nuevo);
        }
    }

    @Override
    public boolean equals(Object o) {
        boolean iguales;
        int i, j, coincidencias = 0;

        if (this == o) { //si coinciden las referencias de memoria
            iguales = true;
        } else if (o == null || this.getClass() != o.getClass()) { //si el otro es nulo o no son de la misma clase
            iguales = false;
        } else {
            Conjunto otro = (Conjunto) o;

            for (i = 0; i < this.tabla.length; i++) { //los elementos no tienen por qué estar en la misma posición
                for (j = 0; i < otro.tabla.length; i++) {
                    if (this.tabla[i] == otro.tabla[j]) {
                        coincidencias++;
                    }
                }
            }

            iguales = coincidencias >= this.tabla.length; //si no hemos visto menos coincidencias que el tamaño, serán iguales
            //iguales = Arrays.equals(tabla, otro.tabla);
        }
        return iguales;
    }
}
