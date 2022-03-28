package Tema10.Act_Propuestas.Mas;

import java.io.*;
import java.util.Arrays;

public class ConjuntoNombreNumero {
    NombreNumero[] tabla;

    public ConjuntoNombreNumero() {
        this.tabla = new NombreNumero[0];
    }

    // insertarNuevo (NombreNumero obj)
    public void insertarNuevo (NombreNumero nuevo) {
		int posicion = Arrays.binarySearch(this.tabla, nuevo); //buscarNombre(nuevo.nombre);

        if (posicion < 0 || this.tabla.length == 0) {
			//this.tabla = Arrays.copyOf(this.tabla, this.tabla.length + 1);
			//this.tabla[this.tabla.length - 1] = nuevo;

			posicion = Math.abs(posicion) - 1;

			NombreNumero tablaExtendida[] = new NombreNumero[this.tabla.length +1];

			System.arraycopy(this.tabla, 0, tablaExtendida, 0, posicion);	/* copia lo de delante y lo de detrás del hueco nuevo */
			System.arraycopy(this.tabla, posicion, tablaExtendida, posicion + 1, this.tabla.length - posicion);

			tablaExtendida[posicion] = nuevo;
			this.tabla = tablaExtendida;
        }
		else {
			int lengthA = this.tabla[posicion].numero.length;
			int lengthB = nuevo.numero.length;
			this.tabla[posicion].numero = Arrays.copyOf(this.tabla[posicion].numero, lengthA + lengthB);
			System.arraycopy(nuevo.numero, 0, this.tabla[posicion].numero, lengthA, lengthB);
		}
    }

    // int buscarNombre (String nombre) => devuelve la posición
    public int buscarNombre (String nombre) {
        int posicion = -1, i;

        for (i = 0; i < tabla.length; i++) {
            if (this.tabla[i].nombre.equals(nombre)) {
                posicion = i;
            }
        }

        return posicion;
    }

    // leerFichero (String nombreFichero)
    void leerFichero(String nombreFichero) {
        String[] contenido;
		String linea;

        try (BufferedReader in = new BufferedReader(new FileReader("archivos_txt/" + nombreFichero + ".txt"))) {
			linea = in.readLine();
			while(linea != null) {
				contenido = linea.split(", ");
				int[] aux = {Integer.parseInt(contenido[1])};
				this.insertarNuevo(new NombreNumero(contenido[0], aux));
				linea = in.readLine();
			}
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // mostrarTabla()
	public void mostrarTabla() {
		System.out.println(Arrays.deepToString(this.tabla));
	}

    // escribirFichero()
    void escribirFichero() {
        try (BufferedWriter out = new BufferedWriter(new FileWriter("archivos_txt/nombres3.txt"))) {
			for (NombreNumero n : this.tabla) {
				out.write(n.toString());
				out.newLine();
			}
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
