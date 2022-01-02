package es04;
import java.util.Scanner;

public class Concatena {

	public static void main(String[] args) {
		final int NUMBEROFWORDS = 3;
		String[] words = new String[NUMBEROFWORDS];
		String result = "";
		
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < NUMBEROFWORDS; i++) {
			System.out.print("Insert word: \n>>");
			words[i] = sc.nextLine();
		}
		
		result = Concatenate(words);
		System.out.println(result);

	}

	private static String Concatenate(String[] words) {
		String result = "";
		for(String word : words) {
			result += word;
		}
		return result;
		
	}

}
