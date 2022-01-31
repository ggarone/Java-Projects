package model;

public class Cliente {
	
	private static int counter = 1;

	private int codice;
	private String nome, cognome;
	private String username;
	private String password;
	
	public Cliente(String nome, String cognome, String username) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = nome.substring(0,3) + cognome.substring(0,3) + counter;
		this.codice = counter++;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCodice() {
		return codice;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [codice=");
		builder.append(codice);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", cognome=");
		builder.append(cognome);
		builder.append(", username=");
		builder.append(username);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
}
