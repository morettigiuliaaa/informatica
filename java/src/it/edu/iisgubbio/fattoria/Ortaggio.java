package it.edu.iisgubbio.fattoria;

public class Ortaggio extends Prodotto {

	protected boolean biologico;

	public Ortaggio(String nome, double prezzoAlKG, boolean biologico) {
		super(nome, prezzoAlKG);
		this.biologico = biologico;
	}

	@Override
	public String toString() {
		if ( biologico ) {
			return super.toString()+" ed è biologico";
		}else {
			return super.toString()+" e non è biologico";
		}
	}
}