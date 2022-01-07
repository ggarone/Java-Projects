package es06;

public class AscendingAndDescendingString {

	public static void main(String[] args) {
		final int DIM = 6;
		Integer counterRight = DIM;
		Integer counterLeft = 2;
		Integer spaces = DIM;
		
		
		for (int i = 0; i < DIM; i++) {
			for (int k = 1; k < counterLeft; k++) {
				System.out.print(k);
			}
			
			System.out.print("\t");
			while(spaces != counterRight) {
				System.out.print(" ");
				spaces--;
			}
			
			for (int j = counterRight; j > 0; j--) {
				System.out.print(j);
			}
			
			System.out.println();
			counterRight--;
			counterLeft++;
			spaces = DIM;
		}
	}
}
