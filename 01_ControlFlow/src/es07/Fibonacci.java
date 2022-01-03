package es07;

public class Fibonacci {

	public static void main(String[] args) {
		final int DIM = 100;
		long[] fibonacci = new long[DIM];
		fibonacci = ComputeFibonacci(DIM);
		
		for(long number : fibonacci)
			System.out.print(number + " ");

	}

	private static long[] ComputeFibonacci(int DIM) {
		long[] fibonacci = new long[DIM];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for (int i = 2; i < DIM-2; i++) {
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
		}
		return fibonacci;
	}

}
