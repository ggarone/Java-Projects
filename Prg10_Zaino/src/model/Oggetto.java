package model;

public class Oggetto {
	private String name;
	private double weight;
	
	public Oggetto(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Oggetto [name=" + name + ", weight=" + weight + "]";
	}
}
