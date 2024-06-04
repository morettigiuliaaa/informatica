package it.edu.iisgubbio.mobilita;

public class AMuscoli extends MezzoDiTrasporto{
	private String muscoliCoinvolti;

	public AMuscoli() {
		super();
	}

	public AMuscoli(String nome,double costo,String muscoliCoinvolti) {
		super(nome,costo);
		this.muscoliCoinvolti = muscoliCoinvolti;
	}
	
	public boolean parteAlta() {
		boolean muscoliSuperiori;
		if (muscoliCoinvolti.equals("tricipite")||muscoliCoinvolti.equals("petto")||
				muscoliCoinvolti.equals("quadricipiti")||muscoliCoinvolti.equals("trapezio")) {
			muscoliSuperiori = true;
		}else {
			muscoliSuperiori = false;
		}
		return muscoliSuperiori;
	}
	
	@Override
	public String toString() {
		return "Veicolo a muscoli: "+ nome +", "+ costo + "€ ( usa "+muscoliCoinvolti+" )";
	}

	public String getMuscoliCoinvolti() {
		return muscoliCoinvolti;
	}

	public void setMuscoliCoinvolti(String muscoliCoinvolti) {
		if (muscoliCoinvolti.toLowerCase().equals(muscoliCoinvolti)) {
			this.muscoliCoinvolti = muscoliCoinvolti;
		}
	}
}
