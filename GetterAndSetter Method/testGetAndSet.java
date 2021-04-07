package provaGetSet;

public class testGetAndSet {
	
	public static void main(String[] args) {
		
		/*
		 * Creo l'oggetto con cui usare le funzioni della classe 
		 * getterAndSetter,
	     *
		 * i parametri nell'oggetto verranno sostituiti da quelli
		 * nei metodi setAddendo1 e setAddendo2.
		 */
		GetterAndSetter prova1 = new GetterAndSetter(50.5, 14.4); // Posso parametrare gli addendi qui o con il metodo .setAddendo1 e 2
		
		/* 
		 * Passo all'oggetto le funzioni setter in cui poter
		 * parametrare i valori delle variabili
		 * addendo1 e addendo2.
		 */		 
		prova1.setAddendo1(76.8);
		prova1.setAddendo2(24.2);
		System.out.println("Il risultato é: " + prova1.getSomma());
	}
	
}
