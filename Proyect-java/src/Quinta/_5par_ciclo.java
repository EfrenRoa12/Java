package Quinta;

import java.util.Scanner;

public class _5par_ciclo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		// TODO Auto-generated method stub
		//incremento
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		//decremento
		
		for(int j=1;j>=1;j--) {
			System.out.println(j);
		}
		//------------------------------
		//cuantos numeros quiere impromir
		int contador;
		
		System.out.println("digite la cantidad de terminos: ");
		contador = entrada.nextInt();
		
		
		for(int l=1;l<=contador;l+=2) {//numeros pares
		
			System.out.println(l);
	} 
	}

}
