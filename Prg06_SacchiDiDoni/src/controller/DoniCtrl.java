package controller;

import model.Babbo;
import model.Dono;
import model.Sacco;

public class DoniCtrl {
	Babbo babbo;
	Dono dono;
	Sacco sacco;

	public void aggiungiBabbo(String nome) {
		babbo = new Babbo(nome);
	}
	
	public Babbo getBabbo() {
		return babbo;
	}
	
	public void aggiungiDono(String descrizione, double peso) {
		dono = new Dono(descrizione, peso);
		aggiungiDonoAlSacco();
	}
	
	public Dono getDono() {
		return dono;
	}
	
	public void aggiungiSacco(int id) {
		sacco = new Sacco(id);
	}
	
	public Sacco getSacco() {
		return sacco;
	}
	
	public void aggiungiDonoAlSacco(int pos) {
		this.sacco.getDoni()[pos] = this.dono;
	}
	
	public void aggiungiDonoAlSacco() {
		int pos = primaPosizioneLibera();
		if(pos > -1)
			this.sacco.getDoni()[pos] = this.dono;
		else
			System.out.println("Non c'e' piu' posto nel sacco");
	}
	
	public void assegnaSacco() {
		this.babbo.setSacco(sacco);
	}
	
	public double getPesoSacco() {
		double peso=0;
		for (Dono dono : this.sacco.getDoni()) {
			if(dono != null)
				peso += dono.getPeso();
		}
		return peso;
	}
	
	private int primaPosizioneLibera() {
		for (int j = 0; j < this.sacco.getDoni().length; j++) {
			if(this.sacco.getDoni()[j] == null)
				return j;
		}
		return -1;
	}
}
