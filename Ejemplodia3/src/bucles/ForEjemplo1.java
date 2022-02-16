package bucles;

public class ForEjemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//Algoritmo que determina si un número es perfecto
		//1. Sumar los divisores del número, excepto el mismo
		//2. Si la suma =número --> Perfecto
		
		int numero = 6;
		int suma = 0;
	for (int i = 1; i<numero;i++) {
	if (numero %i == 0) {
		suma = suma + i;
	}
	if(suma == numero) {
		System.out.println("número perfecto");
	}
	else {
		System.out.println("Número no perfecto"); 
	}
	}
	}
	
}
	


