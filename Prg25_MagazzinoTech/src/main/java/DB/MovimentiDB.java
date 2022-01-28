package DB;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.Articolo;
import model.Movimento;

public class MovimentiDB {
	private static List<Movimento> all = new ArrayList<Movimento>();

	public static List<Movimento> getAll() {
		return all;
	}
	
	public static void addMovimento(Movimento m) {
		if(m.getQuantita() < 0 && ArticoliDB.getAll().get(m.getArticolo().getId()).getQuantita() > Math.abs(m.getQuantita())) {
			System.out.println("Disponibilita' Terminata");
		} else {
			all.add(m);
			//setta quantita' dell'articolo all'interno di 'all' mappa di articoli
			ArticoliDB.getAll().get(m.getArticolo().getId()).setQuantita(m.getQuantita());;	
		}
	}
	
}
