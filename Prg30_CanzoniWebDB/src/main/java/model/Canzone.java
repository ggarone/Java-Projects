package model;

public class Canzone {
	//ORM
	//Javabean - Plain Old Java Object
	
	private int id;
	private String titolo;
	private String genere;
	private String cantante;
	
	
	public Canzone() {
	}
	
	public Canzone(int id,String titolo, String genere, String cantante) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.genere = genere;
		this.cantante = cantante;
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

	public String getCantante() {
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Canzone [id=" + id + ", titolo=" + titolo + ", genere=" + genere + ", cantante=" + cantante + "]";
	}
	
	
}
