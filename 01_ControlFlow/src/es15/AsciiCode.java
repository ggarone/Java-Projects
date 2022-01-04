package es15;

import java.util.Scanner;

public class AsciiCode {

	public static void main(String[] args) {
		final int DIM = 10;
		String[] charArray = new String[DIM];
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert char: \n>> ");
		
		for (int i = 0; i < DIM; i++) {
			System.out.print(">> ");
			charArray[i] = sc.next();
			System.out.println("ASCII of input is: " + (int) charArray[i].toCharArray()[0]);
		}
	
		sc.close();
	}

}
