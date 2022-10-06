package syntaxeDeBase;

public class IncDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		a++;
		System.out.println(++a); //préfixé=> incrément est effectué avant utilisation de la variable donc il nous donne rsult 11
		
		a = 10;
		System.out.println(a++); //podtfixé=> incrément est effectué apré utilisation de la variable donc il nous donne rsult 10 
		System.out.println(a);    // puis il nous donne 11 -- il donne la valeur de a après a valeur de l incrementation 
		
		
		int part1 = 10;
		int part2= 20;
		int result = part1++ + part2++; // il nous donne la valeur de part1 + la valeur de part2 càd 30
		System.out.println(result);
		
		int part3 = 10;
		int part4= 20;
		int result1 = ++part3 + ++part4; // il va nous donnerla valeur de part2 incrementer + la valeur de part4 incrementer càd = 32
		System.out.println(result1);
		
		

	}

}
