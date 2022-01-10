package view;

import controller.ZainoCtrl;
import model.Oggetto;

public class ZainoDemo {

	public static void main(String[] args) {
		ZainoCtrl controller = new ZainoCtrl();
		
		Oggetto o1 = new Oggetto("libro", 1);
		Oggetto o2 = new Oggetto("portapenne", 2);
		Oggetto o3 = new Oggetto("righello", 3);
		Oggetto o4 = new Oggetto("vocabolario", 4);
		Oggetto o5 = new Oggetto("mappamondo", 5);
		
		controller.addObject(o1);
		controller.addObject(o2);
		controller.addObject(o3);
		controller.addObject(o4);
		controller.addObject(o5);
		
		controller.printZaino();
		System.out.println("Bag weight is: " + controller.getWeight());
		

	}

}
