package Tema3.Act_Propuestas;

public class Act_Clase_09_20211019 {
	
	// Dibuja un triangulo hueco

	public static void main(String[] args) {

		int i, j, num = 4;
		
		for (i=0; i<num; i++) {
			for (j=1; j<=num-i; j++) {
				if (!(i==1 && j==2)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println("");
		}

	}

}
