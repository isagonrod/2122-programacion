package Tema3.Act_Propuestas;

import java.util.Scanner;

public class Act_Clase_18 {
	
	// Dibujar un rombo vacio dentro de un cuadrado lleno

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int alturaSolicitada, alturaPorTriangulo, fila, columna, espacio, espacioPorFila;

		do {
			System.out.println("Introduce la altura de la figura: ");
			alturaSolicitada = sc.nextInt();
		} while (alturaSolicitada % 2 == 0);

		alturaPorTriangulo = (alturaSolicitada - 1) / 2; // altura de los triangulos pares (sin la primera linea)

		for (columna = 1; columna <= alturaSolicitada; columna++) { // primera fila de asteriscos (llena)
			System.out.print("*");
		}

		System.out.println("");

		espacioPorFila = 1; // contamos los espacios a dibujar por cada fila, empezamos por 1 en la mitad superior
		for (fila = 1; fila <= alturaPorTriangulo; fila++) { // dibujo de cada fila en la mitad superior
			for (columna = fila; columna <= alturaPorTriangulo; columna++) { // dibujo del primer triangulo
				System.out.print("*");
			}

			for (espacio = 1; espacio <= espacioPorFila; espacio++) { // dibujo de los espacios entre triangulos
				System.out.print(" ");
			}
			espacioPorFila += 2; // para la siguiente fila seran 2 espacios mas (se incrementan a pares)

			for (columna = fila; columna <= alturaPorTriangulo; columna++) { // dibujo del segundo triangulo
				System.out.print("*");
			}

			System.out.println(""); // dibujo del salto de linea para la siguiente fila
		}

		// calculamos los espacios a dibujar desde la mitad (para 15, 13 en la mitad, 11 en fila siguiente que es la que nos interesa)
		espacioPorFila = alturaSolicitada - 4;

		for (fila = alturaPorTriangulo-1; fila >= 1; fila--) { // dibujo de cada fila en la mitad inferior
			for (columna = alturaPorTriangulo - fila; columna >= 0; columna--) { // dibujo del tercer triangulo
				System.out.print("*");
			}

			for (espacio = 1; espacio <= espacioPorFila; espacio++) { // dibujo de los espacios entre triangulos
				System.out.print(" ");
			}
			espacioPorFila -= 2; // para la siguiente fila seran 2 espacios menos (se decrementan a pares)

			for (columna = alturaPorTriangulo - fila; columna >= 0; columna--) { // dibujo del cuarto triangulo
				System.out.print("*");
			}

			System.out.println(""); // dibujo del salto de linea para la siguiente fila
		}

		for (columna = 1; columna <= alturaSolicitada; columna++) { // ultima fila de asteriscos (llena)
			System.out.print("*");
		}
	}
}