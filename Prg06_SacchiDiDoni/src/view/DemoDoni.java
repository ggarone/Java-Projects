package view;

import controller.DoniCtrl;

public class DemoDoni {
	public static void main(String[] args) {
		DoniCtrl controller = new DoniCtrl();
		controller.aggiungiBabbo("Babbo pippo");
		controller.aggiungiSacco(1);
		
		controller.aggiungiDono("trenino", 0.5);
		controller.aggiungiDono("bambola", 0.4);
		controller.aggiungiDono("palla", 0.3);
		controller.aggiungiDono("videogame", 0.2);
		controller.aggiungiDono("trenino", 0.5);
		controller.aggiungiDono("bambola", 0.4);
		controller.aggiungiDono("palla", 0.3);
		controller.aggiungiDono("videogame", 0.2);
		controller.aggiungiDono("trenino", 0.5);
		controller.aggiungiDono("bambola", 0.4);
		controller.aggiungiDono("palla", 0.3);
		controller.aggiungiDono("videogame", 0.2);
		
		controller.assegnaSacco();
		
		String contenuto = controller.getBabbo().getSacco().etichetta();
		System.out.println(contenuto);
		System.out.println("Peso totale: " + controller.getPesoSacco() + "kg");
		
	}
	
}
