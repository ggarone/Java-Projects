package view;

import controller.Libretto;

public class GestioneUnito {

	public static void main(String[] args) {
		Libretto l = new Libretto();
		l.aggiungiEsame(0, 28, "Matematica");
		l.aggiungiEsame(1, 26, "Italiano");
		l.aggiungiEsame(2, 18, "Francese");
		
		System.out.println(l.calcolaMedia());
		
		l.aggiungiEsame(3, 30, "Informatica");
		System.out.println(l.calcolaMedia());

	}

}
