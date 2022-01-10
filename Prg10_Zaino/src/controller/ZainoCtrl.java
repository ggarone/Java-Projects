package controller;

import model.Oggetto;
import model.Zaino;

public class ZainoCtrl {
	private Zaino zaino;
	
	public ZainoCtrl() {
		this.zaino = new Zaino();
	}
	
	public void addObject(Oggetto object) {
		this.zaino.getObjects().add(object);
	}
	
	public double getWeight() {
		return this.zaino.getWeightZaino();
	}
	
	public void printZaino() {
		System.out.println(this.zaino);
	}
}
