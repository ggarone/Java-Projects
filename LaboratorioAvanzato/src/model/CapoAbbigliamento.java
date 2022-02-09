package model;

public abstract class CapoAbbigliamento {
	protected static int counter = 1;
	
	protected int codArt;
	protected String descrizione;
	protected Taglia taglia;
	protected String sigla;
	
	public CapoAbbigliamento() {
		super();
		this.codArt = counter++;
	}
	
	public int getCodArt() {
		return codArt;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public Taglia getTaglia() {
		return taglia;
	}

	@Override
	public String toString() {
		return sigla + " - " + descrizione + ", taglia: " + taglia + "(" + taglia.getNumero() + ")]";
	}
	
	
	
	
	
	
	
}
