package es;

public class ConcatenazioneNomeMajCognomeMin {

	public static void main(String[] args) {
		
		String name = "Andrea";
		String sur = "Fontanini";
		
		String parziale = name.toUpperCase();
		String parziale2 = sur.toLowerCase();
		
		parziale=parziale.concat(parziale2);
		System.out.println(parziale);
		// Viceversa inline
		System.out.println(parziale.substring(0,6).toLowerCase().concat(parziale2.toUpperCase()));
	}

}
