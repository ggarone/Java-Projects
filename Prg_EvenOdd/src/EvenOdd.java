import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd {

	public static void main(String[] args) throws IOException{
		System.out.println("Choose a number:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		int n = Integer.parseInt(input);
		if(n % 2 == 0){
			System.out.println("Number is even");
		}
		else{
			System.out.println("Number is odd");
		}
	}
}
