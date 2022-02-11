package Tema3.Act_Resueltas;

public class Act_10 {

	public static void main(String[] args) {
		
		int i, impar, suma=0;

		for (i = 1; i <= 10; i++) {
			impar = 2 * i - 1;
			suma += impar;
		}
		System.out.println("La suma de los diez primeros numeros impares es: " + suma);
		// El resultado deberia ser 100
	}
}
