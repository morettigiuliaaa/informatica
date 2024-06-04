package it.edu.iisgubbio.mobilita;


public class Motoslitta extends Terrestre {
	private double temperaturaMinima;

	public Motoslitta(String nome,double costo,double velocità) {
		super();
		setNome(nome);
		setCosto(costo);
		setVelocita(velocità);
	}

	public double getTemperaturaMinima() {
		return temperaturaMinima;
	}

	public void setTemperaturaMinima(double temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}
	
	public boolean puoFunzionare(int temp) {
		return temp<temperaturaMinima;
	}

	@Override
	public String toString() {
		return "Motoslitta: "+nome+" ,funziona a -"+temperaturaMinima+" C";
	}
	
	
}
