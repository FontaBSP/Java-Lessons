package es;

public class ConcatenazioneTreLettereNomeCognome {

	public static void main(String[] args) {

		String name = "Andrea";
		String sur = "Fontanini";
		
		String parziale = name.substring(0,3);
		String parziale2 = sur.substring(0,3);
		
		parziale=parziale.concat(parziale2);
		System.out.println(parziale);

	}

}
