package model.clienti;

import java.util.ArrayList;
import java.util.List;

import model.Veicolo;

public class ClienteNoleggiatore extends Cliente{
	private List<Veicolo> noleggi;

	public ClienteNoleggiatore(String nome) {
		super(nome);
		this.noleggi = new ArrayList<>();
	}
	
	public void addNoleggio(Veicolo v) {
		noleggi.add(v);
	}
	
	

	@Override
	public String toString() {
		return super.toString() + "ClienteNoleggiatore [noleggi=" + noleggi.size() + "]";
	}
	
	
	

}
