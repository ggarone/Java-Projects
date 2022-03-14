package model;

public class Barca extends VeicoloTargato  implements Noleggiabile{
	
	public Barca(String targa) {
		super(targa);
		this.tipo = TipoVeicolo.BARCHE;
		this.tipoPatente = TipoPatente.C;
		this.prezzo = getPrezzoCasuale();
	}

	@Override
	public double getCostoNoleggio() {
		return getPrezzoVendita()/tipo.getFattore();
	}

	@Override
	public double getPrezzoVendita() {
		// TODO Auto-generated method stub
		return prezzo * 1.22;
	}

	@Override
	public String toString() {
		return super.toString() + MESSAGGIO;
	}
	
	
}
