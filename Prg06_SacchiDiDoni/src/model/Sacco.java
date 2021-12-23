package model;

public class Sacco {
	private int id;
	private Dono[] doni;
	
	public Sacco(int id) {
		super();
		this.id = id;
		this.doni = new Dono[10];
	}
	
	public int getId() {
		return id;
	}
	public Dono[] getDoni() {
		return doni;
	}
	
	public String etichetta() {
		String etichetta = "";
		etichetta += "Id sacco n. " + this.id;
		etichetta += " Elenco doni:\n";
		for (Dono dono : doni) {
			if(dono != null)
				etichetta += dono.etichetta() + " ";
		}
		return etichetta;
	}
	
}
