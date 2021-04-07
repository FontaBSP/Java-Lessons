package paroleChiavi;

public class interrompi {

	public static void main(String[] args) {
		
		
		// Il break
		for(int i=0; i<10; i++)
		{
			if(i==5)
			{
				System.out.println("Sono entrato nell'if, faccio un \"break\" nel 5 e ricomincio"); // Verifico la condizione vera
				break;
			}

			System.out.println(i);
		}
		
		System.out.println("");
		
		//Il continue
		for(int j=0; j<10; j++)
		{
			if(j==5)
			{
				System.out.println("Sono entrato nel secondo if e \"continuo\" oltre il 5"); // Verifico la condizione vera
				continue; // Conta tutto tranne il 5, perché gli sto dicendo di saltarlo quando j é identico a 5 col "continue"
			}

			System.out.println(j);
		}

	}

}
