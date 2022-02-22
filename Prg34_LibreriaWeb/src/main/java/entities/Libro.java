package entities;

public class Libro {
	private int id;
	private String titolo;
	private double prezzo;
	private int pagine;
	private int editoreId;
	
	public Libro() {
	}

	public Libro(int id, String titolo, double prezzo, int pagine, int editoreId) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.prezzo = prezzo;
		this.pagine = pagine;
		this.editoreId = editoreId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	public int getEditoreId() {
		return editoreId;
	}

	public void setEditoreId(int editoreId) {
		this.editoreId = editoreId;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", prezzo=" + prezzo + ", pagine=" + pagine + ", editoreId="
				+ editoreId + "]";
	}
}
