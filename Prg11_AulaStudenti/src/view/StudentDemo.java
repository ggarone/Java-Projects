package view;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import database.DB;
import model.Student;

public class StudentDemo {

	public static void main(String[] args) throws FileNotFoundException {
		DB.init();
		
		ArrayList<Student> students = DB.getStudents();
		
		int presenti = 0;
		int assenti = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (Student student : students) {
			System.out.print("E' presente lo studente ");
			System.out.println(student);
			
			if(sc.nextLine().equals("s")) {
				presenti++;
			}
			else
				assenti++;
		}
		
		System.out.println("Sono presenti " + presenti);
		System.out.println("Sono assenti " + assenti);
		
		sc.close();

	}

}
