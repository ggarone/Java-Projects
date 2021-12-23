package lab01;

public class ProvaArray {

	public static void main(String[] args) {
		final int lung = 7;
		String[] nani = new String[lung];
		
		nani[0] = "pisolo";
		nani[1] = "eolo";
		nani[2] = "mammolo";
		nani[3] = "brontolo";
		nani[4] = "dotto";
		nani[5] = "gongolo";
		nani[6] = "cucciolo";
		
		int lunghezza = nani.length;
		
//		int chooseRandomDwarf = (int)(Math.random() * nani.length);
//		System.out.println(nani[chooseRandomDwarf]);
		
		for (int i = 0; i < nani.length; i++) {
			if(nani[i].length() > 5)
				System.out.println(nani[i]);
		}

	}

}
