package stringhe;

public class ConfrontoStringhe {

	public static void main(String[] args) {
		
		String s1="java";
		String s2="java";
		String s3=new String("java");
		String s4=new String("java");
		
		// Questa comparazione é possibile solo con stringhe di tipo primitivo
		if(s1==s2) {
			System.out.println("Le stringhe sono uguali");
		}
		else
		{
			System.out.println("Le stringhe sono diverse");
		}
		
		// Nel metodo equals si fa la distinizaone anche per maj e minuscolo, e si può usare per comparare oggetti stringhe
		if(s3.equals(s4)) {
			System.out.println("Le stringhe sono uguali");
		}
		else
		{
			System.out.println("Le stringhe sono diverse");
		}
		
		
	}

}
