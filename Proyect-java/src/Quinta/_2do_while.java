package Quinta;

import java.util.Scanner;

public class _2do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		//_____----------------------------------------INCREMENTO
		int i =1;
		
		do {
			
			System.out.println(i);
			i++;
		}while(i<=10);
		//-------------------------------DECREMENTO
		int J =10;
		
		do {
			
			System.out.println(J);
			J--;
		}while(J>=1);
		//---------------------------CUANTOS NUMEROS QUIERES
		int l =1,contador;
		
		System.out.println("cuantos numeros quieres ingresar");
		contador = entrada.nextInt();	
		
		do {
			
			System.out.println(l);
			l++;
		}while(l<=contador);
		//------------------en six sac 2 en 2  o en 3 en 3
		int y =1,conta;
		
		System.out.println("cuantos numeros quieres ingresar");
		contador = entrada.nextInt();	
		
		do {
			
			System.out.println(y);
			y+=3;
		}while(y<=contador);
	}

}
