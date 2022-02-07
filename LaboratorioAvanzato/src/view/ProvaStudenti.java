package view;

import controller.Registro;
import model.Studente;

public class ProvaStudenti {

	public static void main(String[] args) {
		Registro r = new Registro();
		
//		System.out.println(r.tuttiGliStudenti());
		
//		for (Studente s : r.tuttiGliStudenti()) {
//			if(s.getCognome().endsWith("e")) {
//				System.out.println(s);
//			}
//		}
		
		r.tuttiGliStudenti().stream()
			.filter(s -> s.getCognome().endsWith("e"))
			.filter(s-> s.getCognome().startsWith("G"))
			.forEach(s -> System.out.println(s)
		);

	}

}
