package es13;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NotesAverage {

	public static void main(String[] args) {
		final int DIM = 100;
		final int ITERATIONS = 5;
		int result=0,i;
		double average;
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("O", 10);
		map.put("B", 8);
		map.put("S", 6);
		map.put("I", 4);
		Integer[] notes = new Integer[DIM];
		System.out.print("Insert Note: \n>>");
		Scanner sc = new Scanner(System.in);
		
		for (i = 0; i < ITERATIONS; i++) {
			String userInput = sc.nextLine();
			if(map.containsKey(userInput)) {
				System.out.println(map.get(userInput));
				notes[i] = map.get(userInput);
				result += notes[i];
			}
			System.out.print(">>");
		}
		System.out.println(i);
		average = result / i;
		System.out.println("Average is: " + average);
		sc.close();

	}

}
