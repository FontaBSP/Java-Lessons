
public class Metodi {

	public static void main(String[] args) {
		// I metodi statici sono scritti in corsivo e iniziano con la maiuscola
		int a=Math.max(45,89); // Qual è il valore più grande tra i due valori?
		System.out.println("Il valore pù grande é: " + a + ".");
		
		int b=Math.min(32, 89); // Metodo per sapere qual é in num più piccolo
		System.out.println("Il valore pù piccolo é: " + b + ".");
		
		System.out.println("La radice di 25 é: " + Math.sqrt(25) + ".");
		
		System.out.println("Il valore assoluto di -10 é : " + Math.abs(10) + ".");
		
		System.out.println("Il quadrato di 5 é: " + Math.pow(5, 2) + "."); // 5 base, 2 esponente (5 alla seconda)
		
		// Stampo un numero a virgola mobile casuale, per avere un int con questo metodo usare conversione esplicita
		double d = Math.random(); // Con double funziona senza forzature
		// Aggingo uno per definire il range "fino a 15" altrimenti nell'esempio seguente arriverà solo fino a 14
		int e = (int)(Math.random()*15+1); // Valendo int non instanziato "0" di default, lo moltiplico dopo averlo forzato definendo un range
		System.out.println(d);
		System.out.println(e);
		
	}
	
}
