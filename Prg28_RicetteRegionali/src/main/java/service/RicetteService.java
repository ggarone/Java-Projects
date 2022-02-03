package service;

import java.util.List;

import dal.RicettaDAO;
import model.Ricetta;

public class RicetteService implements RicetteIService{
	
	RicettaDAO repo = RicettaDAO.getIstanza();
	
	@Override
	public void addRicetta(Ricetta r) {
		repo.addRicetta(r);
		System.out.println(r);
		System.out.println(repo.getAll().size());
	}

	@Override
	public List<Ricetta> getAll() {
		// TODO Auto-generated method stub
		return repo.getAll();
	}

	@Override
	public List<Ricetta> getAllByRegione(String regione) {
		// TODO Auto-generated method stub
		return repo.getAllByRegione(regione);
	}

	@Override
	public Ricetta getOneByNome(String nome) {
		// TODO Auto-generated method stub
		return repo.getOneByNome(nome);
	}

	@Override
	public void updateRicetta(Ricetta r) {
		// TODO Auto-generated method stub
		repo.updateRicetta(r);
	}

	@Override
	public void deleteRicetta(Ricetta r) {
		// TODO Auto-generated method stub
		repo.deleteRicetta(r);
	}

	
	
}
