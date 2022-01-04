package es14;

import java.util.Scanner;

public class FortyFour {

	public static void main(String[] args) {
		final int DIM = 44;
		String[] charArray = new String[DIM];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert char: ");
		for (int i = 0; i < DIM; i++) {
			System.out.print(i + " >> ");
			charArray[i] = sc.next();
			System.out.println(charArray[i]);
		}
		
		for (int j = 0; j < charArray.length; j++) {
			if(j % (DIM/6) == 0)
				System.out.println();
			System.out.print(charArray[j] + " ");
		}
		
		sc.close();
	}

}
