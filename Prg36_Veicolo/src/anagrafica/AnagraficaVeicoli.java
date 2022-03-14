package anagrafica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import model.Auto;
import model.Barca;
import model.Bici;
import model.Camion;
import model.Camper;
import model.TipoBici;
import model.Veicolo;

public class AnagraficaVeicoli {
	public static Set<Veicolo> veicoliSet;
	public static List<Veicolo> veicoliList;
	public static Map<Integer,Veicolo> veicoliMap;
	
	static {
		veicoliSet = new TreeSet<Veicolo>();
		veicoliList = new LinkedList<Veicolo>();
		veicoliMap = new TreeMap<Integer, Veicolo>();
		
		try {
			Scanner sc = new Scanner(new File("files/veicoli.txt"));
			while(sc.hasNextLine()) {
				String riga = sc.nextLine();
				String[] parole = riga.split(",");
				String tipo = parole[0];
				String anno = parole[1];
				String modello = parole[2];
				
				
				if(tipo.equals("auto")) {
					Auto a = new Auto("AU");
					a.setAnno(Integer.parseInt(anno));
					veicoliList.add(a);
					
				}
				if(tipo.equals("bici")) {
					double casuale = Math.random();
					TipoBici tb = null;
					if(casuale < 0.33)
						tb = TipoBici.CITY_BIKE;
					else if(casuale < 0.66)
						tb = TipoBici.MOUNTAIN_BIKE;
					else
						tb = TipoBici.GRAZIELLA;
					Bici b = new Bici(tb);
					b.setAnno(Integer.parseInt(anno));
					veicoliList.add(b);
				}
				if(tipo.equals("camion")) {
					Camion c = new Camion("CA");
					c.setAnno(Integer.parseInt(anno));
					veicoliList.add(c);
				}
				if(tipo.equals("barca")) {
					Barca b = new Barca("BA");
					b.setAnno(Integer.parseInt(anno));
					veicoliList.add(b);

				}
				if(tipo.equals("camper")) {
					Camper c = new Camper("CP");
					c.setAnno(Integer.parseInt(anno));
					veicoliList.add(c);
				}
				
				veicoliList.stream()
					.forEach(v -> {
						veicoliSet.add(v);
						veicoliMap.put(v.getId(), v);
					});
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
