package bucles;

public class ForEjemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//Algoritmo que determina si un n�mero es perfecto
		//1. Sumar los divisores del n�mero, excepto el mismo
		//2. Si la suma =n�mero --> Perfecto
		
		int numero = 6;
		int suma = 0;
	for (int i = 1; i<numero;i++) {
	if (numero %i == 0) {
		suma = suma + i;
	}
	if(suma == numero) {
		System.out.println("n�mero perfecto");
	}
	else {
		System.out.println("N�mero no perfecto"); 
	}
	}
	}
	
}
	


