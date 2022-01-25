package model;

public class Dado {
	private int facce;
	private String colore;
	
	public Dado() {
		this.facce = 6;
		this.colore = "bianco";
	}
	
	public Dado(int facce, String colore) {
		super();
		this.facce = facce;
		this.colore = colore;
	}
	// modificatori di accesso: public, private, none(=package)
	public int getFacce() {
		return facce;
	}
	public void setFacce(int facce) {
		this.facce = facce;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public Integer lanciaDado() {
		Integer max=this.facce;
		int randomNumber = (int) ((Math.random() * max)) +1;
		return randomNumber;
	}
}
