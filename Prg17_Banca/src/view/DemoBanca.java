package view;

import controller.GestioneConti;
import model.Cliente;
import model.ContoCorrente;

public class DemoBanca {

	public static void main(String[] args) {
		GestioneConti controller = new GestioneConti();
		
		controller.addCliente("Winny", "Thepooh", "1995-07-04");
		Cliente c = controller.getCliente("Winny", "Thepooh");
		controller.apriConto(c);
		
		ContoCorrente conto = controller.getConto(1);
		
		controller.faiVersamento(100, conto);
		controller.faiVersamento(200, conto);
		controller.faiVersamento(200, conto);
		controller.faiPrelievo(250, conto);
		
		
		
		System.out.println(conto);
		

	}

}
