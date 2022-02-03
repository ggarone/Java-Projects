package dal;

import java.util.List;

import model.Ricetta;

public interface RicettaIDAO {

	String MESSAGGIO = "Le nostre ricette";

	// CRUD su DB:
	
	// CREATE
	void addRicetta(Ricetta r);
	void addRicetta(String nome, String regione);
	

	// READ
	Ricetta getRicettaById(int id);
	List<Ricetta> getAll();
	List<Ricetta> getRicettaByRegione(String regione);

	// UPDATE
	void updRicetta(Ricetta r);

	// DELETE
	void delRicettaById(int id);

}
