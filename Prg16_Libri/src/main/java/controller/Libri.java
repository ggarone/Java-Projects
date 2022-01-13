package controller;

import java.util.ArrayList;

import model.Libro;

public class Libri {
	private ArrayList<Libro> libri;

	public Libri() {
		super();
		this.libri = new ArrayList<>();
		init();
	}
	
	public void init() {
		this.libri.add(new Libro("Vita", 10));
		this.libri.add(new Libro("Morte", 20));
		this.libri.add(new Libro("Miracoli", 25));
		this.libri.add(new Libro("EI", 35));
	}
	
	public void addLibro(String title, double price) {
		this.libri.add(new Libro(title, price));
	}
	
	public ArrayList<Libro> getLibri() {
		return libri;
	}
	
}
