package es01;
import java.util.Scanner;

public class Ripeti {

	public static void main(String[] args) {
		String userString = "";
		Integer repetitionNumber = 0;
		System.out.print("Insert string to be repeated: \n>>");
		Scanner sc = new Scanner(System.in);
		userString = sc.nextLine();
		System.out.print("Insert repetition number: \n>>");
		repetitionNumber = sc.nextInt();
		ripeti(userString,repetitionNumber);
		

	}

	private static void ripeti(String userString, Integer repetitionNumber) {
		if(repetitionNumber < 0)
			System.out.println("Error, negative number.");
		
		for (int i = 0; i < repetitionNumber; i++) {
			System.out.println(userString);
		}
		
	}



}
