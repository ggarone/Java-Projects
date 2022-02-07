package view;

import controller.CapiCtrl;
import model.Maglia;
import model.Pantalone;
import model.Taglia;

public class ProvaCapiAbbigliamento {

	public static void main(String[] args) {
		CapiCtrl ctrl = new CapiCtrl();
		
		ctrl.addMaglia(new Maglia("Maglia verde", Taglia.M));
		ctrl.addPantalone(new Pantalone("Pantalone classico", Taglia.XL));
		System.out.println("maglie-------------------------------------");
		for (Maglia maglia : ctrl.getMaglie()) {
			System.out.println(maglia);
		}
		System.out.println("pantaloni----------------------------------");
		ctrl.getPantaloni().forEach(System.out::println);

	}

}
