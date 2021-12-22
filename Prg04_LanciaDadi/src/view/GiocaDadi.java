package view;

import model.Dado;

public class GiocaDadi {
	public static void main (String[] args) {
		final int NUMERO_LANCI = 10000;
		int contaVittorie = 0;
		Dado d1 = new Dado();
		Dado d2 = new Dado(6,"rosso");
		Dado d3 = new Dado(6,"blu");
		
		long start = System.currentTimeMillis();
		contaVittorie = play(NUMERO_LANCI, contaVittorie, d1, d2, d3);
		long stop = System.currentTimeMillis();
		report(NUMERO_LANCI, contaVittorie, start, stop);
	}

	private static int play(final int NUMERO_LANCI, int contaVittorie, Dado d1, Dado d2, Dado d3) {
		for (int i = 0; i < NUMERO_LANCI; i++) {
			int res1 = d1.lanciaDado();
			int res2 = d2.lanciaDado();
			int res3 = d3.lanciaDado();
			System.out.print(i+"\r");
			if(res1 == res2 && res2 == res3) {
//				System.out.println("You won with " + res1 + " pair");
				contaVittorie++;
			}
			else {
//				System.out.println("You didn't win.\n d1: " + res1 + " d2: " + res2);
			}
		}
		return contaVittorie;
	}

	private static void report(final int NUMERO_LANCI, int contaVittorie, long start, long stop) {
		System.out.println("Rutime was " + (stop-start) + "ms");
		double percentage = ((double)contaVittorie/NUMERO_LANCI)*100;
		System.out.println("\nYou won " + contaVittorie + " times which is " + percentage + "%." );
	}
}
