package view;

import java.util.Scanner;

public class Gioco {

	public static void main(String[] args) {
		// sequenza, selezione, iterazione
		String risultato = "";
		String sceltaPC = "";
		String sceltaUmano = "";
		int vittorieUmano = 0;
		int vittoriePC = 0;
		int numeroPartite = 5;

		for(int i=0; i<numeroPartite; i++){
			sceltaPC = sceltaCasualePC();
			sceltaUmano = sceltaUmano(); 
			System.out.println("PC chose " + sceltaPC);
			//System.out.println("Il valore di i e': " + i);
			risultato = valutaScelte(sceltaPC,sceltaUmano);
			if(risultato.equals("HUMAN WINS")) {
				vittorieUmano += 1;
			} else if(risultato.equals("PC WINS")) {
				vittoriePC += 1;
			}
			System.out.println(risultato);

			System.out.println("partite giocate: " + i+1);
			System.out.println("vittorie umano: " + vittorieUmano);
			System.out.println("vittorie macchina: " + vittoriePC);
		}
	}

	private static String valutaScelte(String sceltaPC, String sceltaUmano) {
		String res = "";
		if (sceltaUmano.equals(sceltaPC)){
			res = "DRAW";
		} else {
			if(sceltaUmano.equals("pietra")){
				if(sceltaPC.equals("forbici")){
					res = "HUMAN WINS";
				}
				else{
					res = "PC WINS";
				}
			} else if(sceltaUmano.equals("forbici")){
				if(sceltaPC.equals("carta")){
					res = "HUMAN WINS";
				}
				else{
					res = "PC WINS";
				}
			} else if(sceltaUmano.equals("carta")){
				if(sceltaPC.equals("pietra")){
					res = "HUMAN WINS";
				}
				else{
					res = "PC WINS";
				}
			}
		}

		return res;
	}

	private static String sceltaUmano() {
		System.out.print("Scegli tra p:pietra f:forbici c:carta \n>>");
		Scanner sc = new Scanner(System.in);
		String risposta = sc.nextLine();
		return risposta;
	}

	private static String sceltaCasualePC(){
		String scelta = "";
		double casuale = Math.random();
		if(casuale < 0.33) {
			scelta = "pietra";
		}
		else if(casuale < 0.66) {
			scelta = "forbici";
		}
		else {
			scelta = "carta";
		}
		return scelta;
	}
}
