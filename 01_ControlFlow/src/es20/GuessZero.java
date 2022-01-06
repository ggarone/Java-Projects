package es20;

import java.util.Scanner;

public class GuessZero {

	public static void main(String[] args) {
		Integer userChoice = -1;
		do {
			userChoice = getUserInput();
		}
		while(userChoice != 0);
		
		System.out.println("You guessed zero, good job!");
		

	}
	
	private static Integer getUserInput() {
		Integer userChoice;
		System.out.print("Input a number: \n>> ");
		Scanner sc = new Scanner(System.in);
		userChoice = sc.nextInt();
		return userChoice;
		
	}

}
