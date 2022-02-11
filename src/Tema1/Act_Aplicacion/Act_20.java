package Tema1.Act_Aplicacion;

public class Act_20 {

	public static void main(String[] args) {
		
		java.util.Scanner teclado = new java.util.Scanner(System.in).useLocale(java.util.Locale.US);
		
		System.out.println("Introduce un numero: ");
		double num = teclado.nextDouble();
		
		double raiz = java.lang.Math.sqrt(num);
		System.out.println("La raiz cuadrada de " + num + " es " + raiz);

	}

}
