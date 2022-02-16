package bucles;

public class WhileEjemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Programa que detecte el primer numero múltilo de 3 y 7
		//en un determinado intervalo.
		int limiteInferior = 100;
		int limiteSuperior = 200;
		
		int i = limiteInferior;
		boolean encontrado = false;
		
		
		while(i<=limiteSuperior) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.println("Primer múltiplo de 3 y 7:" + i);
				encontrado = true;
				break;
			}
				i++;
			}
		if(!encontrado) {
			System.out.println("No hay números múltiplos de 3 y 7");
		}
	}
}
