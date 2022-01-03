package es12;

import java.util.Scanner;

public class Repetition {
	
	final int DIM = 100;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int MAX = 5;
		for (int i = 0; i < MAX; i++) {
			repetition(sc);
		}
		
		sc.close();
	}

	private static void repetition(Scanner sc) {
		int numberOfIterations;
		String output = "";
		
		System.out.print("Insert iteration number: \n>>");
		numberOfIterations = sc.nextInt();
		Integer[] numberArray = new Integer[numberOfIterations];
		
		for (int i = 0; i < numberOfIterations; i++) {
			System.out.print("[" + i + "] " + "Insert number: \n>>");
			numberArray[i] = sc.nextInt();
			output += numberArray[i] + " ";
			System.out.println(output);
		}
		
	}

}
