package Ejemplo;
import java.util.Scanner; //PIC
public class Sentenciaif2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		int numero ;
		System.out.println("intro un numero y te digo si es multiplo de 7:");
		numero = lector.nextInt();
	
	boolean multiplo7 = true; 
	
	if(numero % 7 == 0) {
		System.out.println("Múltiplo de 7");
	
	}
	else {
		System.out.println("No es múltiplo de 7");
	}
	
	lector.close();
	
	
	
	
	}

	
	
	
	
	
}
