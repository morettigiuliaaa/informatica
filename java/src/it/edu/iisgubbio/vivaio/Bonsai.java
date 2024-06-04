package it.edu.iisgubbio.vivaio;

public class Bonsai extends Pianta{
	private int eta;
	
	public Bonsai(String n, double c, int eta) {
		super(n, c);
		this.eta = eta;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public boolean vecchio() {
		boolean vecchio=false;
		if (eta>30) {
			vecchio=true;
		}else {
			vecchio=false;
		}
		return vecchio;
	}
	@Override
	public String toString() {
		return "Bonsai [prezzo = "+getCosto()+"]";
	}
}