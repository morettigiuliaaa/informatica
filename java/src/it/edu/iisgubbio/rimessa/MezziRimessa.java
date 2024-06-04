package it.edu.iisgubbio.rimessa;
import it.edu.iisgubbio.mobilita.*;

public class MezziRimessa {

	public static void main(String[] args) {
		
		MezzoDiTrasporto shuttle = new MezzoDiTrasporto("Space shuttle",1000000.0);
		System.out.println(shuttle);
		System.out.println("il costo per rata è: "+shuttle.importoRata(400));
		
		AMotore elicottero = new AMotore("Elicottero",50000.0,120,"Gasolio");
		System.out.println(elicottero);
		System.out.println("il veicolo può andare in centro? "+elicottero.possibileCentriAbitati());
	
		AMuscoli quadricipiti = new AMuscoli("Triciclo",150,"quadricipiti");
		System.out.println(quadricipiti);
		System.out.println("i muscoli sono dei muscoli superiori? "+ quadricipiti.parteAlta());
		
		Bicicletta bici = new Bicicletta(340.0,18.0);
		bici.setNumeroDiRapporti(8);
		System.out.println(bici);
		System.out.println("la bici è considerata leggera? "+ bici.leggera());
		
		Skateboard longboard = new Skateboard ("Skateboard", 50, 95);
		System.out.println(longboard);
		
		Terrestre motocarro = new Terrestre();
		motocarro.setNome("Motocarro di Luigi");
		motocarro.setCarburante("gasolio");
		motocarro.setVelocita(104);
		System.out.println(motocarro);
		
		Motocicletta motoguzzi = new Motocicletta("Motoguzzi 345 di giovanni",345,2);
		System.out.println(motoguzzi);
		
		Automobile mini = new Automobile("Mini di Mario",2000,3);
		mini.setTarga("AY 786 H6");
		System.out.println(mini);
		
		Volante elicopter = new Volante("elicopter",12000);
		elicopter.setQuotaMassima(1200);
		System.out.println(elicopter);
		
		Motoslitta motoslitta = new Motoslitta("Motoslitta di Mark",1200,100);
		motoslitta.setTemperaturaMinima(40);
		System.out.println(motoslitta);
		
		Deltaplano deltaplano = new Deltaplano("deltaplano",123,3);
		System.out.println(deltaplano);
	}
}