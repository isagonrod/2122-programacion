package Tema3.Act_Propuestas;

public class Act_Clase_06_20211019 {

	// Ejemplo del CONTINUE (pagina 85)

	public static void main(String[] args) {
		
		int i = 0;
		while (i < 10) {
			i++;
			if (i % 2 == 0) { // si i es par
				continue;
			}
			System.out.println("La i vale " + i);
		}

	}

}
