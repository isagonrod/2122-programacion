package Tema1.Act_Resueltas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Act_11 {

	public static void main(String[] args) {

	Scanner teclado = new Scanner (System.in);
	
	int pera1Sem; int pera2Sem;
	System.out.println("Kilos de peras vendidos en primer semestre: ");
	pera1Sem = teclado.nextInt();
	System.out.println("Kilos de peras vendidos en segundo semestre: ");
	pera2Sem = teclado.nextInt();
	
	int manzana1Sem; int manzana2Sem;
	System.out.println("Kilos de manzanas vendidos en primer semestre: ");
	manzana1Sem = teclado.nextInt();
	System.out.println("Kilos de manzanas vendidos en segundo semestre: ");
	manzana2Sem = teclado.nextInt();
	
	final double PRECIO_PERA = 1.95;
	final double PRECIO_MANZANA = 2.35;
	
	DecimalFormat formatter = new DecimalFormat ("0.00");
	
	double benefpera = (pera1Sem + pera2Sem) * PRECIO_PERA;
	double benefmanzana = (manzana1Sem + manzana2Sem) * PRECIO_MANZANA;
	
	System.out.println("Beneficios anuales de la venta de peras: " + formatter.format(benefpera) + "€");
	System.out.println("Beneficios anuales de la venta de manzanas: " + formatter.format(benefmanzana) + "€");
	
	double benefAnual = (benefpera + benefmanzana);
	System.out.println("El beneficio anual de la venta de peras y manzanas es de " + benefAnual + "€");
		
	}

}
