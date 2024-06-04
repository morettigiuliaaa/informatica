package it.edu.iisgubbio.mobilita;

public class Terrestre extends AMotore {
	private double velocita;

	public Terrestre() {
		super();
	}

	public double getVelocita() {
		return velocita;
	}

	public void setVelocita(double velocita) {
		this.velocita = velocita;
	}

	public double tempoDiPercorrenza(int distanza) {
		double tempo;
		tempo=distanza/velocita;
		return tempo;
	}
	
	@Override
	public String toString() {
		return "Veicolo terrestre a motore: "+getNome()+", va a "+getCarburante()+" e al massimo percorre "+velocita+"KM/h in un ora";
	}
}