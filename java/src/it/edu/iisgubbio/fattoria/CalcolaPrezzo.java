package it.edu.iisgubbio.fattoria;

public class CalcolaPrezzo {

	public static void main(String[] args) {
		Prodotto carne = new Prodotto("Vitello", 5);
		System.out.println(carne);
		System.out.println("prezzo di vendita = € "+carne.calcolaPrezzo(4));
		
		Prodotto carote = new Prodotto("Carote", 2.50 );
		carote.calcolaPrezzo(4);
		System.out.println(carote);
		System.out.println("prezzo di vendita = € "+carote.calcolaPrezzo(4));
		
		Ortaggio pomodoro = new Ortaggio("Pomodoro", 2.50, true );
		pomodoro.calcolaPrezzo(4);
		System.out.println(pomodoro);
		System.out.println("prezzo di vendita = € "+pomodoro.calcolaPrezzo(4));
		
		Formaggio taleggio = new Formaggio("taleggio", 25.0, 1, true );
		taleggio.calcolaPrezzo(4);
		System.out.println(taleggio);
		System.out.println("prezzo di vendita = € "+taleggio.calcolaPrezzo(4));
		
		Formaggio ricotta = new Formaggio("ricotta", 4, 0 );
		ricotta.calcolaPrezzo(4);
		System.out.println(ricotta);
		System.out.println("prezzo di vendita = € "+ricotta.calcolaPrezzo(4));
		
		Muffa gorgo = new Muffa("gorgonzola", 20.0, "penicillium roqueforti" );
		gorgo.calcolaPrezzo(4);
		gorgo.setDOP(true);
		gorgo.setMesiDiStagionatura(3);
		System.out.println(gorgo);
		System.out.println("prezzo di vendita = € "+gorgo.calcolaPrezzo(4));
	}
}