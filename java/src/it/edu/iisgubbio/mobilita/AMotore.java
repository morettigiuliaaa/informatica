package it.edu.iisgubbio.mobilita;

public class AMotore extends MezzoDiTrasporto{
	private double rumorosita;
	private String carburante;
	
	public AMotore() {
		super();
	}
	public AMotore(String nome,double costo, double rumorosita, String carburante) {
		super(nome,costo);
		this.rumorosita = rumorosita;
		this.carburante = carburante;
	}
	
	public boolean possibileCentriAbitati() {
		boolean ammesso;
		if (rumorosita<68) {
			ammesso=true;
		}else {
			ammesso= false;
		}
		return ammesso;
	}
	
	@Override
	public String toString() {
		return "Mezzo motorizzato : "+nome+" ("+costo+"€) che emette "+rumorosita+" db di rumore"+", "+"consuma "+carburante;
	}
	
	public double getRumorosita() {
		return rumorosita;
	}
	public void setRumorosita(double rumorosita) {
		this.rumorosita = rumorosita;
	}
	public String getCarburante() {
		return carburante;
	}
	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}

}
