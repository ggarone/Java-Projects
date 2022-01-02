package es03;

public class MezziCasuali {
	public static void main(String[] args) {
		double randomNumber=0.0;
		randomNumber = getRandomFloat();
		
		if(randomNumber < 0.5)
			System.out.println("Result is: " + randomNumber);
		else
			System.out.println("Result is:" + (randomNumber-0.5));
	}

	private static double getRandomFloat() {
		double random = Math.random();
		return random;
		
	}

}
