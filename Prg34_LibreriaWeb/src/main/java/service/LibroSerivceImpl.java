package service;

import java.util.List;

import dal.LibroDAO;
import dal.LibroDAOImpl;
import entities.Libro;

public class LibroSerivceImpl implements LibroService {
	
	private LibroDAO repo = new LibroDAOImpl();

	@Override
	public List<Libro> getAll() {
		// TODO Auto-generated method stub
		return repo.getAll();
	}

	@Override
	public Libro getLibroById(int id) {
		// TODO Auto-generated method stub
		return repo.getLibroById(id);
	}

	@Override
	public void addLibro(Libro l) {
		repo.addLibro(l);	
	}

}
