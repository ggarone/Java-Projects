package dal;

import java.util.List;

import model.Studente;

public interface StudenteDAO {
	String CORSO = "TTS2022";
	String TAB = "studenti";
	
	//CREATE
	void addStudente(String nome, String cognome);
	//READ-RETRIEVE
	List<Studente> getAll();
	Studente getStudenteByMat(int nMat);
	//UPDATE
	void updStudente(Studente s);
	//DELETE
	void delStudente(int nMat);
	
}
