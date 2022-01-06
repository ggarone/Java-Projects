package es19;

import java.util.Scanner;

public class Taxes {

	public static void main(String[] args) {

		double tax = 0;
		Integer userRevenue = getUserInput();
		if(userRevenue.equals(-1)) {
			System.out.println("Wrong input");
			return;
		}
		
		tax = computeTax(userRevenue);
		System.out.println("userRevenue: " + userRevenue + " computed tax: " + tax);

	}
	
	private static double computeTax(Integer userRevenue) {
		final int firstStep = 10000;
		final int secondStep = 20000;
		final int thirdStep = 30000;
		double tax = 0;

		if(userRevenue > firstStep) {
			tax += (firstStep*0.1);
			if(userRevenue > secondStep) {
				tax += ((secondStep-firstStep)*0.07);
				if(userRevenue > thirdStep) {
					tax += ((thirdStep-secondStep)*0.05);
					tax += (userRevenue-thirdStep)*0.03;
				}
				else {
					tax += (userRevenue-secondStep)*0.05;
				}
			}
			else {
				tax += (userRevenue-firstStep)*0.07;
			}
		}
		else {
			tax = userRevenue*0.1;
		}
		return tax;
	}
	
	private static Integer getUserInput() {
		Integer userChoice;
		System.out.print("Input user revenue: \n>>");
		Scanner sc = new Scanner(System.in);
		userChoice = sc.nextInt();
		sc.close();
		if(userChoice < 0)
			return -1;
		return userChoice;
		
	}

}
