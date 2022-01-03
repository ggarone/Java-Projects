package es10;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		final int MAX = 100;
		int[] numberArray = new int[MAX];
		int inputNumber = -1, i=0;
		boolean result = true;
		Scanner sc = new Scanner(System.in);
		
		while(inputNumber != 0) {
			System.out.print("Insert number: \n>>");
			numberArray[i] = sc.nextInt();
			inputNumber = numberArray[i];
			i++;
		}
	
		for(int j = 0; j < numberArray.length; j+=2) {
			if(numberArray[j+1] != 0) {
				if(!(numberArray[j] % 2 == 0 && numberArray[j+1] % 2 != 0)) {
					result = false;
				}
			}
			else {
				break;
			}
		}
		
		if (result)
			System.out.println("[OK] The array of numbers given always has a positive number followed by a negative number");
		else
			System.out.println("[NO] The array of numbers given doesn't have a positive number followed by a negative number");
		sc.close();

	}
}
