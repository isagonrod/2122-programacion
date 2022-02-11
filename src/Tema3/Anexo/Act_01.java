package Tema3.Anexo;

public class Act_01 {

	public static void main(String[] args) {

		int i;
		System.out.println("Los multiplos de 5 entre 0 y 100 son: ");
		
		for (i=1; i < 100; i++) {
			if (i%5==0) {
				System.out.println(i);
			}
		}
	}
}
