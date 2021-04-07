package LezioniArray;

public class ArrayTridimensionale {

	public static void main(String[] args) {

		int a[][][]= new int[2][2][2];
		
		a[0][0][0]=78;
		a[0][0][1]=45;
		a[0][1][0]=32;
		a[0][1][1]=96;
		a[1][0][0]=78;
		a[1][0][1]=45;
		a[1][1][0]=32;
		a[1][1][1]=96;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length; j++)
			{
				for(int z=0; z<a[0][0].length; z++)
				{
					System.out.print(a[i][j][z]+" ");
				} // chiudo z
			} // chiudo j
			System.out.println();
		} // chiudo i
		
		for(int s=0; s<3; s++)
		System.out.println("");
		
		
	
	int b[][][]= new int[2][2][2];
		
		b[0][0][0]=8;
		b[0][0][1]=5;
		b[0][1][0]=2;
		b[0][1][1]=6;
		b[1][0][0]=7;
		b[1][0][1]=4;
		b[1][1][0]=3;
		b[1][1][1]=9;
		
		// Secondo metodo di stampa dell'array tridimensionale con il ciclo foreach
		for(int i[][] : b)
		{
			for(int j[] : i)
			{
				for(int z : j)
				{
					System.out.print(z+" ");
				}
			}
			System.out.println();
		}
		
	}

}
