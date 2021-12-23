package view;

import controller.RubricaController;
import model.Contatto;

public class RubricaDemo {

	public static void main(String[] args) {
		RubricaController controller = new RubricaController();
		
		controller.addContatto("Elisa", "3456569842");
		controller.addContatto("Giovanni", "3588569842");
		controller.addContatto("Giorgio", "3256678842");
		controller.addContatto("Lily", "3946689842");
		
		for(Contatto c : controller.getContatti()) {
			if(c != null)
				System.out.println(c); //toString gets automatically called
		}

	}

}
