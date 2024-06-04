package it.edu.iisgubbio.vivaio;

public class Fiore extends Pianta{
	private String colore;
	private int stagioneFioritura;

	public Fiore(String n, double c, String colore, String s) {
		super(n, c);
		this.colore = colore;
		setStagioneFioritura(s);
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getStagioneFioritura() {
		String s = "";
		switch (stagioneFioritura) {
		case 1:
			s="Primavera";
			break;

		case 2:
			s="Estate";
			break;

		case 3:
			s="Autunno";
			break;

		case 4:
			s="Inverno";
			break;
		}
		return s;
	}

	public void setStagioneFioritura(String s) {
		switch (s) {
		case "Primavera":
			stagioneFioritura=1;
			break;

		case"Estate":
			stagioneFioritura=2;
			break;

		case "Autunno":
			stagioneFioritura=3;
			break;

		case "Inverno":
			stagioneFioritura=4;
			break;
		}
	}
}