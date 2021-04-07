package cicli;

public class While {
public static void main(String[] args) {
		
		int i=1;
		int j=2;
		
		//"mentre"(i è minore di 10)
		while(i<10) 
		{   // Stampa la variabile i divisa dal segno "-" se nminore di 10:
			System.out.print(i+(i<9? "-":""));
			// Incremento di 2 partendo dall'1 per stampare i num dispari dall'1 fino al 9 
			i+=2;
		}
		// Mando a capo
		System.out.println("");
		while(j<11)
		{	// Stampa la variabile j divisa dal segno "-" se nminore di 11:
			System.out.print(j+(j<9? "-":""));
			// Incremento di 2 partendo dal 2 per stampare i num pari fino al 10
			j+=2;
		}
		
	}

}