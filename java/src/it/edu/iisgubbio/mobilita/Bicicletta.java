package it.edu.iisgubbio.mobilita;

public class Bicicletta extends AMuscoli{
	private int numeroDiRapporti;
	private double peso;
	boolean leggerezza;
	
	public Bicicletta(double costo, double peso) {
		super("Bicicletta",costo,"quadricipiti");
		this.peso = peso;
	}

	public boolean leggera() {
		if ( peso < 10) {
			leggerezza = true;
		}else {
			leggerezza = false;
		}
		return leggerezza;
	}
	
	@Override
	public String toString() {
		if (leggerezza) {
			return "Bicicletta: pesa "+ peso +"Kg"+"(leggera) costa "+costo+"€ ( ha "+numeroDiRapporti+" rapporti )";
		}else {
			return "Bicicletta: pesa "+ peso +"Kg"+" costa "+costo+"€ ( ha "+numeroDiRapporti+" rapporti )";
		}
	}

	public int getNumeroDiRapporti() {
		return numeroDiRapporti;
	}

	public void setNumeroDiRapporti(int numeroDiRapporti) {
		this.numeroDiRapporti = numeroDiRapporti;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
