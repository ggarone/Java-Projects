package model;

public class Student {
	private int matricola;
	private String name;
	private String surname;
	private static int counter = 1; //static = only visible in class
	
	public Student() {}
	
	public Student(String name,String surname) {
		this.matricola = counter++;
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return matricola + " " + name + " " + surname;
	}
}
