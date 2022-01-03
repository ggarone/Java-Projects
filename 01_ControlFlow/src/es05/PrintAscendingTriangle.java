package es05;

public class PrintAscendingTriangle {
	public static void main(String args[]) {
		final int SIX = 6;
		int counter = 5;
		
		for (int i = 0; i < SIX; i++) {
			for (int j = 0; j < SIX - counter; j++) {
				System.out.print("#");
			}
			counter--;
			System.out.println();
		}
	}
}
