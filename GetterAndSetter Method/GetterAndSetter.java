package provaGetSet;

public class GetterAndSetter {
	
	// Creo le variabili di istanza.
 private double addendo1, addendo2;
 
 
 	// Creo il metodo costruttore.
	public GetterAndSetter(double addendo1, double addendo2) {
		this.addendo1 = addendo1;
		this.addendo2 = addendo2;
	}
	
	// Metodi getter che mi restituiranno le variabili.
	double getAddendo1(){
		return addendo1;
	}
	
	double getAddendo2(){
		return addendo2;
	}
	
	// Metodi setter che mi permetteranno di "settare" i valori delle variabili d'istanza.
	public void setAddendo1(double addendo1) {
		this.addendo1 = addendo1;
	}

	public void setAddendo2(double addendo2) {
		this.addendo2 = addendo2;
	}
	
	// Semplice metodo per il risultato della somma delle due variabili d'istanza.
	double getSomma() {
		return addendo1+addendo2;
	}
	
}
