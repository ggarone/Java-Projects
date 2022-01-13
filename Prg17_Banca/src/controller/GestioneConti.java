package controller;

import java.util.ArrayList;

import anagrafica.DB;
import model.Cliente;
import model.ContoCorrente;

public class GestioneConti {
	
	public void apriConto(Cliente c) {
		ContoCorrente cc = new ContoCorrente(c);
		DB.getConti().add(cc);
	}
	
	public void addCliente(String nome, String cognome, String data) {
		Cliente c = new Cliente(nome, cognome, data);
		DB.getClienti().add(c);
	}
	
	public ContoCorrente getConto(int numero) {
		for (ContoCorrente cc : DB.getConti()) {
			if(cc.getNumero() == numero) {
				return cc;
			}
		}
		return null;
	}
	
	public Cliente getCliente(String nome,String cognome) {
		for(Cliente c: DB.getClienti()) {
			if(c.getNome().equals(nome) && c.getCognome().equals(cognome))
				return c;
		}
		return null;
	}
	
	public void faiVersamento(double denari, ContoCorrente cc) {
		cc.versamento(denari);
	}
	
	public void faiPrelievo(double denari, ContoCorrente cc) {
		cc.prelievo(denari);
	}
	
}
