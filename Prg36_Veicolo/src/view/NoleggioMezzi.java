package view;

import java.util.Random;

import anagrafica.AnagraficaClienti;
import controller.VeicoliNoleggio;
import model.Noleggiabile;
import model.Veicolo;
import model.clienti.Cliente;

public class NoleggioMezzi {
	public static void main(String[] args) {
		VeicoliNoleggio ctrlNolo = new VeicoliNoleggio();
		
//		ctrlNolo.getVeicoliList().stream()
//			.forEach(System.out::println);
//		
//		ctrlNolo.getVeicoliList().stream()
//			.filter(v -> (v instanceof Noleggiabile))
//			.forEach(System.out::println);
		
		Random r = new Random();
		
		for(Cliente c : AnagraficaClienti.clienti.values()) {
			Veicolo v = ctrlNolo.getVeicoliList().get(r.nextInt(ctrlNolo.getVeicoliList().size())); 
			ctrlNolo.addNoleggio(v, c);
		}
		
		
		ctrlNolo.addNoleggio(ctrlNolo.getVeicoliList().get(0), AnagraficaClienti.clienti.get(4));
		
		ctrlNolo.printNoleggi("files/noleggi.txt");
		
		System.out.println(ctrlNolo.getNoleggi());
		
	}
}
