package Septima;

import java.util.Scanner;

public class _9tabla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner entrada = new Scanner(System.in);
				int a[], b[], c[],d[];
				
				a = new int[10];
				b = new int[10];
				c = new int[10];
				d = new int[30];
				
				
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
				System.out.println(" Digite el tercer arreglo de 10 elementos: ");
				for(int i=0;i<10;i++) {
						System.out.print((i+1)+" digite un numero " );//SE UTILIZA I + 1 PARA NO EMPEZAR DE 0 SI NO APARTIR DE 1
						c[i] = entrada.nextInt();
				}
				
				
				int j=0;
				//AQUI SE IMPRIME LOS NUMEROS EN SIX SAC*******************************************************************************************
				System.out.println(" los caracteres del arreglo son: ");
				for(int i=0;i<10;i++) {
					d[j] = a[i];//primer elemento
					j++;
					d[j] = b[i];//segundo elemento
					j++;
					d[j] = c[i];//tercer elemento
					j++;
				}
				//***********************************************************************************************************************************
				System.out.println("el arreglo es ");
				for(int i=0;i<30;i++) {
					System.out.print(d[i]+" ");
					
				}
	}

}
