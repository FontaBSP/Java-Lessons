package stringhe;

public class Dichiarazione {

	public static void main(String[] args) {
		
		String s1="prima stringa";               // Variabile primitiva
		String s2=new String("seconda stringa"); // Oggetto
		String s3="";                            // Primitiva vuota
		String s4=new String();                  // Oggetto stringa vuoto
		
		s3 = "Stringa non più vuota";            // Riempio la stringa var primitiva vuota
		s4 = "Secondo esempio di stringa non più vuota"; // Riempio l'oggetto stringa vuoto
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}

}
