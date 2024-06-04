package it.edu.iisgubbio.mobilita;

public class Deltaplano extends Volante{
	private int numeroPosti;

	public Deltaplano(String nome, double costo, int numeroPosti) {
		setNome(nome);
		setCosto(costo);
		this.numeroPosti = numeroPosti;
	}

	public boolean accettaPasseggero() {
		boolean passeggero;
		if ( numeroPosti>=2 ) {
			passeggero = true;
		}else{
			passeggero= false;
		}
		return passeggero;
	}
	
	@Override
	public String toString() {
		if (accettaPasseggero()) {
			return "Deltaplano : multiposto ( 2 posti o più )";
		}else {
			return "Deltaplano : monoposto";
		}
	}

	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}
	
	
}
