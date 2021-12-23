package view;

import java.util.Random;

import model.Punto;

public class GeometriaDemo {

	public static void main(String[] args) {
		final int LOOP = 100;
		int counter = 0,randomX=-1,randomY=-1;
		Punto random;
		Punto a = new Punto();
		Punto b = new Punto(5,6);
		
		Random r = new Random();
		
		while(randomX != 0 || randomY != 0) {
			randomX = r.nextInt(101);
			randomY = r.nextInt(101);
			random = new Punto(randomX,randomY);
			System.out.println("[" + counter + "]" + random.toString());
			counter++;
		}
		
//		System.out.println(a.toString());
//		System.out.println(b.toString());
	}

}
