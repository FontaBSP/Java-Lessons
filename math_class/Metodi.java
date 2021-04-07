
public class Metodi {

	public static void main(String[] args) {
		// I metodi statici sono scritti in corsivo e iniziano con la maiuscola
		int a=Math.max(45,89); // Qual � il valore pi� grande tra i due valori?
		System.out.println("Il valore p� grande �: " + a + ".");
		
		int b=Math.min(32, 89); // Metodo per sapere qual � in num pi� piccolo
		System.out.println("Il valore p� piccolo �: " + b + ".");
		
		System.out.println("La radice di 25 �: " + Math.sqrt(25) + ".");
		
		System.out.println("Il valore assoluto di -10 � : " + Math.abs(10) + ".");
		
		System.out.println("Il quadrato di 5 �: " + Math.pow(5, 2) + "."); // 5 base, 2 esponente (5 alla seconda)
		
		// Stampo un numero a virgola mobile casuale, per avere un int con questo metodo usare conversione esplicita
		double d = Math.random(); // Con double funziona senza forzature
		// Aggingo uno per definire il range "fino a 15" altrimenti nell'esempio seguente arriver� solo fino a 14
		int e = (int)(Math.random()*15+1); // Valendo int non instanziato "0" di default, lo moltiplico dopo averlo forzato definendo un range
		System.out.println(d);
		System.out.println(e);
		
	}
	
}
