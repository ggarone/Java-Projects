package service;

import java.util.List;

import model.Ricetta;

public interface RicetteIService {
	
	String MESSAGGIO = "Le nostre ricette";
	
	// C R U D  
	
	//CREAT
	void addRicetta(Ricetta r);
	
	//READ
	List<Ricetta> getAll();
	List<Ricetta> getAllByRegione(String regione);
	Ricetta getOneByNome(String nome);
	
	//UPDATE
	void updateRicetta(Ricetta r);
	
	//DELETE
	void deleteRicetta(Ricetta r);
			
}
