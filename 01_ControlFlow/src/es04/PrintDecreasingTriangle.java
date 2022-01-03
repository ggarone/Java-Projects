package es04;

public class PrintDecreasingTriangle {

	public static void main(String[] args) {
		final int SIX = 6;
		int counter = 0;
		
		for (int i = 0; i < SIX; i++) {
			for (int j = SIX; j > counter; j--) {
				System.out.print("*");
			}
			counter++;
			System.out.println();
		}

	}

}
