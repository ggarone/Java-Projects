package dal;

import java.util.List;

import model.Ricetta;

public interface RicettaIDAO {

void addRicetta(Ricetta r);
	
	List<Ricetta> getAll();
	List<Ricetta> getAllByRegione(String regione);
	Ricetta getOneByNome(String nome);
	
	void updateRicetta(Ricetta r);
	
	void deleteRicetta(Ricetta r);
	
}
