package es;

public class SetteLettereRandom {
	
 public static void main(String[] args) {
	 
	 char[] c = new char[7];
	 
	 String parola;
	 // Clacolo in refiremnto alla tabella ascii
	 for(int i=0; i<c.length; i++)
		 c[i]=(char)(Math.random()*26+79);
	 
	 parola = new String(c);
	 System.out.println(parola);
	 
	 if(parola.contains("c"))
		 System.out.println("La parola creata contiene la lettera \"C\".");
	 else
		 System.out.println("La parola creata NON contiene la lettera \"C\".");
 }
 
}
