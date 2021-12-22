package interfaccia;

import java.util.Scanner;

import logica.Calcolatrice;

public class CalcolatriceDemo {
	public static void main(String[] args) {
		double res=0;
		Scanner sc = new Scanner(System.in);
		Calcolatrice calc = new Calcolatrice();
		
		System.out.print("input two integers or real numbers: \n>> ");
		double firstNumber = sc.nextDouble();
		sc.nextLine();
		System.out.print(">> ");
		double secondNumber = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("quale operazione vuoi fare?");
		System.out.print("1) addizione\n2) sottrazione\n3) moltiplicazione\n4) divisione\n>> ");
		String scelta = sc.nextLine();
		if(scelta.equals("1")) {
			res = calc.addizione(firstNumber, secondNumber);
		}
		else if(scelta.equals("2")) {
			res = calc.sottrazione(firstNumber, secondNumber);
		}
		else if(scelta.equals("3")) {
			res = calc.moltiplicazione(firstNumber, secondNumber);
		}
		else if(scelta.equals("4")) {
			res = calc.divisione(firstNumber, secondNumber);
		}
		else {
			System.out.println("wrong input");
		}
		System.out.println("Result: " + res);
	}
}
