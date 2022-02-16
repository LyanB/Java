package Ejemplo;

import java.util.Scanner;

public class sentenciaifelself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		float precioInicial; //Solicitamos por teclado
		float descuento;
		float preciofinal;
		int n = 0;
		char continuidad;
		
		do{
			
		Scanner lector = new Scanner(System.in);
		System.out.println("Introprecio;");
		
		precioInicial = lector.nextFloat();
		if(precioInicial <100) {
			descuento = 0;
			
		}
		else if(precioInicial>=100 && precioInicial<200) {
			descuento = precioInicial*0.1f; 
		}
		else if(precioInicial<300) {
			descuento = precioInicial*0.15f;
		}

		
		else {
			descuento = precioInicial*0.25f;
		}
		preciofinal = precioInicial - descuento;
		System.out.println("Precio final:" + preciofinal + "€");
		
		System.out.println("Desea meter más productos? s/n");
		continuidad = lector.next().charAt(0);
		}while(continuidad == 's');
		
			}
	}

	
