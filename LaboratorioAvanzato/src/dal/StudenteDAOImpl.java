package dal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import model.Studente;

public class StudenteDAOImpl implements StudenteDAO {
	

	private Map<Integer,Studente> studenti;
	
	public StudenteDAOImpl() {
		super();
		File f = new File("files/students.txt");
		Scanner sc;
		studenti = new TreeMap<Integer, Studente>();
		try {
			sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String riga = sc.nextLine();
				String[] parole = riga.split(",");
				String nome = parole[0];
				String cognome = parole[1];
				addStudente(nome, cognome);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addStudente(String nome, String cognome) {
		Studente s = new Studente(nome, cognome);
		studenti.put(s.getnMatr(), s);
	}

	@Override
	public List<Studente> getAll() {
		Collection<Studente> values = studenti.values();
		List<Studente> all = new ArrayList<Studente>(values);
		return all;
	}

	@Override
	public Studente getStudenteByMat(int nMat) {
		return studenti.get(nMat);
	}

	@Override
	public void updStudente(Studente s) {
		Studente studente = studenti.get(s.getnMatr());
		studente = s;
//		studenti.put(studente.getnMatr(), studente);
	}

	@Override
	public void delStudente(int nMat) {
		studenti.remove(nMat);

	}

}
