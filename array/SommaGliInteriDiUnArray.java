package es;

public class SommaGliInteriDiUnArray {

	public static void main(String[] args) {
		
		int sum[] = {12, 23, 45, 21};   // Dichiaro (inline) l'array da sommare
		int somma = 0;                  // Inizializzo a zero una variabile per la somma che userò dopo

		for(int i=0; i<sum.length; i++) // Ciclo l'array con il metodo .length
		{
			somma = somma+sum[i];       // Do le istruzioni al ciclo for inserendo un addizione tra ogni vettore
		}	
			// Stampo la variabile che avevo inizializzato a zero utlizzandola poi nel for per sommare ogni vettore: 
			System.out.print("La somma dei vettori nell'array é: " + somma + ".");
			
			
			/* Il programma fa questo:
			 *
			 * for(i, che vale attualmente 0, é minore della lunghezza di sum, quindi incremento "i" fino alla fine della "lunghezza" di sum)
			 *     { 	
			 * 		Ma la incremento così:
			 * 		0 + 12 + 23 + 45 + 21
			 *     }
			 * 
			 */
	}

}
