package model;

public class Canzone {
	private int id;
	private String titolo;
	private Cantante cantante;
	private String genere;
	private int anno;
	
	public Canzone(int id, String titolo, Cantante cantante, String genere, int anno) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.cantante = cantante;
		this.genere = genere;
		this.anno = anno;
	}
	
	public Canzone() {
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Cantante getCantante() {
		return cantante;
	}

	public void setCantante(Cantante cantante) {
		this.cantante = cantante;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Canzone [id=" + id + ", titolo=" + titolo + ", cantante=" + cantante + ", genere=" + genere + ", anno="
				+ anno + "]";
	}
}
