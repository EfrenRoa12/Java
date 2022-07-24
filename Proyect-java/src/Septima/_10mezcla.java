package Septima;

import java.util.Scanner;

public class _10mezcla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LEER POR TECLADOS DOS TABLAS DE 10 METROS ENTEROS
				//Y MEZCLARLAS EN UNA TERCERA FORMA EL 
				//1 A ----1 B ---2 a ---2b-- etc.
				Scanner entrada = new Scanner(System.in);
				
				int a[], b[], c[];
				
				a = new int[10];
				b = new int[10];
				c = new int[20];
				
				
				System.out.println(" Digite los 10 elementos del arreglo: ");
				for(int i=0;i<10;i++) {
						System.out.print((i+1)+" digite un numero " );//SE UTILIZA I + 1 PARA NO EMPEZAR DE 0 SI NO APARTIR DE 1
						a[i] = entrada.nextInt();
						
				}
				System.out.println(" Digite el segundo arreglo de 10 elementos: ");
				for(int i=0;i<10;i++) {
						System.out.print((i+1)+" digite un numero " );//SE UTILIZA I + 1 PARA NO EMPEZAR DE 0 SI NO APARTIR DE 1
						b[i] = entrada.nextInt();
				}
				
				
				int j=0;
				//AQUI SE IMPRIME LOS NUMEROS EN SIX SAC*******************************************************************************************
				System.out.println(" los caracteres del arreglo son: ");
				for(int i=0;i<10;i++) {
					c[j] = a[i];//primer elemento
					j++;
					c[j] = b[i];//segundo elemento
					j++;
				}
				//***********************************************************************************************************************************
				System.out.println("el tercer arreglo es ");
				for(int i=0;i<20;i++) {
					System.out.print(c[i]+" ");
					
				}
	}

}
