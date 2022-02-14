package model;

import java.util.ArrayList;
import java.util.List;

public class Cantante {
	private int id;
	private String nome;
	private List<Canzone> canzoni;
	
	public Cantante() {
		this.canzoni = new ArrayList<Canzone>();
	}
	
	public Cantante(int id, String nome) {
		// chiama il costruttore vuoto
		this();
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Canzone> getCanzoni() {
		return canzoni;
	}

	public void setCanzoni(List<Canzone> canzoni) {
		this.canzoni = canzoni;
	}

	@Override
	public String toString() {
		return "Cantante [id=" + id + ", nome=" + nome + ", canzoni=" + canzoni + "]";
	}
	
	
	
	
}
