package implementazioniCollection;

import java.util.*;

public class ImplmentazioneSet2 {

	public static void main(String[] args) {
		/* Setto l'enumerazione con tipo di dati: "<GiorniSettimana>" chiamandola "tutti"
		 * .allOff vuole una classe, essendo l'enum una sottospecie di classe passo GiorniSettimana come classe
		 */
		EnumSet<GiorniSettimana> tutti=EnumSet.allOf(GiorniSettimana.class);
		EnumSet<GiorniSettimana> vuota=EnumSet.noneOf(GiorniSettimana.class); //con .noneOf trasformo in classe vuota 
		EnumSet<GiorniSettimana> intervallo=EnumSet.range(GiorniSettimana.martedì, GiorniSettimana.sabato); // Con .range scelgo un range da un nome ad un altro paramerandolo
		EnumSet<GiorniSettimana> alcuni=EnumSet.of(GiorniSettimana.sabato, GiorniSettimana.martedì, GiorniSettimana.giovedì);
		
		
		for(GiorniSettimana gs:tutti) //Creo il for avanzato gs che scorre "tutti".
			System.out.println(gs+" ");
		
		System.out.println();
		System.out.println();
		
		for(GiorniSettimana gs:alcuni)
			System.out.println(gs+" ");
		
	}

}
