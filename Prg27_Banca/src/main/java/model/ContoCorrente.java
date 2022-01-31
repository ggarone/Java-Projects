package model;

import java.util.ArrayList;
import java.util.List;

public class ContoCorrente {
	
	private static int counter = 1;

	private int	numeroConto;
	private Cliente titolare;
	private double saldo;
	private List<Movimento> movimenti;
	
	public ContoCorrente(Cliente c) {

		this.titolare = c;
		this.numeroConto = counter++;
		this.saldo = 0;
		this.movimenti = new ArrayList<Movimento>();
	
	}
	
	public void versamento(double denaro) {
		Movimento m = new Movimento("versamento", denaro,0);
		movimenti.add(m);
		this.saldo += denaro;
	}
	
	public void prelievo(double denaro) {
		if (this.saldo >= denaro) {
			Movimento m = new Movimento("prelievo", 0,denaro);
			movimenti.add(m);
			this.saldo -= denaro;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getNumeroConto() {
		return numeroConto;
	}

	public Cliente getTitolare() {
		return titolare;
	}
	
	public List<Movimento> getMovimenti() {
		return movimenti;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContoCorrente [numeroConto=");
		builder.append(numeroConto);
		builder.append(", titolare=");
		builder.append(titolare);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
