package it.edu.iisgubbio.oggetti.tempo;

public class ProvaOrario {

	public static void main(String[] args) {
		Orario orario = new Orario (13, 02, 19);
		orario.aggiungiOre(5);
		orario.aggiungiMinuti(8);
		orario.aggiungiSecondi(500);
		orario.tic();
		System.out.println(orario);
	}
}
