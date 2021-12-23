package lab01;

import java.util.Arrays;

public class ProvaArray2 {

	public static void main(String[] args) {
		final int lung = 7;
		String[] nani = {
			"pisolo",
			"eolo",
			"mammolo",
			"brontolo",
			"dotto",
			"gongolo",
			"cucciolo",
		};
		
		
		int lunghezza = nani.length;
		
//		int chooseRandomDwarf = (int)(Math.random() * nani.length);
//		System.out.println(nani[chooseRandomDwarf]);
		
		for (int i = 0; i < nani.length; i++) {
			if(nani[i].length() > 5)
				System.out.println(nani[i]);
		}
		System.out.println();
		Arrays.sort(nani);
		for (int i = 0; i < nani.length; i++) {
			System.out.println(nani[i]);
		}
	}

}
