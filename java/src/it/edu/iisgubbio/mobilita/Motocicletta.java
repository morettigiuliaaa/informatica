package it.edu.iisgubbio.mobilita;

public class Motocicletta extends Terrestre {
	private int cilindrata;
	private int numeroPosti;
	
	public Motocicletta(String nome, int cilindrata, int numeroPosti) {
		super();
		this.nome = nome;
		this.cilindrata = cilindrata;
		this.numeroPosti = numeroPosti;
	}

	public double getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}

	public boolean personeDaTrasportare(int persone) {
		boolean trasporto;
		if (persone>numeroPosti) {
			trasporto=false;
		}else {
			trasporto=true;
		}
		return trasporto;
	}

	@Override
	public String toString() {
		return "Motocicletta : "+nome;
	}
	
}
