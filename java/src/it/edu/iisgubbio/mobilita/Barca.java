package it.edu.iisgubbio.mobilita;

public class Barca extends AMuscoli {
	private int numeroDiRemi;
	private boolean singoloRemo;
	
	public Barca(String nome, double costo,int numeroDiRemi, boolean singoloRemo) {
		super(nome,costo,"bicipiti");
		this.nome = nome;
		this.costo = costo;
		this.numeroDiRemi = numeroDiRemi;
		this.singoloRemo = singoloRemo;
	}

	public int numeroVogatori() {
		int numeroVogatori;
		if ( singoloRemo ) {
			numeroVogatori = numeroDiRemi;
		}else {
			numeroVogatori=numeroDiRemi/2;
		}
		return numeroVogatori;
	}

	public int getNumeroDiRemi() {
		return numeroDiRemi;
	}

	public boolean isSingoloRemo() {
		return singoloRemo;
	}

	@Override
	public String toString() {
		return "Barca : "+nome+" con "+numeroDiRemi+" remi"+" [ "+numeroVogatori()+" per vogatore ] ";
	}

	
}
