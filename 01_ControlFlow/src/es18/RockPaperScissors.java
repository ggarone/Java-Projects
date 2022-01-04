package es18;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RockPaperScissors {
	
	public static void main(String[] args) {
		Integer userInputInt, pcInput;
		String userInput;
		
		System.out.print("Choose between rock/paper/scissors\n>>");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
	    map.put("rock", 0);
	    map.put("paper", 1);
	    map.put("scissors", 2);
	    
	    userInput = getUserInput();
	    userInputInt = map.get(userInput);
	    System.out.print("User chose: " + userInputInt);
	    pcInput = getPCInput();
	    System.out.println(" PC chose: " + pcInput);
	    System.out.print(">>");
	    computeWinner(userInputInt,pcInput);
		
	}

	private static void computeWinner(Integer userInput, Integer pcInput) {
		if(userInput.equals(pcInput)) {
			System.out.println("[~] DRAW!");
		}
		else if(userInput % 2 > pcInput) {
			System.out.println("[+] USER WINS!");
		}
		else {
			System.out.println("[-] PC WINS!");
		}
		
	}

	private static int getPCInput() {
		Integer max=2, min=0;
		int randomNumber = (int) ((Math.random() * (max - min)) + min);
		return randomNumber;
	}

	private static String getUserInput() {
		String userChoice;
		Scanner sc = new Scanner(System.in);
		userChoice = sc.nextLine();
		sc.close();
		return userChoice;
		
	}
}