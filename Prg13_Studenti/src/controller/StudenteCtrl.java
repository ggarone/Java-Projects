package controller;

import java.util.ArrayList;

import model.Studente;

public class StudenteCtrl {
	private ArrayList<Studente> studenti;

	public StudenteCtrl() {
		super();
		this.studenti = new ArrayList<>();
	}
	
	/**
	 * Metodo per aggiungere uno studente all'elenco di studenti
	 * @param s 
	 */
	public void addStudente(Studente s) {
		this.studenti.add(s);
	}

	public ArrayList<Studente> getStudenti() {
		return studenti;
	}

	public void setStudenti(ArrayList<Studente> studenti) {
		this.studenti = studenti;
	}
	
	public Studente getStudenteByMat(int nMat) {
		for (Studente studente : studenti) {
			if(studente.getnMat() == nMat)
				return studente;
		}
		return null;
	}
	
	public void updateStudente(Studente s, int nMat) {
		for (Studente studente : studenti) {
			if(studente.getnMat() == nMat) {
				studente.setNome(s.getNome());
				studente.setCognome(s.getCognome());
			}
		}
	}
	
	public void deleteStudenteByMat(int nMat) {
		Studente s = this.getStudenteByMat(nMat);
		//removes first occurrence of equal to s
		if(s != null) {
			studenti.remove(s);
			System.out.println(s + " eliminato!");
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudenteCtrl [studenti=");
		builder.append(studenti);
		builder.append("]");
		return builder.toString();
	}
	
	
}
