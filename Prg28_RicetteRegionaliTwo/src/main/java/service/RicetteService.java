package service;

import java.util.List;

import dal.RicettaDAO;
import model.Ricetta;

public class RicetteService implements RicetteIService {

	RicettaDAO repo = new RicettaDAO();
	
	@Override
	public void addRicetta(Ricetta r) {
		repo.addRicetta(r);
	}

	@Override
	public void addRicetta(String nome, String regione) {
		repo.addRicetta(nome, regione);
	}

	@Override
	public Ricetta getRicettaById(int id) {
		return repo.getRicettaById(id);
	}

	@Override
	public List<Ricetta> getAll() {
		return repo.getAll();
	}

	@Override
	public List<Ricetta> getRicettaByRegione(String regione) {
		return repo.getRicettaByRegione(regione);
	}

	@Override
	public void updRicetta(Ricetta r) {
		repo.updRicetta(r);
	}

	@Override
	public void delRicettaById(int id) {
		repo.delRicettaById(id);
	}

}
