package model.clienti;

public class Cliente {
	private static int counter = 1;
	private int codCliente;
	private String nome;
	
	public Cliente(String nome) {
		super();
		this.codCliente = counter++;
		this.nome = nome;
	}
	
	public int getCodCliente() {
		return codCliente;
	}

	@Override
	public String toString() {
		return "Cliente [codCliente=" + codCliente + ", nome=" + nome + "]";
	}
	
	
	
}
