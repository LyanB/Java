package arrices;

import java.util.Random;

public class MatricesEjemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []matriz = new int [20];
		matriz[0] = 10;
		matriz[1] = 3;
		matriz[9] = 6;
		//Posición cero
		System.out.println(matriz[0]);
		System.out.println(matriz[24]);
		//Excepciones, el programa no sabe hacer algo y se cierra
		
		
		for(int i = 0;i<25;i++) {
			System.out.print(matriz[i]+"");
		}
		int matrizAleatoria[] = new int[25];
		//La media de los elementos de la matriz
		for(int i = 0;i<matrizAleatoria.length;i++) {
			System.out.print(matriz[i]+"");
		}
		
		Random generador = new Random ();
		for(int i = 0;i<25;i++) {
		matrizAleatoria[i] = generador.nextInt(10);
		}
		
		System.out.println();
		System.out.println("Matriz con valores aleatorios");
		for(int i = 0; i<25;i++) {
			System.out.print(matrizAleatoria[i] + "");
		}
		
		int sumaAleatorios = 0;
		double media = 0;
		for(int i = 0; i<25; i++) {
			sumaAleatorios = sumaAleatorios + matrizAleatoria [i];
		}
		media = sumaAleatorios/25;
		
		}

}
