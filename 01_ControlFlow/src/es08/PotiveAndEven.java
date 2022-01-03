package es08;
import java.util.Scanner;

public class PotiveAndEven {

	public static void main(String[] args) {
		int numberOfIterations;
		boolean positiveAndEven = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert iteration number: \n>>");
		numberOfIterations = sc.nextInt();
		int[] numberArray = new int[numberOfIterations];
		
		for (int i = 0; i < numberOfIterations; i++) {
			System.out.print("[" + i + "] " + "Insert number: \n>>");
			numberArray[i] = sc.nextInt();
			if(numberArray[i] < 0 || numberArray[i] % 2 != 0)
				positiveAndEven = false;
			
		}
		
		if(positiveAndEven)
			System.out.println("All number inputted by users are positive and even.");
		else
			System.out.println("NO");
		sc.close();

	}

}
