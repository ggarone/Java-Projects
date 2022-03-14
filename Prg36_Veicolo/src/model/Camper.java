package model;

public class Camper extends VeicoloTargato {

	public Camper(String targa) {
		super(targa);
		this.tipo = TipoVeicolo.CAMPER;
		this.tipoPatente = TipoPatente.D;
		this.prezzo = getPrezzoCasuale();
	}

	@Override
	public double getCostoNoleggio() {
		return getPrezzoVendita()/tipo.getFattore();
	}

	@Override
	public double getPrezzoVendita() {
		// TODO Auto-generated method stub
		return 0;
	}

}
