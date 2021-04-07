package LezioniArray;

public class ArrayMonodimensionale {

	public static void main(String[] args) {
		
		// Si dichiara scrivendo il tipo di array (int, char, double, ecc...)
		// Specifico il nome e poi le parentesi quadre aperte e chiuse (posso mettere le quadre anche prima del nome se voglio+
		// Per crearlo: nome=new tipo[numero di elementi qui]
		
		int []mioArray; // Dichiaro array
		mioArray = new int[5]; // Creo array
        
		int []secondoArray = new int[3]; // Dichiaro e creo insieme ( questo è un metodo di creazione array alternativo)
		
		char terzoArray[] = new char[4]; // Dichiaro un terzo array di char
		
		
		System.out.println("");
		System.out.println("valori array dichiarato inline: ");
		// Inizializzo un array inline
		int quartoArray[] = {42, 64, 57, 77, 78};
		// Lo stampo con un for avaznato (foreach)
		for(int s:quartoArray)
			System.out.println(s);
		System.out.println("____________________");
	
		
		System.out.println("");
		System.out.println("valori mioArray: ");
		//Inizializzo il mioArray;
		mioArray[0]=12;
		mioArray[1]=45;
		mioArray[2]=95;
		mioArray[3]=97;
		mioArray[4]=47;
		//Stampo l'array usando un ciclo for
		for(int i=0; i<mioArray.length; i++) //Uso il metodo .length per definire la lunghezza dell'array nel for
			System.out.println(mioArray[i]);

		// Inizializzo solo il primo spazio del secondoArray
		secondoArray[0]=44;
		System.out.println("____________________");
		
		
		System.out.println("");
		System.out.println("valori secondoArray: ");
		
		//Cosa succede se stampo secondoArray senza inizializzare?
		for(int j=0; j<secondoArray.length; j++)
			System.out.println(secondoArray[j]); // Inzializzera gli spazi inizializzati a "0".
		System.out.println("____________________");
		
		System.out.println("");
		System.out.println("valori array di char: ");
		
		// Inizalizzo terzoArray con caratteri "char"
		terzoArray[2]='s';
		terzoArray[3]='e';
		// Uso un foreach per stamparne i valori
		for(char x:terzoArray)
			System.out.println(x); // I valori "char" non inizializzati vengono stampati nel loro ordine ma vuoti
		System.out.println("____________________");
		
		
		System.out.println("");
		System.out.println("valori mioArray al contrario: ");
		
		// Stampo l'array partendo dlla fine usando un ciclo for standard (con l'avanzato non posso fare questa cosa)
				for(int i=mioArray.length-1; i>=0; i--) // Uso il metodo .length per definire la lunghezza dell'array nel for
					System.out.println(mioArray[i]);
				
	}

}
