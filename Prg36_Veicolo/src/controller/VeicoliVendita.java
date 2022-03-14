package controller;

import java.util.List;

import anagrafica.AnagraficaVeicoli;
import model.Veicolo;

public class VeicoliVendita {
	
	
	public List<Veicolo> getVeicoliList(){
		return AnagraficaVeicoli.veicoliList;
	}
}
