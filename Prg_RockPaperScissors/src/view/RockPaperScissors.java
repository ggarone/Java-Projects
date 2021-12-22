package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RockPaperScissors {
	
	public static void main(String[] args) {
		Integer userInput, pcInput;
		
		System.out.print("Choose between 0 (rock) - 1 (paper) - 2 (scissors)\n>>");
//		Map<String, Integer> dictionary = new HashMap<String, Integer>() {{
//	        put("rock", 0);
//	        put("paper", 1);
//	        put("scissors", 2);
//	    }};
	    
//	    System.out.println(dictionary);
	    
	    userInput = getUserInput();
	    pcInput = getPCInput();
	    System.out.println("pc chose: " + pcInput);
	    System.out.print(">>");
	    computeWinner(userInput,pcInput);
		
	}

	private static void computeWinner(Integer userInput, Integer pcInput) {
		if(userInput.equals(pcInput)) {
			System.out.println("DRAW!");
		}
		else if(userInput % 2 > pcInput) {
			System.out.println("USER WINS!");
		}
		else {
			System.out.println("PC WINS!");
		}
		
	}

	private static int getPCInput() {
		Integer max=2, min=0;
		int randomNumber = (int) ((Math.random() * (max - min)) + min);
		return randomNumber;
	}

	private static int getUserInput() {
		Integer userChoice;
		Scanner sc = new Scanner(System.in);
		userChoice = sc.nextInt();
		return userChoice;
		
	}
}