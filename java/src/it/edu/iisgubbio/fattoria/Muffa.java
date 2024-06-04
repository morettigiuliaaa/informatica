package it.edu.iisgubbio.fattoria;

public class Muffa extends Formaggio{
	protected String Muffa;
	protected boolean postoMuffaInterna;
	
	public Muffa(String nome, double prezzoAlKG, String muffa) {
		super( nome, prezzoAlKG, 0 );
		this.Muffa = muffa;
		this.postoMuffaInterna = true;
	}

	@Override
	public String toString() {
		return super.toString()+", il nome della muffa è "+Muffa+" e la muffa si trova dentro";
	}

	public String getMuffa() {
		return Muffa;
	}

	public void setMuffa(String muffa) {
		Muffa = muffa;
	}

	public boolean isPostoMuffaInterna() {
		return postoMuffaInterna;
	}

	public void setPostoMuffaInterna(boolean postoMuffaInterna) {
		this.postoMuffaInterna = postoMuffaInterna;
	}
}