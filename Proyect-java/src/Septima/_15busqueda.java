package Septima;

import java.util.Scanner;

public class _15busqueda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		// LEER 10 ENTEROS ORDENADOS CRECIENTEMENTE 
		//LEER N Y BUSCAR EN LA TABLA 
		//SE DEBE MOSTRAR LA POSICION EN UE SE ENCUENTRA 
		//SI NO ESTA INDICARLO CON UN MENSAJE
		int arreglo [],numero;
		
		boolean creciente = true;
		arreglo = new int[10];
		
		do {
			System.out.print("rellene el arreglo");
			for(int i=0;i<10;i++) {
				System.out.println("digite un numero ");
				arreglo[i] = entrada.nextInt();
			}
			for(int i=0;i<9;i++) {
				if(arreglo[i]<arreglo[i+1]) {
					creciente = true;
					
				}
				if(arreglo[i]>arreglo[i+1]) {
					creciente = false;
					break;
				
		}
		
		}
			if(creciente == false) {
				System.out.print("el arreglo esta desordenada ");
			}
		
		
	}while(creciente == false);
		System.out.print("digite el numero a buscar en el arreglo  ");
		numero = entrada.nextInt();
		int i = 0;
		while(i<10 && arreglo [i]<numero) {
			i++;
		}
		if(i==10) {
			System.out.print("numero no encontrado  ");
		}
		else {
			if(arreglo[i]==numero) {
				System.out.print("enla posicion "+i);
			}
			else {
				System.out.print(" numero no encontrado ");
			}
				
		}
			System.out.print("  ");
	}

}
