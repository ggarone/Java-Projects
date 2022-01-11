package view;

import java.util.Random;

import model.Punto;
import model.Quadrato;
import model.Rettangolo;
import model.Segmento;
import model.Triangolo;

public class GeometriaDemo {

	public static void main(String[] args) {
		Punto a = new Punto(2,3);
		Punto b = new Punto(6,3);
		Punto c = new Punto(6,6);
		
		Segmento ab = new Segmento(a,b);
		Segmento bc = new Segmento(b,c);
		Segmento ca = new Segmento(a,c);
		
		System.out.println(ab.lunghezza());
		System.out.println(bc.lunghezza());
		System.out.println(ca.lunghezza());
		
		Triangolo t = new Triangolo(a, b, c);
		System.out.println(t.perimetro());
		System.out.println(t.area());
		
		Rettangolo r = new Rettangolo(ab,bc);
		System.out.println(r.perimetro() + "\n" + r.area());
		
		Quadrato q = new Quadrato(ca);
		System.out.println(q.perimetro() + "\n" + q.area());
	}

}
