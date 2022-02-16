package Ejemplo;

import java.util.Scanner;

public class SentenciaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char opcion, continuidad;
		do {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduzca una opción: ");
		System.out.println("a.Sumar dos números");
		System.out.println("b. Pasar a binario");
		System.out.println("c. Calcular raíz cuadrada");
		
		
		opcion = lector.next().charAt(0);
		
		switch(opcion) {
			case 'a' :
				int n1 = 564;
				int n2 = 67;
				(n1 & n2);
				System.out.println();
				
			
				break;
			case'b' :
				int n3 = 2134;
				String binario = Integer.toBinaryString(n3);
				System.out.println(n3 + " en binario =" + binario);
				break;
			case 'c':
				int n4 = 45;
				double raiz = Math.sqrt(n4);
				System.out.println("raiz ;" + raiz);
				
				
				break;
			default:
				System.out.println("Opción errónea");
				break;
		}
		System.out.println("Desea continuar?");
		continuidad=lector.next().charAt(0);
		}while (continuidad == 's');
	}
}
