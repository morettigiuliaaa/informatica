package it.edu.iisgubbio.vivaio;

public class Pianta {
	private String nome;
	private double costo;
	
	public String getNome() {
		return nome;
	}

	public double getCosto() {
		return costo;
	}
	
	public Pianta(String n, double c) {
		this.nome=n;
		this.costo=c;
	}

	@Override
	public String toString() {
		return "Pianta [nome =" + nome + ", costo =" + costo + "]";
	}
}
