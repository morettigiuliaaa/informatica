package it.edu.iisgubbio.oggetti.tempo;

public class Orario {
	private int ora;
	private int minuto;
	private int secondo;

	public Orario(int ora, int minuto, int secondo) {
		this.ora = ora;
		this.minuto = minuto;
		this.secondo = secondo;
	}

	public void aggiungiOre(int oraAggiunta) {
		ora+=oraAggiunta;
	}

	public void aggiungiMinuti(int minutiAggiunta) {
		if (minuto+minutiAggiunta>=60) {
			ora++;
			this.minuto=(minuto+minutiAggiunta)-60;
		}
		if (minuto+minutiAggiunta<60) {
			minuto+=minutiAggiunta;
		}
	}

	public void aggiungiSecondi(int secondiAggiunta) {
		if (secondo+secondiAggiunta>=60) {
			aggiungiMinuti(secondo/60);
			this.secondo=(secondo+secondiAggiunta)%60;
		}
		if (secondo+secondiAggiunta<60) {
			secondo+=secondiAggiunta;
		}
	}

	public void OrarioAggiunto(Orario orarioDaAggiungere) {
		aggiungiOre(orarioDaAggiungere.ora);
		aggiungiMinuti(orarioDaAggiungere.minuto);
		aggiungiSecondi(orarioDaAggiungere.secondo);
	}

	public void tic() {
		aggiungiSecondi(1); 
	}


	public String toString() {
		String oraFinale = "";
		if (ora<10) {
			oraFinale += "0"+ora+"";
		}else {
			oraFinale += ora+"";
		}

		oraFinale += ":";

		if (minuto<10) {
			oraFinale += "0"+minuto+"";
		}else {
			oraFinale += minuto+"";
		}

		oraFinale += ":";

		if (secondo<10) {
			oraFinale += "0"+secondo+"";
		}else {
			oraFinale += secondo+"";
		}

		return  oraFinale;
	}

}