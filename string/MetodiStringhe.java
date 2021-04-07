package stringhe;

public class MetodiStringhe {
	public static void main (String[] args) {
		
		String s1 = "esempi metodi";
		
		int l=s1.length();
		System.out.println("La lunghezza della stringa '" + s1 + "' é di " + l + " caratteri.");
		
		char c[] = {'j','a','v','a'};          // Creo un arrai di char
		
		String s2=new String(c);               // Passa l'array di char alla stringa
		System.out.println(s2.toUpperCase());  // Restituisce "Java". (toUpperCase trasforma in maiuscolo)
		
		char carattere=s2.charAt(2);
		System.out.println("IL carattere alla posizione 2 é: " + "\"" + carattere + "\".");
		
		int posizione=s2.indexOf(carattere); // Si riferisce al metodo precedente "charAt(2)"
		System.out.println("La lettera V si trova alla posizione: " + posizione);
		
		String sottostringa=s2.substring(0, s2.indexOf('v')+1);
		System.out.println("La sottostringa della stringa " + s2 + " é: " + sottostringa);
		
		String sottostringhe2=s2.substring(s2.lastIndexOf('j')); // Parte dalla lettera definita nell'ultima parentesi
		System.out.println("La seconda sottostringa è: " + sottostringhe2);
		
		
	}
}
