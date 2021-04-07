package LezioniArray;

public class ArrayMultidimensionale {

	public static void main(String[] args) {
		
		int a[][]; // Dichiaro array multidimensionale
		
		a=new int[3][2]; // Creazione array multidimensionale 3 righe e 2 colonne
		
		// Inizializzo l'array multidimensionale
		a[0][0]=56;
		a[0][1]=34;
		a[1][0]=20;
		a[1][1]=23;
		a[2][0]=13;
		a[2][1]=44;
		
		// Per stampare righe e colonne dell'array avrò bisogno di 2 cicli
		for(int i=0; i<a.length; i++)
		{
	// Considerando ogni riga come un array monodimensionale, nel secondo "for" usero .length su a[0]
			for(int j=0; j<a[0].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println("");
		}
		
		System.out.println("");
		
		
		
		int b[][]= {{78,45,12},{36,25,14},{48,15,26},{68,35,24}}; // Multidimensionale inline
		
		
		/*
		 * Creo un for che scorra l'array monodimensionale,
		 * e al suo interno un ulteriore for che scorrà tutti i monodimensionali
		 * (da qui diventerà multidimensionale). 
		 */
		
		for(int x[] : b) // Il primo for ci restutirà la riga dell'array monodimensionale, quindi bisogna usare le []
		{
			for(int y:x) // Il secondo for restituirà il singolo valore che va a scorrere(ciclare) l'array monodimensionale x
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
