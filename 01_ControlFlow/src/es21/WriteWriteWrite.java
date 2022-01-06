package es21;

import java.util.Scanner;

public class WriteWriteWrite {

	public static void main(String[] args) {
		Integer userChoice = getUserInput();
		
		if(userChoice <= 0) {
			System.out.println("Error");
			return;
		}
		
		for (int i = 0; i < userChoice; i++) {
			System.out.println("[" + i + "]");
		}

	}
	
	private static Integer getUserInput() {
		Integer userChoice;
		System.out.print("Input number of iterations: \n>> ");
		Scanner sc = new Scanner(System.in);
		userChoice = sc.nextInt();
		return userChoice;
		
	}

}
