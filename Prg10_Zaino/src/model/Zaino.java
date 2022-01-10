package model;

import java.util.ArrayList;

public class Zaino {
	
	private ArrayList<Oggetto> objects;

	public Zaino() {
		this.objects = new ArrayList<>();
	}
	
	public double getWeightZaino() {
		double weight = 0;
		for (Oggetto object : objects) {
			weight += object.getWeight();
		}
		return weight;
	}

	public ArrayList<Oggetto> getObjects() {
		return objects;
	}

	@Override
	public String toString() {
		return "Zaino [objects=" + objects + "]";
	}
	
}
