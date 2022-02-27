package entities;

public class Country implements Comparable<Country>{
	private int id;
	private String stato;
	private String capitale;
	private String bandiera;
	private int popolazione;
	
	public Country() {
		// TODO Auto-generated constructor stub
	}

	public Country(int id, String stato, String capitale, String bandiera, int popolazione) {
		super();
		this.id = id;
		this.stato = stato;
		this.capitale = capitale;
		this.bandiera = bandiera;
		this.popolazione = popolazione;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public String getCapitale() {
		return capitale;
	}

	public void setCapitale(String capitale) {
		this.capitale = capitale;
	}

	public String getBandiera() {
		return bandiera;
	}

	public void setBandiera(String bandiera) {
		this.bandiera = bandiera;
	}

	public int getPopolazione() {
		return popolazione;
	}

	public void setPopolazione(int popolazione) {
		this.popolazione = popolazione;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", stato=" + stato + ", capitale=" + capitale + ", bandiera=" + bandiera
				+ ", popolazione=" + popolazione + "]";
	}

	@Override
	public int compareTo(Country o) {
		return this.stato.compareTo(o.stato);
	}
}
