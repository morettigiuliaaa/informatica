package it.edu.iisgubbio.geometria.oggetti;

public class Prova {

	public static void main(String[] args) {
		Cerchio cerchio1 = new Cerchio(5);
		System.out.println("Area = "+cerchio1.calcoloArea());
		
		Cerchio.piGreco = 3.1415;
		System.out.println("Area = "+cerchio1.calcoloArea());
		
		Cerchio cerchio2 = new Cerchio(10);
		System.out.println("Area = "+cerchio2.calcoloArea());
		
	}
}