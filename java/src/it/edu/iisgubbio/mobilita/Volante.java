package it.edu.iisgubbio.mobilita;

public class Volante extends AMotore{
	private double quotaMassima;

	public Volante() {
		super();
	}

	public Volante(String nome, double costo) {
		setNome(nome);
		setCosto(costo);
		this.quotaMassima = 2400;
	}

	@Override
	public String toString() {
		return "Mezzo volante : "+nome+" ( "+costo+"€ ), vola fino a "+quotaMassima+" m di quota";
	}

	public double getQuotaMassima() {
		return quotaMassima;
	}

	public void setQuotaMassima(double quotaMassima) {
		this.quotaMassima = quotaMassima;
	}
	
	public boolean isNecessariaPressurizzazione() {
		boolean risposta;
		if ( quotaMassima>300 ) {
			risposta=true;
		}else {
			risposta=false;
		}
		return risposta;
	}
}
