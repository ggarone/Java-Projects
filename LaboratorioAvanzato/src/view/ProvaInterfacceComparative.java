package view;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import controller.Registro;
import model.Studente;

//class NameCompare implements Comparator<Studente>{
//	public int compare(Studente s1, Studente s2) {
//		return s1.getCognome().compareTo(s2.getCognome());
//	}
//}

public class ProvaInterfacceComparative {
	public static void main(String[] args) {
		Registro r = new Registro();
		List<Studente> tuttiGliStudenti = r.tuttiGliStudenti();
//		Comparator<Studente> nc = new Comparator<Studente>() {
//			@Override
//			public int compare(Studente s1, Studente s2) {
//				return s1.getCognome().compareTo(s2.getCognome());
//			}
//		};
		// OR functional programming!!
		Collections.sort(tuttiGliStudenti, (s1,s2) -> s1.getCognome().compareTo(s2.getCognome()));
		tuttiGliStudenti.forEach(s->System.out.println(s.getCognome()));
		System.out.println("----------------------------------------");
		Collections.sort(tuttiGliStudenti, (s1,s2) -> s2.getCognome().compareTo(s1.getCognome()));
		tuttiGliStudenti.forEach(s->System.out.println(s.getCognome()));
	}
}
