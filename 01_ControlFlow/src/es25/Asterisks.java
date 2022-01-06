package es25;

import java.util.Scanner;

public class Asterisks {

	public static void main(String[] args) {
		Integer rows = getUserInput();
		Integer counter = rows;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows - counter; j++) {
				System.out.print("*");
			}
			counter--;
			System.out.println();
		}
		
		//5
		//*
		//**
		//***
		//****
		//*****
		

	}
	
	private static Integer getUserInput() {
		Integer userChoice;
		System.out.print("Input number: \n>> ");
		Scanner sc = new Scanner(System.in);
		userChoice = sc.nextInt();
		sc.close();
		return userChoice;
	}

}
