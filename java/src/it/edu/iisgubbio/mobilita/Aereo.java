package it.edu.iisgubbio.mobilita;

public class Aereo extends Volante {
	private boolean reazione;
	private int distanzaMassima;
	
	public Aereo(String nome) {
		setNome(nome);
	}

	@Override
	public String toString() {
		return "Aereo : " + nome + ", percorrenza massima" + distanzaMassima+" km";
	}

	public boolean puoRaggiungere(int distanza) {
		boolean risposta;
		if (distanza<distanzaMassima) {
			risposta=true;
		}else {
			risposta=false;
		}
		return risposta;
	}
	
	public boolean isReazione() {
		return reazione;
	}

	public void setReazione(boolean reazione) {
		this.reazione = reazione;
	}

	public int getDistanzaMassima() {
		return distanzaMassima;
	}

	public void setDistanzaMassima(int distanzaMassima) {
		this.distanzaMassima = distanzaMassima;
	}
	
	
	
	
}
