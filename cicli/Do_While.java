package cicli;

public class Do_While {

	public static void main(String[] args) {
		
		int j = 0;
		int i = 1;
		
		do
		{	// In ogni caso fai almeno una volta questo: incrementami j di 2.
			j+=2;
			System.out.print(j+", "); // Stampo una virgola per dividere i numefri.
		} while (j<10); // Mentre j è minore di 10, poi fermati. 
		
		System.out.println("");
		
		do
		{ // Incrementa i di 2 fino a quando è minore di nove.
			i+=2;
			System.out.print(i+", ");
		} while (i<9);
		
	} // chiusura main

} // chiusura classe
