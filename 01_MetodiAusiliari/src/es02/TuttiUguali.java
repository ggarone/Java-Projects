package es02;
import java.util.Scanner;

public class TuttiUguali {

	public static void main(String[] args) {
		Integer n1=0,n2=0,n3=0;
		boolean check;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert first number: \n>>");
		n1 = sc.nextInt();
		System.out.print("Insert first number: \n>>");
		n2 = sc.nextInt();
		System.out.print("Insert first number: \n>>");
		n3 = sc.nextInt();
		
		check = CheckIfEqual(n1,n2,n3);
		if (check)
			System.out.println("All the numbers are equal");
		else
			System.out.println("Atleast one number is different");
	}

	private static boolean CheckIfEqual(Integer n1, Integer n2, Integer n3) {
		if(n1.equals(n2) && n2.equals(n3)) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
