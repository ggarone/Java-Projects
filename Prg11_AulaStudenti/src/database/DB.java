package database;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Student;

public class DB {
	private static ArrayList<Student> students = new ArrayList<>();
	
	public static void init() throws FileNotFoundException {
		File f = new File("files/students.dat");
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()) {
			String row = sc.nextLine();
			String[] temp = row.split(",");
			String name = temp[0];
			String surname = temp[1];
			
			Student s = new Student(name,surname);
			students.add(s);
		}
		sc.close();
	}

	public static ArrayList<Student> getStudents() {
		return students;
	}
	
	

}
