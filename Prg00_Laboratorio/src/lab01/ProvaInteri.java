package lab01;

public class ProvaInteri {
	int a,b;//di classe
	public static void main(String[] args) {
		int a,b; //locali
		final int RIGHE = 10;
		final int COLONNE = 10;
		
		a=4;
		b=4;
		
		for (int i = 1; i <= RIGHE; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i*j + "\t");
			}
			System.out.println();
			
		}
		
	}
}
