package dal;

import java.util.ArrayList;
import java.util.List;

import model.Ricetta;

public class RicettaDAO implements RicettaIDAO{

	private static List<Ricetta> ricette;
	private static RicettaDAO istanza;
	
	private RicettaDAO() {
		ricette = new ArrayList<Ricetta>();
		System.out.println("Nuovo DAO");
	}
	
	public static RicettaDAO getIstanza() {
		if(istanza == null) {
			istanza = new RicettaDAO();
		}
		return istanza;
	}
	
	@Override
	public void addRicetta(Ricetta r) {
		ricette.add(r);
		System.out.println(r);
		System.out.println(ricette.size());
	}

	@Override
	public List<Ricetta> getAll() {
		return ricette;
	}

	@Override
	public List<Ricetta> getAllByRegione(String regione) {
		List<Ricetta> ricetteRegione = new ArrayList<Ricetta>();
		for (Ricetta ricetta : ricette) {
			if(ricetta.getRegione().equals(regione)) {
				ricetteRegione.add(ricetta);
			}
		}
		return ricetteRegione;
	}

	@Override
	public Ricetta getOneByNome(String nome) {
		for (Ricetta ricetta : ricette) {
			if(ricetta.getNome().equals(nome)) {
				return ricetta;
			}
		}
		return null;
	}

	@Override
	public void updateRicetta(Ricetta r) {
		for (Ricetta ricetta : ricette) {
			if(ricetta.getNome().equals(r.getNome())) {
				ricetta = r;
			}
		}
	}

	@Override
	public void deleteRicetta(Ricetta r) {
		int i = 0;
		int elimina = -1;
		for (Ricetta ricetta : ricette) {
			if(ricetta.getNome().equals(r.getNome())) {
				elimina = i;
			}
			i++;
		}
		if(elimina > -1) {
			ricette.remove(elimina);
		}
	}



}
