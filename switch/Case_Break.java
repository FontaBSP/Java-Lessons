package casebreak;

public class Case_Break {

	public static void main(String[] args) {
		
		// if in una riga di codice con l'operatore ternario
		int a = 10;
		System.out.println(a>=10? "a>=10":"a<10");
		
		// Switch prende in considerazione solo dei tipi di dato: numeri byte, short, int.
		// Switch prende in considerazione solo dei tipi di dato: Caratteri Char.
		// No Float, No Double, No Booleani.
		// opzionali nelle parentesi quadre [break, default]
		
	int n = 4;
		
	switch(n) 
	{
		case 1:
			System.out.println("n=1");
			break;
		case 2:
			System.out.println("n=2");
			break;
		case 3:
			System.out.println("n=3");
			break;
		case 4:
			System.out.println("n=4");
			break;
		case 5: // SE non ci fosse il break andrebbe avanti a stamparmi tutti i casi oltre il primo true.
			System.out.println("n=5");
			break;
		case 6:
			System.out.println("n=6");
			break;
		case 7:
			System.out.println("n=7");	
			
	}

} // main
	
	
	
} // Classe
