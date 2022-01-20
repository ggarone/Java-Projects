package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class LeggiDivina {

	public static void main(String[] args) {
		ArrayList<String> tutteLeParole = new ArrayList<String>();
		File f = new File("files/divina.txt");
		TreeSet<String> singoleParole = new TreeSet<String>();
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNext()) {
				String row = sc.nextLine();
				String[] parole = row.split(" ");
				for (String parola : parole) {
					if(parola.length() > 3) {
						parola = parola.replace(";", "").replace("‘", "").replace(",", "").replace("“", "").replace("”", "").replace("’", "").replace(".", "").replace("»", "").replace("«", "");
//						parola = parola.replace("[;‘,“”’»«]", "");
						parola = parola.trim();
						tutteLeParole.add(parola);
						singoleParole.add(parola); // string che non si ripetono
					}
				}
			}
			System.out.println("la divina commedia contiene " + tutteLeParole.size());
			System.out.println("la divina commedia contiene " + singoleParole.size() + " uniche");
			
			File output = new File("files/divina-pulita.txt");
			PrintWriter pw = new PrintWriter(output);
			for (String string : singoleParole) {
				pw.println(string);
			}
			pw.close();
			sc.close();
			
			
		} catch (FileNotFoundException e) {
			System.err.println("File not found " + e);
		} catch (ArithmeticException e) {
			System.err.println("Arithmetic problem " + e);
		}
		
		System.out.println("Istruzioni successive");
		
		

	}

}
