package view;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Integer number, result;
		System.out.print(">>");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		result = computeFactorial(number);
		
		System.out.println(result);

	}
	
	// 5! = 5*4*3*2*1

	private static Integer computeFactorial(Integer number) {
		if(number == 0)
			return 1;
		number = number * computeFactorial(number-1);
		return number;
	}

}
