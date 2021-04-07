package stringhe;

public final class StringCreator {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder();
		
		System.out.println("Prima string builder: " +sb);
		System.out.println("Capacità iniziale: " + sb.capacity());
		System.out.println("Lunghezza iniziale :" + sb.length());
		
		StringBuilder sb1=new StringBuilder("Seconda stringbuilder modificabile");
		System.out.println("\nSeconda string builder: " +sb1);
		System.out.println("Capacità finale: " + sb1.capacity());
		System.out.println("Lunghezza finale:" + sb1.length());
		
		sb1.append(", esempio numero 1");
		System.out.println("\nSeconda stringbuilder: " +sb1);
		
		sb1.insert(sb1.indexOf(","), " di tipo stringbuilder"); // Inserisce stringa nella posizione specificata
		System.out.println("\nSeconda string builder: "+sb1);
		
	}

}
