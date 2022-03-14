package model;

public class Bici extends VeicoloNonTargato{
	private TipoBici tipoBici;
	
	
	
	public Bici(TipoBici tipoBici) {
		super();
		this.tipoBici = tipoBici;
		this.tipo = TipoVeicolo.BICI;
	}

	@Override
	public double getCostoNoleggio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPrezzoVendita() {
		// TODO Auto-generated method stub
		return 0;
	}

}
