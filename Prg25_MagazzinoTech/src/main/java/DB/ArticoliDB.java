package DB;

import java.util.HashMap;
import java.util.Map;

import model.Articolo;

public class ArticoliDB {
	private static Map<Integer, Articolo> all = new HashMap<Integer, Articolo>();
	
	static {
		String[] tech = {
				"Monitor",
				"Telefono",
				"Computer",
				"Tastiera",
				"Mouse",
				"Stampante",
				"Scanner"
		};
		
		for (String art : tech) {
			Articolo a = new Articolo(art, 100);
			all.put(a.getId(),a);
		}
	}
	
	public static Map<Integer, Articolo> getAll() {
		return all;
	}
	
	
}
