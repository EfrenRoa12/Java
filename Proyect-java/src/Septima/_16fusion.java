package Septima;

import java.util.Scanner;

public class _16fusion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// TODO Auto-generated method stub
		// LEER DOS SERIES DE 10 ENTEROS QUE ESTARAN ORDENADOS CRECIENTEMENTE
				//COPIAR (FUSIONAR) LAS DOS TABLAS EN UNA TERCERA DE FORMA QUE SIGAN ODRDENADOS
				int a[],b[],c[];
				boolean creciente = true;
				
				a = new int[10];
				b = new int[10];
				c = new int[20];
				
				System.out.println("digite el primer el arreglo ");
				do {
					for(int i=0;i<10;i++) {
						System.out.print((i+1)+" digite un numero");
						a[i] = entrada.nextInt();	
					}
					
					//comprobamos si el arreglo esta ordenado en orden creciente
					for(int i=0;i<9;i++) {
						if(a[i] < a[i+1]){//creciente
							creciente = true;
						}
						if(a[i] > a[i+1]){//creciente
							creciente = false;
							break;
						}
					}
					
					if(creciente == false) {
						System.out.println(" el arreglo esta desordenado vuelva a digitar");
					}
					
				}while(creciente == false );
				
				System.out.println("digite el segundo arreglo ");
				do {
					for(int i=0;i<10;i++) {
						System.out.print((i+1)+" digite un numero");
						b[i] = entrada.nextInt();	
					}
					
					//comprobamos si el arreglo esta ordenado en orden creciente
					for(int i=0;i<9;i++) {
						if(b[i] < b[i+1]){//creciente
							creciente = true;
						}
						if(b[i] > b[i+1]){//creciente
							creciente = false;
							break;
						}
					}
					if(creciente == false) {
						System.out.println(" el arreglo esta desordenado vuelva a digitar");
					}
					
			}while(creciente == false );
			
				int i=0;
				int j=0;
				int k=0;
				
				while(i<10 && j<10) {
					if(a[i]<b[j]) {
						c[k] = a[i];
						i++;
					}
					else {
						c[k]=b[j];
						j++;
					}
					k++;
				}
				if(i==10) {
					while(j<10) {
						c[k] = b[j];
						j++;
						k++;
					} 
				}
				else {
					while(i<10) {
						c[k] = a[i];
						i++;
						k++;
					}
				}
				System.out.println("el arreglo c completo es: ");
				for(k=0;k<20;k++) {
					System.out.println(c[k]+" ");
				}
				System.out.println(" ");
	}

}
