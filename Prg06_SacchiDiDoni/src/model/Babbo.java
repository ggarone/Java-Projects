package model;

public class Babbo {
	private String nome;
	private Sacco sacco;
	
	public Babbo(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public Sacco getSacco() {
		return sacco;
	}

	public void setSacco(Sacco sacco) {
		this.sacco = sacco;
	}

	
	
}
