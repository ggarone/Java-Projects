package controller;

import java.util.Iterator;

import model.Esame;

public class Libretto {
	final Integer NUMBER_EXAMS = 10;
	
	
	String nomeStudente = "";
	Esame[] esamiSostenuti = new Esame[NUMBER_EXAMS];
	
	public void aggiungiEsame(int pos,int voto, String nomeEsame) {
		Esame e = new Esame();
		e.materia = nomeEsame;
		e.voto = voto;
		
		esamiSostenuti[pos] = e;
	}
	
	public double calcolaMedia() {
		double totale = 0;
		int contatore = 0;
		for (int i = 0; i < esamiSostenuti.length; i++) {
			if(esamiSostenuti[i] != null) {
				totale += esamiSostenuti[i].voto;
				contatore++;
			}
		}
		return totale/contatore;
	}
}
