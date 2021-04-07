package paroleChiavi;

public class Etichette {

	public static void main(String[] args) {
		
		
		esterno: //do l'etichetta al ciclo e lo chiamo "esterno"
		for(int i=0; i<5; i++) // Inizio il ciclo for
		{
			for(int j=0; j<5; j++)
			{
				if(j==3)
				{
					break esterno; // Interrompo "esterno" quando j é identico a 3
				} // Chiusura if
				
				System.out.print("*"); // Stampa riferita al ciclo annidato con var "j"
				
			} //  Chisura secondo ciclo for
			
			System.out.println(""); // Vado a capo
			
		} // Chiusura ciclo for esterno

	}

}
