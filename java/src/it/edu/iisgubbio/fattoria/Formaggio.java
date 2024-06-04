package it.edu.iisgubbio.fattoria;

public class Formaggio extends Prodotto {
	protected int mesiDiStagionatura;
	protected boolean DOP;
	
	public Formaggio(String nome, double prezzoAlKG, int mesiDiStagionatura, boolean DOP) {
		super(nome, prezzoAlKG);
		this.mesiDiStagionatura = mesiDiStagionatura;
		this.DOP = DOP;
	}
	
	public Formaggio(String nome, double prezzoAlKG, int mesiDiStagionatura) {
		super(nome, prezzoAlKG);
		this.mesiDiStagionatura = mesiDiStagionatura;
		this.DOP = false;
	}

	@Override
	public String toString() {
		if (mesiDiStagionatura>0) {
			if ( DOP ) {
				return super.toString()+" i mesi di stagionatura sono = "+mesiDiStagionatura+ " ed è DOP";
			}else {
				return super.toString()+" i mesi di stagionatura sono = "+mesiDiStagionatura+ " e non è DOP";
			}
		}else {
			if ( DOP ) {
				return super.toString()+" è DOP";
			}else {
				return super.toString()+" non è DOP";
			}
		}
	}

	public int getMesiDiStagionatura() {
		return mesiDiStagionatura;
	}

	public void setMesiDiStagionatura(int mesiDiStagionatura) {
		this.mesiDiStagionatura = mesiDiStagionatura;
	}

	public boolean isDOP() {
		return DOP;
	}

	public void setDOP(boolean dOP) {
		DOP = dOP;
	}
}