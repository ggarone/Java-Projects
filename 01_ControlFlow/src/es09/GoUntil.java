package es09;

import java.util.Scanner;

public class GoUntil {

	public static void main(String[] args) {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Insert number: \n>>");
			number = sc.nextInt();
			boolean b1 = number < 0 && number%2==0;
			boolean b2 = number >= 0 && number%3==0;
			System.out.printf("%b %b\n", b1,b2);
			
		}while(!((number < 0 && number%2==0) || (number >= 0 && number%3==0)));
		
		sc.close();

	}

}
