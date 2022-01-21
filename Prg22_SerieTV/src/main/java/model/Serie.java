package model;

public class Serie {
	private String titolo;
	private String genere;
	
	public Serie() {}

	public Serie(String titolo) {
		super();
		this.titolo = titolo;
		this.genere = "drama";
	}
	
	public Serie(String titolo, String genere) {
		super();
		this.titolo = titolo;
		this.genere = genere;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Serie [titolo=" + titolo + "]";
	}
}
