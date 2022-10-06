package syntaxeDeBase;

public class TypesEntiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int	counter = 10;
	counter ++;
	System.out.println(counter);
	counter --;
	System.out.println(counter);
	
	// Règles pour les nom de variables: caractères autorisés = lettres + chifres +  _ + $
	
	int var2 = 100;
	int nom_coplexe = 200;
	
	System.out.println(var2 + " - " + nom_coplexe);
	
	// les 4 types entiers
	
	//byte 1 octet  -> 128 .. 127
	
	byte monoOctet = 127;
	System.out.println(monoOctet);
	
	// short 2 octets  -> 32768 .. 32767
	
	short monShrt = 32767;
	System.out.println(monShrt);
	
	//int 4 octets
	
	int monInt = 1_000_000_000;
	System.out.println(monInt);
	
	//long 8 octets 
	
	long monLong = 10_000_000_000L; // il faur le typer par L ou l 
	System.out.println(monLong);
	
	// 4 base en nuerique 
	int decmalValue = 100;    //                        10 digits 0 à 9
	int binairyValue = 0b101;// 5 exprimée en binaire   2 digits 0 et 1
	System.out.println(decmalValue + " - " + binairyValue);
	
	int octalValue = 010;   //8                        8 digits 0 à 7
	System.out.println(octalValue);
	
	int hexadecimalValue  = 0xff;   //255     16 digits 0 ..9 A .. f
	System.out.println(hexadecimalValue);
	
	// les operateurssur valeurs entieres : ++ --   + - * / %  += -= /= %=   // % il te donne le reste de la division 
	
	int a = 5; 
	int b = 3;
	int result = a+b;
	System.out.println(result);
	
	int currentValue = 1 ; 
	currentValue += 5; // currentValue = Currentvalue + 5 
	System.out.println(currentValue);
	
	
	

	}

}



