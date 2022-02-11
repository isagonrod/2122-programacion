package Tema8.Act_Aplicacion.Act_14a20;

public class Conjunto extends ListaNueva {

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
