package dal;

import java.util.List;

import entities.Libro;

public interface LibroDAO {
	String TAB = "libro";
	String ALL = "select * from " + TAB;
	String ONE = "select * from " + TAB + " where id= ?";
	String INSERT = "insert into " + TAB + " (titolo,prezzo,pagine,editore_id) values(?,?,?,?)";
	
	List<Libro> getAll();
	Libro getLibroById(int id);
	void addLibro(Libro l);
}
