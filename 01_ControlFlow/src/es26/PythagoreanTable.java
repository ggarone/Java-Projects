package es26;

import java.util.Scanner;

public class PythagoreanTable {

	public static void main(String[] args) {
		final int DIM = 10;
		int result=0;
		
		for (int i = 1; i <= DIM; i++) {
			for (int j = 1; j <= DIM; j++) {
				result = i * j;
				System.out.print(result + "\t");
			}
			System.out.println();
			
		}
		

	}

}
