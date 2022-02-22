package service;

import java.util.List;

import entities.Libro;

public interface LibroService {
	List<Libro> getAll();
	Libro getLibroById(int id);
	void addLibro(Libro l);
}
