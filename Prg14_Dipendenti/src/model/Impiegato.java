package model;

public class Impiegato extends Dipendente{
	
	private int workDays;
	private double dailyPay;
	
	public Impiegato(String name, String surname) {
		super(name, surname);
		this.dailyPay = 80;
	}
	
	public int getWorkDays() {
		return workDays;
	}
	
	public void setWorkDays(int workDays) {
		this.workDays = workDays;
	}

	@Override
	public double calcolaStipendio() {
		return this.dailyPay * this.workDays;
	}
}
