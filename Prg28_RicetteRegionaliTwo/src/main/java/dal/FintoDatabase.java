package dal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Ricetta;

public class FintoDatabase {
	
	public static List<Ricetta> ricetteBase = new ArrayList<>(
			
			Arrays.asList(
					new Ricetta("Risotto al Barolo", "Piemonte"),
					new Ricetta("Brasato al Barolo", "Piemonte"),
					new Ricetta("Friciò Piemontesi", "Piemonte"),
					new Ricetta("Crostini ai Tartufi", "Piemonte")
					)
			
			);
	
	
	
}
