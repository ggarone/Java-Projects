package controller;

import java.util.ArrayList;

import model.Articolo;
import model.Movimento;

public class MagazzinoCtrl {
	private Articoli ctrlArticoli;
	private MovimentiCtrl ctrlMovimenti;
	
	public MagazzinoCtrl() {
		this.ctrlArticoli = new Articoli();
		this.ctrlMovimenti = new MovimentiCtrl(new ArrayList<Movimento>());
		this.init();
	}
	
	private void init() {
		for(Articolo a : DB.ArticoliDB.getAsList()) {
			this.ctrlArticoli.addArticolo(a);
		}
	}
	
	public void caricaMagazzino(Articolo a, int q,String desc) {
		q = Math.abs(q);
		Movimento m = new Movimento(desc, q, a);
		this.ctrlMovimenti.addMovimento(m);
		this.ctrlArticoli.caricaArticolo(a, q);
	}
	
	public void scaricaMagazzino(Articolo a, int q,String desc) {
		q = Math.abs(q);
		Movimento m = new Movimento(desc, q, a);
		if(this.ctrlArticoli.scaricaArticolo(a, q)) {
			this.ctrlMovimenti.addMovimento(m);			
		}
	}

	public Articoli getCtrlArticoli() {
		return ctrlArticoli;
	}

	public MovimentiCtrl getCtrlMovimenti() {
		return ctrlMovimenti;
	}
	
	
	
}
