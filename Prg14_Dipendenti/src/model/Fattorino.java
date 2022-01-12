package model;

public class Fattorino extends Dipendente{
	
	private double basePay;
	private int deliveries;
	private double payForDeliveries;

	public Fattorino(String name, String surname) {
		super(name, surname);
		this.basePay = 20;
		this.payForDeliveries = 3; 
	}
	
	public void setDeliveries(int deliveries) {
		this.deliveries = deliveries;
	}
	
	@Override
	public double calcolaStipendio() {
		
		return this.basePay + (this.deliveries * this.payForDeliveries);
	}
	
	
}
