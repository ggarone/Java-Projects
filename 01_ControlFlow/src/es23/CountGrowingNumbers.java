package es23;

import java.util.Scanner;

public class CountGrowingNumbers {

	public static void main(String[] args) {
		Integer number = getUserInput();
		Integer nextx= getUserInput();

		while(computeLegth(nextx) > computeLegth(number)) {
			number = nextx;
			nextx = getUserInput();
		}
		
		System.out.println(nextx + " n^ of digit isn't higher than " + number +". The program will terminate.");
	}
	private static Integer getUserInput() {
		Integer userChoice;
		System.out.print("Input increasing digit numbers: \n>> ");
		Scanner sc = new Scanner(System.in);
		userChoice = sc.nextInt();
		return userChoice;
		
	}
	
	private static Integer computeLegth(Integer number) {
		int length = (int)(Math.log10(number)+1);
		return length;
	}

}
