package it.edu.iisgubbio.vivaio;

public class Commestibile extends Pianta{
	private int quantita;
	private int stagioneProduzione;
	
	public Commestibile(String n, double c) {
		super(n,c);
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public int getStagioneProduzione() {
		return stagioneProduzione;
	}

	public void setStagioneProduzione(int stagioneProduzione) {
		this.stagioneProduzione = stagioneProduzione;
	}

	@Override
	public String toString() {
		return "Commestibile [quantita=" + quantita + ", stagioneProduzione=" + stagioneProduzione + "]";
	}
}
