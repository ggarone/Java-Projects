package controller;

import java.util.ArrayList;
import java.util.List;

import model.Serie;


public class SerieCtrl {
	private List<Serie> elenco;
	
	//blocco di inizializzazione
	{
		this.elenco = new ArrayList<Serie>();
		this.elenco.add(new Serie("Cobra Kai","azione"));
		this.elenco.add(new Serie("Breaking Bad", "thriller"));
		this.elenco.add(new Serie("Game of Thrones", "fantasy"));

	}

	public SerieCtrl() {
		super();
	}

	public List<Serie> getElenco() {
		return elenco;
	}

	public void setElenco(List<Serie> elenco) {
		this.elenco = elenco;
	}
	
	public List<Serie> getElencoByGenere(String genere) {
		List<Serie> serie = new ArrayList<Serie>();
		for(Serie s: elenco) {
			if(s.getGenere().equals(genere)) {
				serie.add(s);
			}
		}
		return serie;
	}
	
	
	
}
