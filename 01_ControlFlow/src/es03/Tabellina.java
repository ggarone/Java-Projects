package es03;

import java.util.Scanner;

public class Tabellina {

	public static void main(String[] args) {
		final int TEN = 10;
		int inputNumber = 0, result=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert number: \n>> ");
		inputNumber = sc.nextInt();
		
		for (int i = 0; i <= TEN; i++) {
			result = inputNumber * i;
			System.out.print(inputNumber + "x" + i + " = " + result + "\t");
		}
		sc.close();
	}

}
