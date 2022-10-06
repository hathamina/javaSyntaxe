package syntaxeDeBase;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EnumType {

	static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in)); // Pour permettre la saisie à partir de la console
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Feu feu = Feu.VERT;  // La variable feu est basée sur notre type énuméré
		
		System.out.println("Que voulez-vous faire ( passer , attendre ) : ");
		String action = keyboard.readLine();
		
//		On compare les états du type énuméré
		
		if (action.equals("passer")) {     // equals pour camparer les lettres 
			
			if( feu != Feu.VERT) {
				System.out.println("vous ne pouvez pas passer, car le feu n'est pas vert ");
			} else { 
				System.out.println("bonne route");
			}
			
			
		} else if (action.equals("attendre")) {

			if( feu == Feu.VERT) {
				System.out.println("vous devais passer, les autres attendent derrière vous ");
			}else {
				System.err.println("bonne initiative");
			}
		}else {
			System.out.println("commande inconnue");
		}
		
		
		

	}

}
