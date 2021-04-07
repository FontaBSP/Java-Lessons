package LezioniArray;

public class ArrayFrastagliato {

	public static void main(String[] args) {

		int a[][]=new int[3][]; //Nel frastagliato specifico dopo le colonne (le righe sono obbligatorie)
		
		a[0]=new int[3]; // La riga 0 deve essere composta da 3 colonne
		a[1]=new int[2]; // La 1 da 2
		a[2]=new int[5]; // E la 2 da 5.
		
		//Inizializzo la riga 0 (quindi con 3 colonne)
		a[0][0]=96;
		a[0][1]=23;
		a[0][2]=69;
		
		//Inizializzo la riga 1 (quindi con 2 colonne)
		a[1][0]=11;
		a[1][1]=58;
		
		//Inizializzo la riga 2 (quindi con 5 colonne)
		a[2][0]=78;
		a[2][1]=61;
		a[2][2]=52;
		a[2][3]=41;
		a[2][4]=85;
		
		for(int i=0; i<a.length; i++)
			{
				for(int j=0; j<a[i].length; j++) // Quando la i sarà 0 calcola lunghezza di a[0], quando sarà i di a[1] ecc...
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println(); // Mando a capo ogni giro del ciclo
		}
	}

}
