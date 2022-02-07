package model;

public class Studente {
	private static int counter = 1;
	
	private int nMatr;
	private String nome;
	private String cognome;
	
	public Studente(String nome, String cognome) {
		super();
		this.nMatr = counter++;
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getnMatr() {
		return nMatr;
	}

	@Override
	public String toString() {
		return "Studente [nMatr=" + nMatr + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
}
