package syntaxeDeBase;

public class MyArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		la 1er syntaxe  
		int [] firstArray = new int[5];
		 firstArray [0] = 10;
		 firstArray [1] = 20;
		 firstArray [2] = 30;
		 firstArray [3] = 40;
		 firstArray [4] = 50;
				 for( int value: firstArray ) {
			 System.out.println(value);
		 }
				 
				 System.out.println("2eme syntaxe");
				 
//			la 2eme syntaxe
		int [] secondArray = {10, 20, 30, 40, 50};
		for( int val : secondArray ) {
			System.out.println(val);
		}
		
//		tableau de string   
		String[] value = {"amina", "aya", "line", "nour"};
		for (String string : value) {
			
			System.out.println(string.toUpperCase());
			
		}
		
 
	}

}
