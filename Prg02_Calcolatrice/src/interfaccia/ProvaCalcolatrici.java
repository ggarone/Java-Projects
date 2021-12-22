package interfaccia;

import java.util.Scanner;

import logica.Calcolatrice;

public class ProvaCalcolatrici {

	public static void main(String[] args) {
		Calcolatrice calc = new Calcolatrice();
		double result = calc.addizione(5.6, 7.8);
		System.out.println(result);
		
		Calcolatrice calc2 = new Calcolatrice();
		System.out.print("Input first number: \n>>");
		Scanner sc = new Scanner(System.in);
		double firstNumber = sc.nextDouble();
		System.out.print("Input second number: \n>>");
		sc.nextLine(); //consuma il fine linea
		double secondNumber = sc.nextDouble();
		sc.nextLine();
		double res = calc2.addizione(firstNumber, secondNumber);
		double res2 = calc2.sottrazione(firstNumber, secondNumber);
		double res3 = calc2.moltiplicazione(firstNumber, secondNumber);
		double res4 = calc2.divisione(firstNumber, secondNumber);
		System.out.println("addizione: " + res + "\n");
		System.out.println("sottrazione: " + res2 + "\n");
		System.out.println("moltiplicazione: " + res3 + "\n");
		System.out.println("divisione: " + res4 + "\n");
	}

}
