package es24;

import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {
		double userChoice = getUserInput();
		double average=0,i=0,total=0;
		
		while(userChoice > 0) {
			total += userChoice;
			i++;
			userChoice = getUserInput();
		}
		
		average = total / i;
		System.out.println("Average is " + average);
		
		
	}
	
	private static double getUserInput() {
		double userChoice;
		System.out.print("Input increasing digit numbers: \n>> ");
		Scanner sc = new Scanner(System.in);
		userChoice = sc.nextDouble();
		return userChoice;
		
	}

}
