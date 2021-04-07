package implementazioniCollection;

import java.util.*;

public class ImplementazioneSet {

	public static void stampa(Collection<String> c, String tipo) {
		System.out.println("Ecco i dati dentro la collezione di tipo "+tipo);
		
		int i=1;
		
		for(String s:c)
		{
			System.out.print(s+" ");
			if(i%10==0)
				System.out.println();
			i++;
		}
		
	}
	
	public static void main(String[] args) {
		
		//Array di stringhe
		String nomi[]= {
				"Mario","Giovanni","Teresa","Agata","Vanessa","Angelo","Mimmo","Carlo","Mariottide","MedioMan",
				"Andrea","Giorgione","BillyBallo","Anna","Massimo","Gabriella","Federica","Giovanna","Gino","Mariliana",
				"Concetta","Lucia","Luciano","Giusezze","Lorienza","Teresina","Tiziana","Federico","Manuel","Bastian","Gigione"	
		};
								 /* Aumento la capacità: Cpacità iniziale, fattore di caricamento( = float)
								  * significa che quando arriverà al 60% di 25 aumenterà la capacità
								  * che non se non viene parametrata sarà 16 di default
								  */
		Set<String> hs= new HashSet<>(25,0.6f);
		for(String s1:nomi) // Ciclo avanzato che scorre l'array "nomi"
			hs.add(s1); // Aggiungi s1 all'interno dell'HashSet
		
		Set<String> ts=new TreeSet<>(hs); //Passo in ingresso la collezione
		Collection<String> a =Arrays.asList(nomi); // Creo una collection di stringhe e la chiamo "a" e utilizzo l'oggetto Arrays e trasformo nomi in collezione+
		Set<String> lhs=new LinkedHashSet<>(a);
		
		
		stampa(hs,"HashSet");			// Non ha un concetto di ordinamento, stampe nell'ordine deciso dall'HashSet 
		System.out.println();
		System.out.println();
		stampa(ts,"TreeSet");			// TreeSet "Set ordinato": Stampa in oridne alfabetico
		System.out.println();
		System.out.println();
		stampa(lhs,"LinkedHashSet");	// "Come scritto": Stampa nell'ordine in cui ho inserito io i dati nell'array
	} 
	
}
