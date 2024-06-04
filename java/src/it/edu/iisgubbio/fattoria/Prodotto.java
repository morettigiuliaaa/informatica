package it.edu.iisgubbio.fattoria;

public class Prodotto {
	protected String nome;
	protected double prezzoAlKG;
	
	public Prodotto(String nome, double prezzoAlKG) {
		this.nome = nome;
		this.prezzoAlKG = prezzoAlKG;
	}

	public Prodotto() {
		super();
	}

	public double calcolaPrezzo(double peso) {
		return peso*prezzoAlKG;
	}
	
	@Override
	public String toString() {
		return "Nome del prodotto = " + nome + " , prezzo Al Kg = € " + prezzoAlKG;
	}
}