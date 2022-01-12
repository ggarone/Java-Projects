package view;

import java.util.ArrayList;

import controller.StudenteCtrl;
import model.Studente;

public class StudenteDemo {

	public static void main(String[] args) {
		StudenteCtrl controller = new StudenteCtrl();
		
		controller.addStudente(new Studente("Aurora", "Esposito"));
		controller.addStudente(new Studente("Dora", "Koncz"));
		
		Studente s = controller.getStudenteByMat(2);
		
		ArrayList<Studente> studenti = controller.getStudenti();
		
		for (Studente studente : studenti) {
			System.out.println(studente);
		}
		
		controller.updateStudente(new Studente("Doretta", "Koncz"), 2);
		System.out.println(controller + "\n\n");
		
		controller.deleteStudenteByMat(1);
		System.out.println(controller);

	}

}
